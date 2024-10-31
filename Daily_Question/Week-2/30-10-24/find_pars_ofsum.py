
##    by using nested looops  ###   have to avoid it 
# def find_pars_of_sum(a,tar):
#     x=[]
#     for i in range(len(a)):
#         for j in range(i+1,len(a)):
#             if a[i]+a[j]==tar:
#                 if ([a[i],a[j]] or [a[j],a[i]]) not in x:
#                     x.append([a[i],a[j]])
#     print(x)



####    solution   ###

def find_pairs(arr, target):
    seen = set()  # To store unique elements
    pairs = set()  # To store unique pairs

    for num in arr:
        complement = target - num
        if complement in seen:
            pairs.add((min(num, complement), max(num, complement)))
        seen.add(num)
    
    # Print each pair
    if pairs:
        for pair in pairs:
            print(pair)
    else:
        print("No pairs found")

# Taking user input
arr = list(map(int, input("Enter the array elements separated by spaces: ").split()))
target = int(input("Enter the target sum: "))
find_pairs(arr, target)