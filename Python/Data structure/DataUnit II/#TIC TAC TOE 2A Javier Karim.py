#TIC TAC TOE
import random

def create_board():
    board = [['1', '2', '3'], ['4', 'X', '6'], ['7', '8', '9']]
    return board

def display_board(board):
    for row in board:
        print("+---+---+---+")
        print("| {} | {} | {} |".format(row[0], row[1], row[2]))
    print("+---+---+---+")

def make_move(board, move, symbol): #busca el movimiento proporcionado en el tablero 
    for row in board:               #y lo remplaza con el symbolo del jugador
        if str(move) in row:
            row[row.index(str(move))] = symbol
            break

def check_game_over(board):
    # Checa filas
    for row in board:
        if row[0] == row[1] == row[2]: #verifica si los tres elementos consecutivos en la fila son iguales
            return True, row[0]
    
    # Checa columnas
    for i in range(3):
        if board[0][i] == board[1][i] == board[2][i]:
            return True, board[0][i]
    
    # Checa diagonales
    if board[0][0] == board[1][1] == board[2][2] or board[0][2] == board[1][1] == board[2][0]:
        return True, board[1][1]
    
    # Empates, verifica si todas las casillas del tablero están ocupadas y no hay ganador.
    if all(all(square != str(num) for square in row) for row in board for num in range(1, 10)):
        return True, "Tie"
    
    # Si ninguna de las condiciones anteriores se cumple, se devuelve False y None,
    # lo que significa que el juego no ha terminado todavía.
    return False, None

def play_game():
    board = create_board() #crea la matriz del tablero
    display_board(board)
    turn = 'O' #Esta variable representa el turno actual, comenzando con el jugador 'O'.
    
    while True:
        if turn == 'O':
            move = enter_move(board)
            make_move(board, move, 'O') #valida la entrada y devuelve un movimiento válido.
            display_board(board)
            game_over, result = check_game_over(board)
            
            if game_over:
                if result == 'O':
                    print("You win!")
                elif result == 'X':
                    print("Computer wins!")
                else:
                    print("It's a tie!")
                break
            
            turn = 'X'
        
        else:
            move = computer_move(board) #Se genera un movimiento aleatorio
            make_move(board, move, 'X')
            display_board(board)
            game_over, result = check_game_over(board)
            
            if game_over:
                if result == 'O':
                    print("You win!")
                elif result == 'X':
                    print("Computer wins!")
                else:
                    print("It's a tie!")
                break
            
            turn = 'O'

def enter_move(board):
    while True:
        move = input("Enter your move (1-9): ")
        if move.isdigit(): #Verifica si la entrada es un dígito.
            move = int(move)
            if 1 <= move <= 9:
                row = (move - 1) // 3 #Calcula las coordenadas de fila y columna correspondientes al movimiento
                col = (move - 1) % 3
                if board[row][col] == str(move): #Verifica si la casilla en la posición correspondiente 
                    return move        #al movimiento está disponible compara con el valor convertido a cadena
                else:
                    print("That square is already occupied. Try again.")
            else:
                print("Invalid move. Enter a number from 1 to 9.")
        else:
            print("Invalid input. Enter a number from 1 to 9.")

def computer_move(board): #Se genera un movimiento aleatorio para la maquina
    free_squares = free_fields(board)
    moves = [square[0] * 3 + square[1] + 1 for square in free_squares]
    return random.choice(moves)

def free_fields(board):
    free_squares = [] #crea una lista de casillas disponibles
    for row in range(3):
        for col in range(3):
            if board[row][col] != 'X' and board[row][col] != 'O': 
                #Verifica si la casilla no contiene el símbolos del jugador, significa que la casilla está libre.
                free_squares.append((row, col))
    return free_squares

play_game()
while True:
    print("Do you want to play again?\n a-Yes\n b-No")
    ans= input("")
    if ans == "a" or ans =="A":
        play_game()
    else:
        False
        print("Cya")
