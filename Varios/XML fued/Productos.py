import xml.etree.ElementTree as ET
from xml.dom import minidom
import sqlite3

def prep_bd(): #Crear una BD en SQLite de ejemplo con una tabla y sus datos
    conn = sqlite3.connect('Tienda.db') #Crea la conexion a la bd
    cursor = conn.cursor() #Cursor es un objeto que permite ejecutar SQL
    
    #Crear tabla productos si no existe
    cursor.execute(''' 
    CREATE TABLE IF NOT EXISTS productos(
        id INTEGER PRIMARY KEY,
        nombre TEXT NOT NULL,
        colores TEXT NULL,
        categoria TEXT NOT NULL,
        precio REAL NOT NULL)
    ''')

    #Insertar datos de ejemplo
    cursor.execute("SELECT COUNT(*) FROM productos")
    if cursor.fetchone()[0] == 0:
        productos_ejemplo = [
            (1,'Aceite','Dorado','Varios', 50.00),
            (2,'Papel','Blanco','Varios', 120.00),
            (3,'Chile Ancho','Verde','Verduras', 6.00)
        ]
        cursor.executemany("INSERT INTO productos VALUES(?,?,?,?,?)", productos_ejemplo)
        print("BD y Tabla productos creadas")
    conn.commit() #Confirma los cambios, los guarda para kuego mandarlos
    conn.close()#Cierra la conexion

    #Exportar de BD a XML
def exportar_datos(nombre_del_archivo):
    conn = sqlite3.connect('Tienda.db') #Conecta con la db
    conn.row_factory = sqlite3.Row #Permite acceder a las columnas por su nombre
    cursor = conn.cursor()
    cursor.execute("SELECT * FROM productos")
    productos = cursor.fetchall() #Obtiene todos los resultados
    conn.close()

    #Crear el XML en memoria
    root_element = ET.Element('productos')
    for producto_row in productos:
        #Por cada producto se crea una etiqueta <producto> y se pone la categoria correspondiente
        producto_element = ET.SubElement(root_element, 'producto', id =str(producto_row['id']), categoria = producto_row['categoria'])
        
        #Crear las subetiquetas con los datos
        ET.SubElement(producto_element, 'nombre').text = producto_row['nombre'] 

        #Se hace una etiqueta colores que contenga la etiqueta color con los datos
        colores_container = ET.SubElement(producto_element, 'colores') #Etiqueta colores como container
        colores_texto = producto_row['colores'] #Guarda la lista de colores en una variable
        if colores_texto: #Divide la cadena por comas en una lista (split(',')) y para cada fragmento aplica .strip()
            lista_colores = [color.strip() for color in colores_texto.split(',')] 
            for color in lista_colores:  #Itera cada color obtenido y crea un subelemento color
                ET.SubElement(colores_container,'color').text = color

        ET.SubElement(producto_element, 'precio', moneda='MXN').text = str(producto_row['precio']) 
        
    #Convertir el XML a string y darle formato
    xml_string = ET.tostring(root_element, 'utf-8')
    reparsed = minidom.parseString(xml_string)
    pretty_xml = reparsed.toprettyxml(indent="  ")

    #Guardar XML en archivo
    nombre = f"{nombre_del_archivo}.xml"
    with open(nombre, 'w', encoding='utf-8') as f:
        f.write(pretty_xml)
        
    print(f"Archivo '{nombre_del_archivo}.xml'generado con exito")

def importar(): #Lee el XML y lo guarda en la DB
    try: 
        tree = ET.parse('nuevos_productos.xml') #Parsea el XML
        root = tree.getroot() #Obtiene la raiz
    except FileNotFoundError:
        print("Archivo no encontrado")
        return 

    conn = sqlite3.connect('Tienda.db')
    cursor = conn.cursor()
        
    #itera sobre cada etiqueta
    for producto_element in root.findall('producto'):
        id = producto_element.get('id')
        if id is None:
            print("Producto sin ID omitido")
            continue
        nombre_element = producto_element.find('nombre')
        if nombre_element is None or nombre_element.text is None:
            print(f"Producto con id {id} no tiene nombre. Omitido")
            continue
        
        colores_element = producto_element.findall('colores/color')
        if colores_element:
            lista_colores =[color.text for color in colores_element if color.text]
            colores = ", ".join(lista_colores)
        else:
            colores_element = producto_element.find('colores')
            if colores_element is not None and colores_element.text and colores_element.text.strip():
                colores = colores_element.text.strip()
            else:
                colores = "Sin color"

        categoria = producto_element.get('categoria')
        if categoria is None:
            categoria_element = producto_element.find('categoria')
            if categoria_element is not None and categoria_element.text:
                categoria = categoria_element.text
            else:
                categoria = "Sin categoría"

        precio_element = producto_element.find('precio')
        precio = precio_element.text if precio_element is not None else None
        
        id = int(id)
        nombre = nombre_element.text
        if precio is None or not precio.strip():
            print(f"Producto con id {id} no tiene precio. Precio puesto a 0")
            precio = 0.0
        else:    
            float(precio)

        #Insertar los datos
        cursor.execute("INSERT INTO productos VALUES(?,?,?,?,?)", (id, nombre, colores, categoria, precio))
    conn.commit()
    conn.close()

    print("Datos XML importados")

#prep_bd()
#exportar_datos("productos_antiguo")
importar()
exportar_datos("productos_nuevo")
