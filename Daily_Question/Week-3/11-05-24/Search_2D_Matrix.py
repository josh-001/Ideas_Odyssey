####    what i tried error logic iswrong  

# class Solution:
#     def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
#         a=matrix
#         i=len(matrix)//2
#         j=0
#         print(i,j)
#         while a[i][j] !=target:
#             if a[i][j]<target:
#                 j=j+1
#             elif a[i][j]>target:
#                 i=i-1
#             print(a[i][j])
        


###         SOLUTIONN  ##

class Solution:
    def searchMatrix(self, matrix, target):
        if not matrix or not matrix[0]:
            return False

        m, n = len(matrix), len(matrix[0])
        left, right = 0, m * n - 1

        while left <= right:
            mid = (left + right) // 2
            # Calculate the row and column from the 1D index
            row, col = mid // n, mid % n
            mid_value = matrix[row][col]

            if mid_value == target:
                return True
            elif mid_value < target:
                left = mid + 1
            else:
                right = mid - 1

        return False