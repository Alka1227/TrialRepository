#Quick sort
def quick_sort(lst):
    if len(lst) <= 1:
        return lst
    pivot = lst[len(lst) // 2]
    left_lst, right_lst, equal_lst = [], [], []

    for num in lst:
        if num < pivot:
            left_lst.append(num)
        elif num > pivot:
            right_lst.append(num)
        else:
            equal_lst.append(num)

    return quick_sort(left_lst) + equal_lst + quick_sort(right_lst)

lst = [7, 2, 8, 1, 0, 3, 5]
sorted_lst= quick_sort(lst)
print("Lista original: " , lst)
print("Lista ordenada: " , sorted_lst)