import tkinter as tk
from tkinter import ttk
scrable = {"A": 1, "E": 1, "I": 1, "L": 1, "N": 1, "O": 1, "R": 1, "S": 1, "T": 1, "U": 1, #DICCIONARIO
        "D": 2, "G": 2, 
        "B": 3, "C": 3, "M": 3, "P": 3, 
        "F": 4, "H": 4, "V": 4, "W": 4, "Y": 4, 
        "K": 5, 
        "J": 8, "X": 8, 
        "Q": 10, "Z": 10}
def word(): #PUNTUACION
    x=str(givenword.get())
    x=x.upper()
    word=(list(x))
    x=x.upper()
    points=0
    for i in x:
        points += scrable[i]
    your_word.config(text=f"The word is: {word}" ,font="/bVerdana 11")
    score.config(text=f"Your score is: {points}" ,font="/bVerdana 11")
window =tk.Tk()
window.title("SCRABBLE SCORE") #INTERFAZ
window.config(width=400,height=400)
label_onepoint= ttk.Label(text="One point:      A,E,I,L,N,O,R,S,T and U",font="Verdana 11")
label_onepoint.place(x=20,y=10)
label_twopoints= ttk.Label(text="Two points:    D and G",font="Verdana 11")
label_twopoints.place(x=20,y=30)
label_threepoint= ttk.Label(text="Three points:  B,C,M and P",font="Verdana 11")
label_threepoint.place(x=20,y=50)
label_fourpoint= ttk.Label(text="Four points:   F,H,V,W and Y",font="Verdana 11")
label_fourpoint.place(x=20,y=70)
label_fivepoint= ttk.Label(text="Five points:    K",font="Verdana 11")
label_fivepoint.place(x=20,y=90)
label_eightpoint= ttk.Label(text="Eight points:   J and X",font="Verdana 11")
label_eightpoint.place(x=20,y=110)
label_tenpoint= ttk.Label(text="Ten points:    Q and Z",font="Verdana 11")
label_tenpoint.place(x=20,y=130)
scoredtext=ttk.Label(text="Enter your word: ",font="/bVerdana 11")
scoredtext.place(x=20,y=170)
givenword=ttk.Entry()
givenword.place(x=140,y=170,width=250)
button_convert = ttk.Button(text="SCORE", command= word)
button_convert.place(x=200,y=210)
your_word=ttk.Label(text=f"The word is: __",font="/bVerdana 11")
your_word.place(x=20,y=250)
score=ttk.Label(text=f"Your score is: 0",font="/bVerdana 11")
score.place(x=20,y=270)
window.mainloop()