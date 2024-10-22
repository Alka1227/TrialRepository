#3.2.1.3 LAB: Essentials of the while loop - Guess the secret number
import random
secret_number=random.randint(0,10)
print(
"""
+================================+
| Welcome to my game, muggle!    |
| Enter an integer number        |
| and guess what number I've     |
| picked for you                 |
| So, what is the secret number? |    
+================================+
""")
number=int(input("So try to guess: "))
while number != secret_number:
    print("You suck at this, you'll be here forever")
    number=int(input("So try to guess: "))

print("Great!, you might become someone powerfull")