firstlist=[1,2,3,4,5,6,7,8,9]

for i in firstlist:
    print(i)
count=0
names=[]
while count<3:
    names.append(input("type your name: "))
    count+=1

for i in range(len(names)):
    print(names[i]," ",firstlist[i]) 
 
