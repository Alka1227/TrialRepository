#6 Name that Triangle
print("I need the size of 3 sides of a triangle")
side1=float(input("Side A= "))
side2=float(input("Side B= "))
side3=float(input("Side C= "))
if side1==side2==side3:
    print("Your triangle is Equilateral")
else:
    if side1==side2!=side3:
        print("Your triangle is Isosceles")
    else:
        if side1!=side2!=side3:
            print("Your triangle is Scalene")

