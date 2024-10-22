score = {"A": 1, "E": 1, "I": 1, "L": 1, "N": 1, "O": 1, "R": 1, "S": 1, "T": 1, "U": 1, #Onepoint
        "D": 2, "G": 2, #TwoPoints
        "B": 3, "C": 3, "M": 3, "P": 3, #ThreePoints
        "F": 4, "H": 4, "V": 4, "W": 4, "Y": 4, #FourPoints
        "K": 5, #FivePoints
        "J": 8, "X": 8, #EightPoints
        "Q": 10, "Z": 10 #TenPoints 
        }
word = input('Enter the word \n > ')
word = word.upper()
totalpoints = 0
for i in word:
    totalpoints += score[i]
print('Your total points = ',totalpoints)


