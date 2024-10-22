#merge sort
lst=[5,1,4,7,3]
def merge(left_half,right_half):
    if not left_half or not right_half:
        return left_half or right_half
    result=[]
    i, j=0,0
    while True:
        if left_half[i] < right_half[j]:
            result.append(left_half[i])
            i += 1
        else:
            result.append(right_half[j])
            j +=1
        
        if i== len(left_half) or j == len(right_half):
            result.extend(left_half[i:] or right_half[j:])
            break
    return result
def merge_sort(lst):
    if len(lst)== 0 or len(lst) == 1:
        return lst
    else:
        middle_index=len(lst)//2
        left=merge_sort(lst[:middle_index])
        right=merge_sort(lst[middle_index:])
        return merge(left,right)
print(merge_sort(lst))