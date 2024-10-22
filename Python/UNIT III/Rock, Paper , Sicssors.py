import tkinter as tk
import random

# Función para obtener la selección del jugador y calcular el resultado
def jugar(eleccion_jugador):
    # Elección aleatoria del ordenador
    eleccion_ordenador = random.choice(["piedra", "papel", "tijeras"])
    
    # Determinar el resultado del juego
    if eleccion_jugador == eleccion_ordenador:
        resultado = "Empate"
    elif (eleccion_jugador == "piedra" and eleccion_ordenador == "tijeras") or \
        (eleccion_jugador == "papel" and eleccion_ordenador == "piedra") or \
        (eleccion_jugador == "tijeras" and eleccion_ordenador == "papel"):
        resultado = "Ganaste!"
    else:
        resultado = "Perdiste!"
    
    # Actualizar la etiqueta del resultado
    resultado_label.config(text=resultado)
    
    # Actualizar la etiqueta de la elección del ordenador
    eleccion_ordenador_label.config(text="El ordenador eligió: " + eleccion_ordenador)

# Crear la ventana principal
ventana = tk.Tk()
ventana.title("Piedra, Papel y Tijeras")

# Crear las etiquetas
tk.Label(ventana, text="Tu elección:").grid(row=0, column=0, padx=10, pady=10)
tk.Label(ventana, text="El ordenador eligió:").grid(row=1, column=0, padx=10, pady=10)
eleccion_ordenador_label = tk.Label(ventana, text="")
eleccion_ordenador_label.grid(row=2, column=0, padx=10, pady=10)
resultado_label = tk.Label(ventana, text="")
resultado_label.grid(row=3, column=0, padx=10, pady=10)

# Crear los botones
tk.Button(ventana, text="Piedra", command=lambda: jugar("piedra")).grid(row=0, column=1, padx=10, pady=10)
tk.Button(ventana, text="Papel", command=lambda: jugar("papel")).grid(row=1, column=1, padx=10, pady=10)
tk.Button(ventana, text="Tijeras", command=lambda: jugar("tijeras")).grid(row=2, column=1, padx=10, pady=10)

# Iniciar el bucle principal de la ventana
ventana.mainloop()