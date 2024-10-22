#LAB: Day of the year: writing and using your own functions
def leapyear(year):
    return not year % 4 and (year % 100 or not year % 400)

test_data = [1900,2000,2016,1987]
test_results =[False, True, True, False]
for i in range(len(test_data)):
    yr=test_data[i]
    print(yr,"->",end=" ")
    result = leapyear(yr)
    if result==test_results[i]:
        print("OK")
    else:
        print("Failed")