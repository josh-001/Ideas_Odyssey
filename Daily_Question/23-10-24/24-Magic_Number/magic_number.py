
a=int(input("enter the 4-digit_number: "))
a=str(a)
x=int(str(a[0]))+int(str(a[1]))
y=int(str(a[2]))+int(str(a[3]))
if x==y:
    print("yes-magic number")
else:
    print("not a magic number")