class Grafo:
    def __init__(self):
        self.grafo = {}

    def agregar_arista(self, origen, destino):
        if origen in self.grafo:
            self.grafo[origen].append(destino)
        else:
            self.grafo[origen] = [destino]

def dfs_arbol(grafo, nodo, visitados):
    visitados.add(nodo)
    print(nodo)  # Imprime el nodo para mostrar el recorrido

    if nodo in grafo:
        for vecino in grafo[nodo]:
            if vecino not in visitados:
                dfs_arbol(grafo, vecino, visitados)

# Creación del grafo con las conexiones especificadas
mi_grafo = Grafo()
mi_grafo.agregar_arista("yo", "Dana")
mi_grafo.agregar_arista("Dana", "Jesus")
mi_grafo.agregar_arista("Dana", "Ariel")
mi_grafo.agregar_arista("Dana", "Jess")
mi_grafo.agregar_arista("Ariel", "yo")
mi_grafo.agregar_arista("Ariel", "Max")
mi_grafo.agregar_arista("Ariel", "Jess")
mi_grafo.agregar_arista("Max", "yo")
mi_grafo.agregar_arista("Max", "Ariel")
mi_grafo.agregar_arista("Max", "Jesus")
mi_grafo.agregar_arista("Jess", "yo")
mi_grafo.agregar_arista("Jess", "Ariel")
mi_grafo.agregar_arista("Jess", "Max")
mi_grafo.agregar_arista("Jesus", "yo")
mi_grafo.agregar_arista("Jesus", "Max")
mi_grafo.agregar_arista("Jesus", "Jess")

# Construcción del árbol a partir del grafo utilizando DFS
nodo_inicio = "yo"
visitados = set()
dfs_arbol(mi_grafo.grafo, nodo_inicio, visitados)
