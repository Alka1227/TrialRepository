#Unit 3 Exercises 2: Functions
#1
def count_upper_lower(string):
    upper_count = 0
    lower_count = 0
    for char in string:
        if char.isupper():
            upper_count += 1
        elif char.islower():
            lower_count += 1
    return upper_count, lower_count

upper, lower = count_upper_lower('The quick Brow Fox')
print("No. of Upper case characters:", upper)
print("No. of Lower case characters:", lower)
#2
def get_unique_elements(lst):
    unique_list = []
    for item in lst:
        if item not in unique_list:
            unique_list.append(item)
    return unique_list

sample_list = [1, 2, 3, 3, 3, 3, 4, 5]
unique_list = get_unique_elements(sample_list)
print("Unique List:", unique_list)
#3
def prime(num):
    if num <= 1:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True

number = 17
if prime(number):
    print(number, "is a prime number.")
else:
    print(number, "is not a prime number.")
#4
def even_numbers(lst):
    even_numbers = []
    for num in lst:
        if num % 2 == 0:
            even_numbers.append(num)
    return even_numbers

list = [1, 2, 3, 4, 5, 6, 7, 8, 9]
even_nums = even_numbers(list)
print("Even numbers:", even_nums)
#5
def palindrome(string):
    string = string.replace(" ", "").lower()
    if string == string[::-1]:
        return True
    return False

if palindrome("nurses run"):
    print("nurses run", "is a palindrome.")
else:
    print("nurses run", "is not a palindrome.")