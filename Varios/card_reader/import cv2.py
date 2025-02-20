import cv2
for i in range(5):  # Probar primeros 5 dispositivos
    cap = cv2.VideoCapture(i)
    if cap.isOpened():
        print(f"Dispositivo {i} está disponible")
    else:
        print(f"Dispositivo {i} no está disponible")
