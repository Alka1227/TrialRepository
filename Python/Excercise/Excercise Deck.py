from random import sample
def Createdeck():
    deck=[]
    suits =['s','h','d','c']
    numbers = ['A','2','3','4','5','6','7','8','9','T','J','Q','K']
    for i in suits:
        for a in numbers:
            deck.append(a+i)
    return deck
new_deck= Createdeck()

def shuffle():
    shuffled_deck = new_deck.sample()
    return shuffled_deck
sdeck= shuffle
print(sample(new_deck,52))

