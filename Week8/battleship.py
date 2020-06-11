# resources:
# https.//codingbat.com/python
# https.//leetcode.com/problemset/all/?difficulty=Easy

from random import randint

# initialize a board. will be array with subarrays

board = []

turn = 0


for i in range(5): # five rows and colums
	board.append(["0"] * 5)

# print(board)

def print_board(board): # function to print out board
	for arr in board:
		print(" ".join(arr)) # .join joins every element in array with space in between


print("Let's play Battleship!\n")
print("Rows and columns are numbered 0-4\n")
print("You have 4 turns\n")

print_board(board)

ship_row = randint(0, len(board) - 1)
ship_col = randint(0, len(board[0]) - 1) # use board[0] because says how many columns in first subarray (5)??

while True:
	try: #if response gives an error, put diff message
		guess_row = int(input("Guess Row: "))
		guess_col = int(input("Guess Column: "))
	except ValueError:
		print("invalid")
		continue # resets the loop after we get invalid input

	if (guess_row == ship_row) and (guess_col == ship_col):
		print("You sunk my ship!")
		break # stops code/loop
	else: 
		# edge cases
		if (guess_row < 0 or guess_row > 4) or (guess_col < 0 or guess_col > 4):
			print("Input was wrong")
			continue
		elif (board[guess_row][guess_col] == "X"):
			print("You already guessed this!")
			continue
		else:
			print("Missed!")
			board[guess_row][guess_col] = "X"
	
		turn += 1

		print(str(4 - turn) + " turns left")
		print_board(board)

		if turn > 3:
			print("Game over")
			print("Ship was at " + ship_row + ", " + ship_col)
			board[ship_row][ship_col] = "1"
			print_board(board)
			break


