###  not for all test case ####
def valid_palindrome(s):
    i=0
    j=len(s)-1
    check=0
    while i!=j:
        if s[i]==s[j]:
            i=i+1
            j=j-1
            continue
        elif check ==0:
            s.replace(s[j],"")
            j=j-1
            check=1
            continue
        else:
            return False
    return True

    

s="abcba"
print(valid_palindrome(s))