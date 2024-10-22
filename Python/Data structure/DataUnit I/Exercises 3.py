#Exercises 3
#Write a Python program that accepts a word from the user and reverses it.
n=str(input("Give me a word: "))
n=n[::-1]
print(n)
#Write a Python program that prints each item and its corresponding type from the following list.
datalist = [1452, 11.23, 1+2j, True, 'IsW', (0, -1), [5, 12], {"class":'V', "section":'A'}]
print(datalist)
for _ in datalist:
    print(type(_))
#Write a Python program that prints all the numbers from 0 to 6 except 3 and 6.
i=0
while i<=6:
    if i == 3 or i == 6:
        i+=1
        continue
    else:
        print(i)
        i+=1
#Write a Python program to get the Fibonacci series between 0 and 50.
l=int(input("How many numbers do you want? "))
a=1
b=1
x=[0,1,1]
for i in range(l):
    c=a+b
    x.append(c)
    a=b
    b=c
print(x)
#Write a Python program that takes two digits m (row) and n (column) as input and generates 
#a two-dimensional array. The element value in the i-th row and j-th column of the array should be i*j
m=int(input("Give the rows: "))
n=int(input("GIve the colums: "))
matriz=[]
for i in range(m):
    row = []
    for j in range(n):
        o = i*j
        row.append(o)
    matriz.append(row)
for row in matriz:
    print(row)
#Write a Python program that accepts a sequence of lines 
#(blank line to terminate) as input and prints the lines as output (all characters in lower case).
lines = []
while True:
    line = input("Enter a line (blank to exit): ")
    if line == "":
        break
    lines.append(line.lower())
for line in lines:
    print(line)
#Write a Python program that accepts a sequence of comma separated 4 digit binary numbers as its input.
#The program will print the numbers that are divisible by 5 in a comma separated sequence.
list=[0101,1001,1010]
"""for i in range(list):
    if i %5 == 0:"""
        
