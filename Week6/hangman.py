print("Welcome to Hangman")

word = "python"

total_guesses = 10

guesses = ""

while total_guesses > 0:
	not_guessed = 0

	for char in word:
		if char in guesses:
			print(char, end='')
		else: 
			print("-", end='') #no space 
			not_guessed += 1
	print()

	if (not_guessed == 0):
		print("Eskedit!")
		break

	user_guess = input("Guess a letter: ")

	if (len(user_guess) > 1):
		print("1 at a time")
		continue

	if user_guess in guesses:
		print("Can't guess the same letter twice.")
		continue # ignor everything after and go back to top of loop

	guesses += user_guess

	if user_guess not in word:
		total_guesses -= 1
		print("oof.")
	print("You have", total_guesses, "guesses left.")

if (total_guesses == 0):
	print("The word was", word)