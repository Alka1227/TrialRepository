from tkinter import *
from tkinter import ttk

root = Tk()
frm = ttk.Frame(root,padding=30)
frm.grid()
ttk.Label(frm, text="NO").grid(column=0 , row=0)
ttk. Button (frm, text ="quit", command=root.destroy).grid(column=1, row=0)
root.mainloop()