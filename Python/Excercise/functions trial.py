def sum(a,b):
    c = a + b
    return c

sum(2,3)
#fibonachi seccuence 
def fib (n):
    a, b =0, 1
    while a < n:
        print(a, end= " ")
        a, b = b, a+b
    print()

def hypotenuse(a,b):
    c =(a**2+b**2)**(1/2)
    return c
side1= float(input("type first side of the triangle: "))
side2= float(input("type second side of the triangle: "))
print(round(hypotenuse(side1,side2)))