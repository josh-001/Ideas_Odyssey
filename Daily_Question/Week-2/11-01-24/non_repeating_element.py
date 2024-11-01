        ##      Wrong Soltuion   ##
# def non_repeat_ele(a):
#     for i in range(len(a)):
#         print(a[i+1:])
#         if a[i]  in a[i+1:]:
#             continue
#         else:
#             return a[i]
#     return -1
# arr = [4, 5, 1, 2, 4,5,1,2,0]
# print(non_repeat_ele(arr))


            ##  SUCCESS  #
def non_repeat_ele(a):
    hashing={}
    for i in a:
        if i in hashing:
            hashing[i] +=1
        else:
            hashing[i]=1
    print(hashing)
    for key,value in hashing.items():
        if value==1:
            return key
    return -1
arr = [4, 5, 1, 2, 4,5,2,0,0,1]
# arr = [4, 5, 1, 2, 0, 4]
print(non_repeat_ele(arr))