#LAB: How many days: writing and using your own functions
def is_year_leap(year):
     if year % 4 == 0 and (year % 100 != 0 or year % 400 == 0):
        return True
     else:
        return False

def days_in_month(year,month):
    month_lengths = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    if not is_year_leap(year) and month == 2:
        return 28
    elif is_year_leap(year) and month == 2:
        return 29
    elif month < 1 or month > 12:
        return None
    else:
        return month_lengths[month - 1] 

test_years = [1900,2000,2016,1987]
test_month = [2,2,1,11]
test_results = [28,29,31,30]
for i in range(len(test_years)):
 yr = test_years[i]
 mo = test_month[i]
 print(yr,mo, "->", end="")
 result = days_in_month(yr,mo)
 if result == test_results[i]:
  print("OK")
 else:
  print("Failed")