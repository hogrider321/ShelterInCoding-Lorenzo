# keep board as a dictionary
# key: value
# '1': '1'
# '2': '2'
# ... 
theBoard = {}
board_keys = ['1', '2', '3', '4', '5', '6', '7', '8', '9']

for key in board_keys:
	theBoard[key] = str(key)

def printBoard(board):
	print(board['1'] + '|' + board['2'] + '|' + board['3'])
	print('-----')
	print(board['4'] + '|' + board['5'] + '|' + board['6'])
	print('-----')
	print(board['7'] + '|' + board['8'] + '|' + board['9'])

def checkWin(board, turn):
	if board['1'] == board['2'] == board['3']:
		printBoard(board)
		print("\nGame Over!\n")
		print(turn + " has won!")
		return True
	elif board['4'] == board['5'] == board['6']:
		printBoard(board)
		print("\nGame Over!\n")
		print(turn + " has won!")
		return True
	elif board['7'] == board['8'] == board['9']:
		printBoard(board)
		print("\nGame Over!\n")
		print(turn + " has won!")
		return True
	elif board['1'] == board['5'] == board['9']:
		printBoard(board)
		print("\nGame Over!\n")
		print(turn + " has won!")
		return True
	elif board['3'] == board['5'] == board['7']:
		printBoard(board)
		print("\nGame Over!\n")
		print(turn + " has won!")
		return True
	elif board['1'] == board['4'] == board['7']:
		printBoard(board)
		print("\nGame Over!\n")
		print(turn + " has won!")
		return True
	elif board['2'] == board['5'] == board['8']:
		printBoard(board)
		print("\nGame Over!\n")
		print(turn + " has won!")
		return True
	elif board['3'] == board['6'] == board['9']:
		printBoard(board)
		print("\nGame Over!\n")
		print(turn + " has won!")
		return True
	return False

def game():
	turn = 'X'
	num_moves = 0

	while True:
		printBoard(theBoard)
		print("Turn: " + turn)
		move = input("Where would you like to place your " + turn + "\n")
	
		try:
			checkMove = theBoard[move] == str(move)
		except KeyError:
			print("invalid, try again!")

		if theBoard[move] == str(move):
			theBoard[move] = turn
			num_moves += 1
		else: 
			print("That place has already been filled.")
			continue

		if checkWin(theBoard, turn):
			break

		if num_moves == 9:
			printBoard(theBoard)
			print("Game Over!")
			print("Tie!")
			break

		if turn == 'X':
			turn = 'O'
		else:
			turn = "X"
	restart = input("Play again?(y/n)")
	if restart == 'y' or restart == 'Y':
		for key in board_keys:
			theBoard[key] = key
		game()

game()