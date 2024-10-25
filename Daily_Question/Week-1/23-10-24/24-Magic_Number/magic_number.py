            #### my logic  ##

a=int(input("enter the 4-digit_number: "))
a=str(a)
x=int(str(a[0]))+int(str(a[1]))
y=int(str(a[2]))+int(str(a[3]))
if x==y:
    print("yes-magic number")
else:
    print("not a magic number")



####       SOLUTION   ##

a=int(input("enter the 4-digit_number: "))
if 1000<=a<=9999:
    d1=a//1000
    d2=(a//100)%10
    d3=(a//10)%10
    d4=a%10
    if (d1+d2)==(d3+d4):
        print("magic number")
    else:
        print("not a magic number")
else:
    print("not a four digit number")