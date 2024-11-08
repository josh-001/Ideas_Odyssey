
### my soution try again concpet ocrrect coding have tobe done 
def Freq_sort(s):
    hash={}
    for i in range(len(s)):
        if s[i] in hash:
            hash[s[i]]+=1
        else:
            hash[s[i]]=1
    print(sorted(hash))

    # s=""
    # for key,value in hash.items():
    #     while value>0:
    #         s=s+key
    #         value-=1
    # print(s)

    
s = "treee"
Freq_sort(s)