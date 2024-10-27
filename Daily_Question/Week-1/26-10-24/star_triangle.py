
             #### wrong solution  ### 
# def star_traingle(l):
#    for i in range(l):
#         for k in range(i,l-1):
#             print("k",k)
#             print(" ",end=" ")
#         for j in range(2*l-1):
#             print("*")
# a=int(input("enter N: "))
# star_traingle(a)


def n_star_triangle(n):
    for i in range(1, n + 1):
        # Print spaces to center the stars
        print(" " * (n - i), end="")
        # Print stars
        print("*" * (2 * i - 1))

# Input
N = int(input("Enter the value of N: "))
n_star_triangle(N)

