#Simple Calculator
menu=0
while(menu<5):    
    print("what do you want to do?\n1-Add\n2-Sustract\n3-Multiply\n4-Divide\n5-Exit")
    menu=int(input(":"))
    if(menu==1):
        num1 =float(input("Give me your first number: "))
        num2 =float(input("Give me your second number: "))
        print("\nThe result is",num1+num2,"\n")
        menu==0
    if(menu==2):
        num1 =float(input("Give me your first number: "))
        num2 =float(input("Give me your second number: "))
        print("\nThe results is: ",num1-num2,"\n")
        menu==0
    if(menu==3):
        num1 =float(input("Give me your first number: "))
        num2 =float(input("Give me your second number: "))
        print("\nThe results is: ",num1*num2,"\n")
        menu==0
    if(menu==4):
        num1 =float(input("Give me your first number: "))
        num2 =float(input("Give me your second number: "))
        if(num2!=0):
            print("\nThe results is: ",num1/num2,"\n")
            menu==0
        else:
            num2==0
            print("\nDividing 0 is not posible \nThe results is always: ",num2,"\n")
        


    


