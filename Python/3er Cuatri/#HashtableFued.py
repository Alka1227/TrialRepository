#HashtableFued
import csv
import random

# Lista de amigos
amigos = ["Dana", "Ariel", "Max", "Jess", "Diego"]

# Función para generar un recorrido aleatorio de amigos
def generar_recorrido_aleatorio():
    return random.sample(amigos, len(amigos))

# Función para guardar un recorrido en un diccionario
def guardar_recorrido_en_diccionario(recorrido, historial):
    historial.append(recorrido)

# Función para guardar un recorrido en un archivo CSV
def guardar_recorrido_en_csv(recorrido, archivo_csv):
    with open(archivo_csv, mode='a', newline='') as file:
        writer = csv.writer(file)
        writer.writerow(recorrido)

# Inicializa un diccionario vacío para el historial de recorridos
historial_diccionario = []

# Genera un recorrido aleatorio
recorrido = generar_recorrido_aleatorio()

# Guarda el recorrido en el diccionario
guardar_recorrido_en_diccionario(recorrido, historial_diccionario)

# Guarda el recorrido en un archivo CSV
guardar_recorrido_en_csv(recorrido, 'historial.csv')

print("Recorrido aleatorio guardado en historial.csv")

# Para ver el historial de recorridos almacenados en el diccionario
print("Historial en diccionario:")
print(historial_diccionario)
