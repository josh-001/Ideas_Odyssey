
        ###  teacher gave many hints to solve so able to do it ###

def sort_arrange(a):
    low=mid=0
    high=len(a)-1
    while mid<=high:
        if a[mid]==-1:
            temp=a[mid]
            a[mid]=a[low]
            a[low]=temp
            low+=1
            mid+=1
        elif a[mid]==1:
            temp=a[mid]
            a[mid]=a[high]
            a[high]=temp
            high-=1
        else:
            mid+=1
            continue
    print(arr)

arr = [0, -1, 1, 0, -1, 1, 0, -1, -1]

sort_arrange(arr)