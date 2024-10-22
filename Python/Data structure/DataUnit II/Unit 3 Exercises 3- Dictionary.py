#Unit 3 Exercises 3: Dictionary
#1
dict = {0: 10, 1: 20}
dict.update({2: 30})
print(dict)
#2
dict = {0: 10, 1: 20}
dict[2] = 30
print(dict)
#3
dict1 = {0: 10, 1: 20}
dict2 = {2: 30, 3: 40}
dict3 = {4: 50, 5: 60}

merged_dict = {}
merged_dict.update(dict1)
merged_dict.update(dict2)
merged_dict.update(dict3)
print(merged_dict)
#4
n = 5
squared_dict = {}

for num in range(1, n+1):
    squared_dict[num] = num * num

print(squared_dict)
#5
dict1 = {0: 10, 1: 20}
dict2 = {2: 30, 3: 40}

merged_dict = {**dict1, **dict2}
print(merged_dict)