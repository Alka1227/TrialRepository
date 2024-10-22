from random import randrange
#numbers=[]
max1=0
num=[randrange(1,100) for x in range(100)]
#for i in range(101):     "this is the same as above, just in a more difficult way"
    #numbers.append(randrange(1,100))
print(num)
for i in range(len(num)):
    if num[i]>max1:
        max1=num[i]
print(max1)