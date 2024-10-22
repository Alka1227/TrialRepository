
kilometers = 0
ratio = 0
kilometers= int(input("how many kilometers are you going to travel: "))
def fare(kilometers, b=0.25):
    taxifare = 4.00
    kilometers = kilometers*1000
    ratio= kilometers/140
    finalfare = ratio*b +taxifare
    return round(finalfare,2)

print(fare(kilometers))
