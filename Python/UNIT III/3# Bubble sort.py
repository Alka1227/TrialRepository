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
while len(lista)!=4:
    x=int(input("Give me some numbers "))
    lista.append(x)
print(bubblesort(lista))
