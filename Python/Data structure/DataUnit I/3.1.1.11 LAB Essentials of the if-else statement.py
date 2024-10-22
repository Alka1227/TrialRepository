#3.1.1.11 LAB: Essentials of the if-else statement
income=(float(input("What is your income?: ")))
if income<= 85528:
    tax= income * 0.18 -556.2
if income> 85528:
    surplus= income - 85528
    tax= 14839.2 + surplus * 0.32
tax =(round(tax))
print("Your tax is:", tax, "thalers")

