#3.2.1.9 LAB: The break statement - Stuck in a loop
sword="chupacabra"
word=str(input("Give me the secret word: "))
while True:
    if word==sword:
        print("You've successfully left the loop")
        break
    else:
        word=str(input("Give me the secret word: "))