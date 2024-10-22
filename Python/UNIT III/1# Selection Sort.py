#Selection Sort
#lst=[10,8,3,6]
lst=[]
while len(lst)!=4:
    x=int(input("Give me some numbers "))
    lst.append(x)
print(lst)            
for i in range(len(lst)):
    minimo=i
    for actual in range(i+1,len(lst)):
        if lst[minimo]>lst[actual]:
            minimo=actual
    lst[i], lst[minimo]=lst[minimo], lst[i]
print(lst)

