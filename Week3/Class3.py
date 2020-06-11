# x = 1
# s = "This is a string"

# new_str = s[10:16]
# print(new_str)

# s += " another string"
# print(s)

# x = int(input("Enter an integer: ")) # inputs cast a strings
# if x < 0:
# 	print("the value is less than zero")
# elif x == 0:
# 	print("the value is zero")
# elif x <= 1:
# 	print("the value is less than or equal to 1")	
# else:	
# 	print("the value is positive")	
# check out class3.java for more comparatives. pretty much same

# arr = [1, 2, 3, 4, 5]
# print(arr)
# print(arr[1:3]) # inclusive, exclusive
# print(len(arr)) # length of array

# replacing i variable for every value in array (prints the array vertically)
# for i in arr:
# 	print(i) 

# for i in range(5): # or (0:5) instead of (5)
# 	print(i)

# words = ["cat", "dog", "bird"]
# for word in words:
# 	print(word)	

# 0 + 1 + 2 + 3
# print(sum(range(4)))	
# print(list(range(4)))

# arr = list(range(1, 100, 2)) # gives odd numbers
# print(arr)

# determine if n is a prime number 
n = int(input("Input a number: "))
temp = False
for x in range(2, n):
	if (n % x == 0):
		print(n, "is not prime. " , x, " is a factor.")
		print(n, " equals " , x, " * ", n//x)
		temp = True
		break # breaks out of loop because we already know it is divisible
if (temp == False): 
	print(n, " is prime." )			