# Class 5 hw
# Write a Python function named max that takes in two numbers and returns the larger number
# def max(a, b):
# 	if (a >= b):
# 		return a
# 	else: 
# 		return b

# my_num = max(7, 28)
# print(my_num)

# Write a function named product that takes in an array of numbers and returns the total product
# def product(arr):
# 	total = 1
# 	for num in arr:
# 		total *= num
# 	return total

# result = product([5, 3, 7])
# print(result)

# Write a function named even_nums that takes an array of numbers and returns an array that only contains even numbers

# def even_nums(arr):
# 	return_arr = []
# 	for num in arr:
# 		if num % 2 == 0:
# 			return_arr.append(num)
# 			print(num)
# 	return return_arr

# result = even_nums([1, 2, 3, 4, 5, 6])
# print(result)

# review: 
# recursion (ex. fibonacci sequence)

# def fib(n):
# 	if n <= 1:
# 		return n
# 	return fib(n - 1) + fib(n - 2)
# result = fib(int(input("Input a #: ")))
# print(result)
# fib_value = input("Input a #: ")
# fib(n) = fib(fib_value)

# factorial without recursion
# def factorial(n):
# 	product = 1
# 	for num in range(1, n+1):
# 		product *= num
# 	return product
# print(factorial(5))
# # vs with recursion
# def factorialRec(n):
# 	# base case
# 	if n == 1:
# 		return n
# 	else:
# 		return n * factorialRec(n -1)
# result = int(input("Enter a number: "))
# if result < 0:
# 	print("Cannot find facotiral on neg number")
# elif result == 0:
# 	print("Factorial of 0 is 1")
# else:
# 	print("Factorial of ", result, " is ", factorialRec(result))

# new content:
# given two strings, return a string in the form shortlongshort
# example: combine("a", "bbb") -> abbba
# def combine(str1, str2):
# 	length1 = len(str1)
# 	length2 = len(str2)
# 	if (length1 > length2):
# 		return str2 + str1 + str2
# 	elif (length1 == length2):
# 		return str1 + str2
# 	else:
# 		return str1 + str2 + str1
# print(combine("hi", "abb"))

# way to return length of a string
def length(str1):
	count = 0
	for letter in str1:
		count += 1
	return count
print(length("Hello"))

# swap first 2 characters of both strings and return both strings with space between them
# str1 = "abc"
# str2 = "xyz"
# -> xyc abz
def mix_up(str1, str2):
	new_str1 = str2[:2] + str1[2:] # string slicing to get characters up to index 2
	new_str2 = str1[:2] + str2[2:]
	return new_str1 + " " + new_str2
print(mix_up("abc", "xyz"))

# to practice python: projecteuler.net
# problem(6) sum square difference 
def euler6():
	sum_of_squares = 0
	square_of_sum = 0
	for num in range(1, 101):
		sum_of_squares += num ** 2
		square_of_sum += num
	square_of_sum = square_of_sum ** 2
	print(sum_of_squares)
	print(square_of_sum)
	return(square_of_sum - sum_of_squares)
print(euler6())