#calculadora
import tkinter as tk
def suma():
    resultado=float(Numero1.get()) + float(Numero2.get())
    igual.config(text=f"= {resultado}")
x=tk.Tk()
x.config(width=400, height=150)
x.title("Calculadora")
Numero1=tk.Entry(width=10)
Numero1.place(x=50,y=50)
Numero2=tk.Entry(width=10)
Numero2.place(x=150,y=50)
btnsuma=tk.Button(text="+",command=suma)
btnsuma.place(x=125,y=50)
igual=tk.Label(text="=")
igual.place(x=225,y=50)

x.mainloop()
