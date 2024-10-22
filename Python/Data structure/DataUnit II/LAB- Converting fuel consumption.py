#LAB: Converting fuel consumption
def liters_100km_to_miles_to_gallon(liters):
    kilometers = 100
    miles = kilometers / 1.609344
    gallons = liters / 3.785411784
    return miles / gallons

def miles_gallons_to_liters_100km(miles):
    kilometers = miles * 1.609344
    liters = 3.785411784
    return (liters * 100) / kilometers

print(liters_100km_to_miles_to_gallon(3.9))
print(liters_100km_to_miles_to_gallon(7.5))
print(liters_100km_to_miles_to_gallon(10.))
print(miles_gallons_to_liters_100km(60.3))
print(miles_gallons_to_liters_100km(31.4))
print(miles_gallons_to_liters_100km(23.5))