#Código fued
def bubblesort(lst):
    a=len(lst)
    for i in range(0,a-1):
        sw=False
        for i in range(0,a-1):
            if(lst[i]>lst[i+1]):
                temp=lst[i]
                lst[i]=lst[i+1]
                lst[i+1]=temp
                sw=True
        if not sw:
            break
    return lst
lista=[]
l1=8
l2=1
a=int(input("How many hours do you sleep? "))
if a>l1:
    l1=a
lista.append(a)
b=int(input("Which is the less amount of hours de you sleep? "))
lista.append(b)
if a<=l2 and a<=2:
    print("You are going to die young")
elif a<=3 and a<=4:
    print("Now you know why your brain doesn't work")
elif a<=5 and a<=6:
    print("Average amount for a student, please sleep more")
elif a<=7 and a<l1:
    print("Great finally some who sleeps good")

media=(a+b)/2
Quarter1=(media+b)/2
Quarter2=(media+a)/2
lista.append(media)
lista.append(Quarter1)
lista.append(Quarter2)
print(" Upper value: ",a,
      "\n Second quarter: ",Quarter2,
      "\n Middle value: ",media,
      "\n First quarter: ",Quarter1,
      "\n Lower value: ",b)
print(bubblesort(lista))

