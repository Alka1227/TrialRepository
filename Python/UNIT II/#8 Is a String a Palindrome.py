#8 Is a String a Palindrome
def palindrome(a):
    a=a.lower()
    a=a.replace(" ", "")
    return a==a[::-1]
a = str(input("Type a word, we'll check if it's a palindrome "))
b = palindrome(a)
if b:
    print("Yes")
else:
    print("No")