#Unit 3 Exercises 1: Functions
#1
a= input("Give me one number: ")
b= input("Give a second number: ")
c= input("Give a third number: ")
print(a,b,c)
def maxofthree(a,b,c):
    if a>b and a>c:
        return a
    if b>a and b>c:
        return b
    if c>a and c>b:
        return c
print("The biggest number is ",maxofthree(a,b,c))
#2
list=[1,2,3]
def sumary(list):
    return sum(list)
print(sumary(list))
#3
def copies(s):
    if len(s) >= 2:
        return s[-2:] * 4
    else:
        return "Length of string should be at least 2."

s = "Hello"
print(copies(s))
#4
def multiply(numbers):
    result = 1
    for num in numbers:
        result *= num
    return result

print(multiply(list)) 
#5
def reversed(string):
    return string[::-1]

print(reversed("osoperesoso"))
#6
def insert(a, b):
    c = len(b) // 2
    return a[:c] + b + a[c:]

print(insert("Hello world", "sicked"))  