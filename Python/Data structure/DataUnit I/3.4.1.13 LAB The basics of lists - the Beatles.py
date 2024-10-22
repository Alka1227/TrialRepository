#3.4.1.13 LAB: The basics of lists - the Beatles
#step 1
beatles=[]
print(beatles)
#step 2
beatles.append("John Lennon") 
beatles.append("Paul McCartney") 
beatles.append("George Harrison")
print(beatles)
#step 3
for members in ('Stu Sutcliffe', 'Pete Best'):
    beatles.append(members)
print(beatles)
#step 4
del beatles[3:6]
print(beatles)
#step 5
beatles.insert(0,"Ringo Star")
print(beatles)