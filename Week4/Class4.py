# n = int(input("input a number: "))
# # temp = False
# # for x in range(2, n):
# #	if (n % x == 0):
# #		print(n, 'equals', x, '*', n//x)
# #		temp = True
# #		break
# # if (temp == False):
# #	print(str(n) + " is a prime number")

# # defining prime(n)
# def prime(n):
# 	for x in range(2,n):
# 		if (n % x == 0):
# 			print(n, 'equals', x, '*', n//x)
# 			return False
# 	return True

# # print(prime(n))

# # 'hi', 2 -> 'hihi'
# def string_times(temp, n):
# 	s = ""
# 	for i in range(n):
# 		s += temp
# 	return s

# print(string_times("hi", 5)) # print 5 times

# arr = [100, 2, 3, 4, 20]
# if 20 in arr:
# 	print("20 is in the array")

# # arr.extend( [2, 5]) # extends list?
# arr.remove(20) # removes an element
# arr.sort() # sorts from least to greatest
# arr.insert(2, 50) # inserts in 50
# print(arr)

# [1,1,2,3,1] -> True (because sub array (123) in array)
# def array123(nums):
# 	for i in range(len(nums) - 2):
# 		if (nums[i] == 1 and nums[i+1] == 2 and nums[i+2] == 3):
# 			return True
# 		return False
# print(array123([1,1,2 ,3]))

# coord = [[1, "hi"], [2, "hello"], [4,5]]
# for s in coord:
# 	print(str(s[0]) + " , " + str(s[1]))

# print(coord[0][1])

#recursion - calling a function from a function
# def foo(x):
# 	print(x)
# 	return x + 1

# def bar(y, x):
# 	print(x-y)

# # bar(foo(10), 11) # function within another function
# z = foo
# print(z(111))

# fibonacci sequence
# n = 0 1 2 3 4 5 6 
# 	  0 1 1 2 3 5 8 13 
def fib(n):
	# base case
	if n <= 1:
		return n
	#recursive call
	return fib(n - 1) + fib(n - 2)
print(fib(7))
# if fib(3) -> fib(2) + fib(1)
# fib(1) + fib(0) + 1
# 1 +      0 +      1
# 2







