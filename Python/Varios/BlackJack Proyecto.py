import cv2
import numpy as np
import random
from collections import defaultdict

# Card values (unchanged)
card_values = {
    'Ace': 11, '2': 2, '3': 3, '4': 4, '5': 5, '6': 6, '7': 7,
    '8': 8, '9': 9, '10': 10, 'Jack': 10, 'Queen': 10, 'King': 10
}

def create_deck():
    suits = ['Hearts', 'Diamonds', 'Clubs', 'Spades']
    ranks = list(card_values.keys())
    return [(rank, suit) for suit in suits for rank in ranks]

def calculate_hand_value(hand):
    value = sum(card_values[card[0]] for card in hand)
    aces = sum(1 for card in hand if card[0] == 'Ace')
    while value > 21 and aces:
        value -= 10
        aces -= 1
    return value

def calculate_probabilities(deck):
    total_cards = len(deck)
    probabilities = defaultdict(float)
    for card in deck:
        probabilities[card[0]] += 1 / total_cards
    return dict(probabilities)

def display_probabilities(probabilities):
    print("\nProbabilities for next card:")
    for card, prob in sorted(probabilities.items(), key=lambda x: x[1], reverse=True):
        print(f"{card}: {prob:.2%}")

def detect_card(frame):
    # This is a simplified card detection function
    # In a real implementation, you'd use more advanced computer vision techniques
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    _, thresh = cv2.threshold(gray, 127, 255, cv2.THRESH_BINARY)
    contours, _ = cv2.findContours(thresh, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)
    
    for contour in contours:
        area = cv2.contourArea(contour)
        if 20000 < area < 50000:  # Adjust these values based on your setup
            x, y, w, h = cv2.boundingRect(contour)
            card_img = frame[y:y+h, x:x+w]
            # Here you would implement card recognition (rank and suit)
            # For this example, we'll just return a random card
            return random.choice(list(card_values.keys()))
    
    return None

def play_blackjack():
    deck = create_deck()
    random.shuffle(deck)
    
    player_hand = []
    dealer_hand = []
    
    cap = cv2.VideoCapture(0)  # Open the webcam
    
    # Initial deal
    for _ in range(2):
        player_card = get_card_from_webcam(cap)
        player_hand.append((player_card, 'Unknown'))
        dealer_card = get_card_from_webcam(cap)
        dealer_hand.append((dealer_card, 'Unknown'))
    
    # Player's turn
    while True:
        print(f"\nYour hand: {player_hand}")
        print(f"Your hand value: {calculate_hand_value(player_hand)}")
        print(f"Dealer's visible card: {dealer_hand[0]}")
        
        # Remove detected cards from the deck
        for card in player_hand + dealer_hand:
            if card in deck:
                deck.remove(card)
        
        probabilities = calculate_probabilities(deck)
        display_probabilities(probabilities)
        
        action = input("Do you want to (H)it or (S)tand? ").lower()
        if action == 'h':
            new_card = get_card_from_webcam(cap)
            player_hand.append((new_card, 'Unknown'))
            if calculate_hand_value(player_hand) > 21:
                print(f"\nYour final hand: {player_hand}")
                print(f"Your hand value: {calculate_hand_value(player_hand)}")
                print("Bust! You lose.")
                break
        elif action == 's':
            break
    
    # Dealer's turn
    print(f"\nDealer's hand: {dealer_hand}")
    while calculate_hand_value(dealer_hand) < 17:
        new_card = get_card_from_webcam(cap)
        dealer_hand.append((new_card, 'Unknown'))
        print(f"Dealer draws: {dealer_hand[-1]}")
    
    player_value = calculate_hand_value(player_hand)
    dealer_value = calculate_hand_value(dealer_hand)
    
    print(f"\nYour final hand: {player_hand}")
    print(f"Your hand value: {player_value}")
    print(f"Dealer's final hand: {dealer_hand}")
    print(f"Dealer's hand value: {dealer_value}")
    
    if dealer_value > 21:
        print("Dealer busts! You win!")
    elif player_value > dealer_value:
        print("You win!")
    elif player_value < dealer_value:
        print("Dealer wins!")
    else:
        print("It's a tie!")
    
    cap.release()  # Release the webcam

def get_card_from_webcam(cap):
    while True:
        ret, frame = cap.read()
        if not ret:
            print("Failed to grab frame")
            break

        cv2.imshow('Webcam', frame)
        card = detect_card(frame)
        
        if card:
            print(f"Detected card: {card}")
            return card
        
        if cv2.waitKey(1) & 0xFF == ord('q'):
            break

    return None

# Main game loop
while True:
    play_blackjack()
    play_again = input("Do you want to play again? (y/n): ").lower()
    if play_again != 'y':
        break

print("Thanks for playing!")
cv2.destroyAllWindows()