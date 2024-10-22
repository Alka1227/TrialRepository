#3.1.1.12 LAB: Essentials of the if-elif-else statement
year=int(input("Enter a year: "))
if year < 1582:
    print("Not within the Gregorian calendar period")
else: 
    if year % 4!=0: 
        print("Normal Year")
    elif year % 100 !=0:
        print("leap Year")
    elif year % 400 !=0:
        print("Normal year")
    else:
        print("Leap year")
