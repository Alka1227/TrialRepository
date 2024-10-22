#Exercises 2 Python If, Elif, Else"
#1
name=input("What is your name? ")
if(name=="Bond"):
    print("Welcome on board 007")
else:
    print("Good moorning", name)
#2
number=int(input("Give me a number please? "))
if ((number % 2)==0):
    print("Your number is odd")
    print(True)
else:
    print("Your number is even")
    print(False)
#3
number=float(input("Give me a number please? "))
def decimal(number):
    if ((number %1)==0):
         return "INTEGER"
    else:
        return number %1
print(decimal(number))
#4
treepersqkm={"Finland": 90652, "Taiwan":69593,"Japan":49894,"Russia":41396,"Brazil":39542,"Canada":36388
             ,"Bulgaria":24987,"France":24436,"Greece":24323,"United States":23513, "Turkey":11126, 
             "India":11109,"Denmark":6129, "Syria":534, "Saudi Arabia":1}
def moretrees(treepersqkm):
    countries=[]
    for country,value in treepersqkm.items():
        if(value>=20000):
            countries.append((country,value))
    return countries                    
print(moretrees(treepersqkm))
