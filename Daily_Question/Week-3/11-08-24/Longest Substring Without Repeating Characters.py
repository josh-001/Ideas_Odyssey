
def Longest_Substring(s):
    x=len(s)
    a=[]
    y=len(a)
    for i in range(x):
        a.append(s[i])
        for j in range(i+1,x):
            if s[j] not in a:
                a.append(s[j])
            else:
                # print(y,len(a))
                print(a)
                if y<len(a):
                    y=len(a)
                    # print(y)
                a=[]
                break
    print(y)
s="pwwkew"
Longest_Substring(s)