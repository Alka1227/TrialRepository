#3.4.1.6 LAB: The basics of lists
hatlist=[1,2,3,4,5]
number=int(input("Give me a number: "))
hatlist[2]=number
print(hatlist)
hatlist.pop()
print(hatlist)
print("The length of the list",len(hatlist))