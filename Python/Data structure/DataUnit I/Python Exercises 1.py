def test(nums):
    return nums.count(19) == 2 and nums.count(5) >=3
def test2(nums):
    return len(nums) == 8 and nums.count(nums[4]) == 3
def test3(nums):
    return nums % 34 == 4 and nums > 4**4
def stones(n):
    return [n+2 * i for i in range[n]]

nums = [19,19,15,5,3,5,5,2]
print("Original list", nums)
print("Check two occurences of nineteen and at least three occurrences of five")
print(test(nums))
nums = [19,15,15,5,3,3,5,2]
print("Original list", nums)
print("Check two occurences of nineteen and at least three ocurrences of fives in the")
print(test(nums))
nums = [19,19,5,5,5,5,5]
print("Original list", nums)
print("Check two occurences of nineteen and at least three ocurrences of fives in the")
print(test(nums))
print("///////////////////////////////////////////////////////////////")
#///////////////////////////////////////////////////////////////////////
nums = [19, 19, 15, 5, 5, 5, 1, 2]
print("Original list", nums)
print("accepts a list of integers and calculates the length and the fifth element. Return true if the length of the list is 8 and the fifth element occurs thrice in the said list")
print(test2(nums))
nums = [19, 15, 5, 7, 5, 5, 2]
print("Original list", nums)
print("accepts a list of integers and calculates the length and the fifth element. Return true if the length of the list is 8 and the fifth element occurs thrice in the said list")
print(test2(nums))
nums = [11, 12, 14, 13, 14, 13, 15, 14]
print("Original list", nums)
print("accepts a list of integers and calculates the length and the fifth element. Return true if the length of the list is 8 and the fifth element occurs thrice in the said list")
print(test2(nums))
nums = [19, 15, 11, 7, 5, 6, 2]
print("Original list", nums)
print("accepts a list of integers and calculates the length and the fifth element. Return true if the length of the list is 8 and the fifth element occurs thrice in the said list")
print(test2(nums))
print("///////////////////////////////////////////////////////////////")
#/////////////////////////////////////////////////////////////////

print("Write a Python program that accepts an integer and determines whether it is greater than 4^4 and which is 4 mod 34.")
num = 922
print(test3(nums))
num = 914
print(test3(nums))
num = 854


print(test3(nums))
num = 854
print(test3(nums))
def test5(str1):
    return str1[len(str1)-2] in str1[len(str1)-1] and str1[len(str1)-2] !=str1[len(str1)-1]

str1=["a","abb","sfs","oo","de","sfde"]
print(str1)
print(test(str1))

n=2
print(stones(n))
