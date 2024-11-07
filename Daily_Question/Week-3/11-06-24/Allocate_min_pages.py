####   Soltuion  #####

def is_feasible(arr, n, m, max_pages):
    student_count = 1
    current_pages = 0
    
    for pages in arr:
        if current_pages + pages > max_pages:
            student_count += 1
            current_pages = pages
            if student_count > m:
                return False
        else:
            current_pages += pages
    
    return True

def findPages(arr: [int], n: int, m: int) -> int:
    if m > n:
        return -1

    left, right = max(arr), sum(arr)
    result = right

    while left <= right:
        mid = (left + right) // 2

        if is_feasible(arr, n, m, mid):
            result = mid
            right = mid - 1
        else:
            left = mid + 1

    return result