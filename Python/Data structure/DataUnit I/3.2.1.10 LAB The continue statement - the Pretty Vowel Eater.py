#3.2.1.10 LAB: The continue statement - the Pretty Vowel Eater
word=input("Give me a word: ")
word=word.upper()
fbword=["A","E","I","O","U"]
wordwithoutvowels=""
for letter in word:
    if letter in fbword:
        continue
    wordwithoutvowels+=letter
print(wordwithoutvowels)

