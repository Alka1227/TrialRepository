import tkinter as tk
from tkinter import ttk
def convert_temp():
    temp_celsius=float(entry_temp.get())
    temp_kelvins=temp_celsius + 273.15
    temp_farenheit=(temp_celsius*1.8)+32
    label_kelvin.config(text=f"TEMPERATURE °K:{temp_kelvins}")
    label_fh.config(text=f"TEMPERATURE °F:{temp_farenheit}")

window =tk.Tk()
window.title("Temperature converser")
window.config(width=400,height=300)
label_celsius= ttk.Label(text="TEMPERATURE",font="Verdana 11")
label_celsius.place(x=20,y=20)
entry_temp=ttk.Entry()
entry_temp.place(x=140,y=20,width=60)
button_convert = ttk.Button(text="CONVERT", command=convert_temp)
button_convert.place(x=300,y=20)
label_kelvin=ttk.Label(text="TEMPERATURE IN K: n/a", font="Verdana 11")
label_kelvin.place(x=20,y=100)
label_fh=ttk.Label(text="TEMPERATURE IN F: n/a", font="Verdana 11")
label_fh.place(x=20,y=120)
window.mainloop()
