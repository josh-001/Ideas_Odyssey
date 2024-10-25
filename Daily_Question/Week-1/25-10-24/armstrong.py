
####   my solution  ###

def multiply(nums,length):
    s=1
    for i in range(0,length):
        s=s*nums 
    return s

def armstrong_number(number):
    x=len(str(number))
    ljb=number
    check_num=0
    for i in range(0,x):
        y=number%10
        s=multiply(y,x)
        check_num=check_num+s
        number=number//10
    if ljb==check_num:
        print("yes")
    else:
        print("no")

num=int(input("Enter the number: "))
armstrong_number(num)