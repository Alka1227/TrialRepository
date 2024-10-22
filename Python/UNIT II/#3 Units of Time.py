#3-Units of Time
days=0
hours=0
minutes=0
secs=0
days=int(input("How many days? "))
hours=int(input("How many hours? "))
minutes=int(input("How many mins? "))
secs=int(input("How many secs? "))
total=days*86400
total=total+(hours*3600)
total=total+(minutes*60)
total=secs+total
print("the total amount of seconds is: ",total)