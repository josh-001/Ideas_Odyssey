        ####  my solution ##
def longes_consecutive_sequence(a):
    hashh={}
    a=sorted(a)
    # print(a)
    temp=0
    for i in range(len(a)-1):
        if a[i]+1==a[i+1]:
            x=str(a[temp:i+2])
            hashh[x]=len(a[temp:i+2])
            # print(a[temp:i+2])
        else:
            temp=i+1
            continue
    max_=1
    for key,value in hashh.items():
        if value>max_:
            max_=value
    print(max_)
arr = [100, 4,5, 101,102,103,105,200, 1, 3, 2]
longes_consecutive_sequence(arr)