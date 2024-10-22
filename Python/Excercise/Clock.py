minutes = 0
sec = 1
hours = 0
while(hours<24):
    while(minutes<60):
        while(sec<60):         
            print(hours,":",minutes,":",sec)
            sec += 1
        sec = 0
        minutes +=1 
        print(hours,":",minutes,":",sec)
    minutes = 0
    hours +=1
    print(hours,":",minutes,":",sec)