import random

random_num = random.randint(1, 10)

max_chances = 3
user_guesses = 0 

while user_guesses < max_chances:
	guess = int(input("Enter your guess:"))
	if (guess == random_num):
		print("Correct!")
		break
	elif (guess < random_num):
		print("Too small!")
	elif (guess > random_num):
		print("Too Large")
	user_guesses += 1

if user_guesses >= max_chances: 
	print("You have lost. The number is ", random_num)