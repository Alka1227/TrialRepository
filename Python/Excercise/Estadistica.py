P_A1 = 0.2  
P_A2 = 0.2 
P_A3 = 0.6 

P_B_given_A1 = 0.75 
P_B_given_A2 = 0.5   
P_B_given_A3 = 0.2 

numerador = P_B_given_A1 * P_A1
denominador = (P_B_given_A1 * P_A1) + (P_B_given_A2 * P_A2) + (P_B_given_A3 * P_A3)

P_A1_given_B = numerador / denominador
print("Probabilidad de que el directivo seleccionado al azar sea ingeniero", P_A1_given_B)
