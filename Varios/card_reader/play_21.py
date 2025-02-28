'''
Play a match of blackjack using card scanning to determine winning probabilities.\n
Requires a csv generated by the scan_cards.py script.\n
Press A to add the card to your hand and R to remove it from the pool, Q to exit.
Author: Leah Castro.\n
No copiar, no distribuír y definitivamente refactoricen antes de subirlo.
'''

import cv2 as cv
from time import perf_counter
from cards import *
import keyboard

#Keyboard functions
def display_chance(deck, pool):
    deck_val = sum([VALUES[card[0]] for card in deck])
    favorable = [card for card in pool if VALUES[card[0]] <= 21 - deck_val]
    chance = format(len(favorable) / len(pool))
    print(f"your chance of success is: {chance}")

def handle_key_input(key):
    key_n = key.name
    if not in_cam is None:
        if key_n == 'a':
            deck.append(in_cam)
            deck_val = sum([VALUES[card[0]] for card in deck])
            print(f"Current deck: {deck}, value: {deck_val}")
            pool.remove(in_cam)
            display_chance(deck, pool)

        elif key_n == 'r':
            pool.remove(in_cam)
            print(f"Removed card {in_cam} from pool")
            display_chance(deck, pool)

keyboard.on_press(handle_key_input)
card_scan = scanner(200, 0.3, 0.1, 0.142)
card_find = card_interpreter('/home/churra/Documents/Programas/Python/card_reader/sorted_corners.csv', card_scan)

CAP_DEVICE = 2
FRAME_COUNT = 50 #number of frames that the scanner uses to identify cards
IDLE_TIME = 2 #time when no detection occurs after showing a card
VALUES = {
    'A':1,
    '2':2,
    '3':3,
    '4':4,
    '5':5,
    '6':6,
    '7':7,
    '8':8,
    '9':9,
    '10':10,
    'J':11,
    'Q':12,
    'K':13
}

#Runtime variables
deck = []
frame_corners = []
corner_count = []
rec_frames = 0
idle = perf_counter()
in_cam = None
pool = [card[0] for card in card_find.cards_list]
key_pressed = False

cap = initiate_capture(CAP_DEVICE)
while True:
    frame = get_frame(cap)
    card_scan.get_frame_modes(frame)

    #Check if there's a defined contour
    if not card_scan.get_card_edges(frame):
        frame_corners = []
        corner_count = []
        rec_frames = 0
        idle = perf_counter()
        in_cam = None
    else:
        if perf_counter() - idle > IDLE_TIME:

            frame_corners = card_scan.get_card_corners(frame)
            if frame_corners:        
                corner_count.append(len(frame_corners))
                rec_frames += 1

                if rec_frames >= FRAME_COUNT:
                    average = sum(corner_count) / rec_frames
                    in_cam = card_find.identify_card(frame_corners, average)
                    #reset variables
                    frame_corners = []
                    corner_count = []
                    rec_frames = 0

    cv.imshow('21', frame)
    if cv.waitKey(1) == ord('q'):
        break

# When everything done, release the capture
cap.release()
cv.destroyAllWindows()