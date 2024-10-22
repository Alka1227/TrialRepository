def insertwords(str, word):
    return str[:2] + word +str[2:]
print(insertwords("(())","HI"))

def insertend(word):
    new_word= word[-2:]
    return new_word*4
print(insertend('Python'))