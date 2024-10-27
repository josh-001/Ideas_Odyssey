
             #### wrong solution  ### 
def star_traingle(l):
   for i in range(l):
        for k in range(i,l-1):
            print("k",k)
            print(" ",end=" ")
        for j in range(2*l-1):
            print("*")
a=int(input("enter N: "))
star_traingle(a)


