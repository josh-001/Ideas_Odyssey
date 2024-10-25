
# convert_to_words(x):


# a=int(input())
# convert_to_words


###         SOLUTION ###

def number_to_words(n):
    if not (10 <= n <= 99):
        return "Please enter a number between 10 and 99."
    
    ones = ["", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"]
    teens = ["Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"]
    tens = ["", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"]

    # For numbers 10-19, return directly from the 'teens' list
    if 10 <= n <= 19:
        return teens[n - 10]
    
    # For numbers 20-99, return from the 'tens' and 'ones' lists
    tens_digit = n // 10
    ones_digit = n % 10
    
    return tens[tens_digit] + (" " + ones[ones_digit] if ones_digit != 0 else "")


# Take input from the user
n = int(input("Enter a 2-digit number (between 10 and 99): "))
print(number_to_words(n))