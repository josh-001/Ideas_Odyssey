        ####  my solution ##
# def longes_consecutive_sequence(a):
#     hashh={}
#     a=sorted(a)
#     # print(a)
#     temp=0
#     for i in range(len(a)-1):
#         if a[i]+1==a[i+1]:
#             x=str(a[temp:i+2])
#             hashh[x]=len(a[temp:i+2])
#             # print(a[temp:i+2])
#         else:
#             temp=i+1
#             continue
#     max_=1
#     for key,value in hashh.items():
#         if value>max_:
#             max_=value
#     print(max_)
# arr = [100, 4,5, 101,102,103,105,200, 1, 3, 2]
# longes_consecutive_sequence(arr)


    ### SLOUTIONN###
def longest_consecutive(arr):
    # Convert the list to a set for O(1) lookups
    num_set = set(arr)
    longest_streak = 0
    
    for num in num_set:
        # Check if it's the start of a sequence
        if num - 1 not in num_set:
            current_num = num
            current_streak = 1

            # Count the length of the sequence
            while current_num + 1 in num_set:
                current_num += 1
                current_streak += 1

            # Update the longest streak
            longest_streak = max(longest_streak, current_streak)

    return longest_streak

# Taking user input
arr = list(map(int, input("Enter the array elements separated by spaces: ").split()))
print("Length of the longest consecutive sequence:", longest_consecutive(arr))