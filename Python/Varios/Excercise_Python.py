import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
from collections import Counter

# Datos para el análisis
valores_muestra = [5, 3, 2, 5, 4, 6, 7, 11, 5, 6, 8, 10, 7, 8, 2, 4, 5, 9, 12, 5, 8, 7, 9, 9]

# Cálculo de métricas estadísticas
promedio = np.mean(valores_muestra)
valor_medio = np.median(valores_muestra)
valor_frecuente = Counter(valores_muestra).most_common(1)[0][0]
dispersion = np.std(valores_muestra)

print(f"Promedio: {promedio}")
print(f"Mediana: {valor_medio}")
print(f"Moda: {valor_frecuente}")
print(f"Desviación Estándar: {dispersion}")

# Visualización de los datos en un diagrama de dispersión
plt.figure(figsize=(10, 6))
plt.scatter(range(len(valores_muestra)), valores_muestra, color='blue')
plt.title('Distribución de los Valores')
plt.xlabel('Posición en la Muestra')
plt.ylabel('Valor de la Muestra')
plt.grid(True)
plt.show()

# Generación de un histograma para visualizar la frecuencia de los valores
plt.figure(figsize=(10, 6))
sns.histplot(valores_muestra, bins=10, kde=True, color='green')
plt.title('Frecuencia de los Valores')
plt.xlabel('Valores de la Muestra')
plt.ylabel('Frecuencia')
plt.grid(True)
plt.show()

# Creación de un diagrama de pastel para mostrar la proporción de valores únicos
distribucion_valores = Counter(valores_muestra)
etiquetas, tamanos = zip(*distribucion_valores.items())

plt.figure(figsize=(10, 6))
plt.pie(tamanos, labels=etiquetas, autopct='%1.1f%%', startangle=140)
plt.axis('equal')
plt.title('Distribución de Valores en Porcentajes')
plt.show()
