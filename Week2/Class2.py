my_age = 15
your_age = 25

a = 5
b = 3
a *= b # 15
print(a)

a = 5
b = 2 

# print(a ** b) # ** creates exponent

a = 10
b = 3

print(a / b) # division creates a float?
print(a // b) # answer excluding the remainder
print(a % b) # modulus - gives the remainder 

price = 100.50
tax = 7.25 / 100
tax_price = price * tax

total_price = price + tax_price
print(total_price)
print(round(total_price, 2))

s = "string Lorenzo "
s *= 3
print(s)

# boolean (True or False) - note: Truth statement should be capitalized
isHappy = True 
isHappy = not isHappy # switches the truth value
print(str(isHappy))

character = 'c' # same as char in java. for a single character

introduction = "Hi, my name is Lorenzo. \nWelcome to my python" # \n creates new line. \t is for tabbing one space
string = 'doesn\'t' # in python, cause use single quote but screws up contractions
# if using slash, though, it will understand it is a contraction

# s t r i n g
# 0 1 2 3 4 5   - same as java
# -6 -5  -4  -3  -2  -1
s = "string"
print(len(s)) # will be length + 1 
new_str = s[0:2] # would give between 0 and 2 characters of the index. ex. st
print(new_str)
last_letters = s[-3:] # will take everything from -3 index onward
print(last_letters)
full_str = s[:] # will print full thing. not really used but interesting
print(full_str)

s = "string Lorenzo"
name = s[-7:]
print(name)

# wrong because cant assign variable to index in python
# s[0] = 'j'

random_letter = s[:100]
print(random_letter)

s = "string"
another_str = " Another string"
s += another_str
print(s)
print(s.index("str")) # finds where letters are in the string (only prints out first occurence) 

name = input("Hi my name is ") # needs an input and saves that as variable
age = input("Enter your age: ")
print("Hello " , name , ". You are " , age , " years old.") # commas are same as +