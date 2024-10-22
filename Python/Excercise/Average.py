count = 0
average = 0
number= int(input("please type a number: "))

if number == 0:
    print("You can't use 0 as first number, please type other number")
else:
    while number != 0:
        average = average + number 
        count += 1
        number= int(input("please type another number: ")) 
    print("The average is ", round(average/count,2))