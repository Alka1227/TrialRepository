#3.2.1.15 LAB: Collatz's hypothesis
number=int(input("Give a number: "))
steps=0
if number <=0:
    print("you can not use a negative number or 0")
else:
    c0=number
while c0 != 1:
    if ((c0 % 2)==0):
        c0=c0/2
        print(c0)
        steps+=1
    else:
        c0=(c0*3)+1
        print(c0)
        steps+=1
print("Number of steps: ",steps)