import tkinter as tk
import random

# Define a list of options for the computer player
options = ["rock", "paper", "scissors"]

# Define a function for when the player makes a selection
def play(player_choice):
    # Generate a random choice for the computer player
    computer_choice = random.choice(options)

    # Determine the outcome of the game
    if player_choice == computer_choice:
        result = "Tie!"
    elif (player_choice == "rock" and computer_choice == "scissors") or \
         (player_choice == "paper" and computer_choice == "rock") or \
         (player_choice == "scissors" and computer_choice == "paper"):
        result = "You win!"
    else:
        result = "Computer wins!"

    # Display the result on the screen
    result_label.config(text=result)
    computer_label.config(text=computer_choice)

# Create a tkinter window
window = tk.Tk()
window.title("Rock-Paper-Scissors")
window.config(width=400, height=400)

# Create buttons for the player to select their choice
rock_button = tk.Button(window, text="Rock", command=lambda: play("rock"))
rock_button.pack(side=tk.LEFT, padx=10, pady=10)

paper_button = tk.Button(window, text="Paper", command=lambda: play("paper"))
paper_button.pack(side=tk.LEFT, padx=10, pady=10)

scissors_button = tk.Button(window, text="Scissors", command=lambda: play("scissors"))
scissors_button.pack(side=tk.LEFT, padx=10, pady=10)

# Create a label to display the result of the game
result_label = tk.Label(window, text="")
result_label.pack(pady=10)
computer_label= tk.Label(window, text="")
computer_label.pack(pady=10)

# Start the tkinter event loop
window.mainloop()