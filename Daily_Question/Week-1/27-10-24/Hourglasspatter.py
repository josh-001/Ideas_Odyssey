
        #### my solution ###
def hourglass_pattern(a):
    for i in range(a,0,-1):
        for j in range(a-i):
            print(" ",end="")
        for j in range(2*i-1):
            print(i,end="")
        print()
    for i in range(2,a+1):
        for j in range(a-i):
            print(" ",end="")
        for j in range(2*i-1):
            print(i,end="")

        print()

a=int(input("Enter a number: "))
hourglass_pattern(a)