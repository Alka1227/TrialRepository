array=[]
count=0
array.append(input("type a name: "))
if array[count] ==" ":
    print("end of the program")
else:
    while array[count]!= "":
        array.append(input("type your name: "))
        count+=1
    array.pop()
print(array)