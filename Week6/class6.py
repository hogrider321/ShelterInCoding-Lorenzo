# find if string is part of second string
# and - hello - False
# and - sand - True

def is_substring(str1, str2):
	if str1 in str2:
		return True
	return False

# print(is_substring("and", "sand"))

#creating a dictionary
# every key corresponds to a value (dont have to be same type)

dictionary = {
	"brand": "Ford",
	"model": "Mustang",
	"year": 1995
}

# print(dictionary)
# print(dictionary["model"])
# print(dictionary.get[("model")])

dictionary["year"] = 2020
# print(dictionary)

# looping through dictionary
# for key in dictionary:
# 	print(key)
# 	print(dictionary[key])

# for value in dictionary.values():
# 	print(value)

# for key, value in dictionary.items():
# 	print(key, value)

students = ["Bob", "Jill", "Joe", "Sue"]
grades = [85, 98, 75, 91]

def create_dictionary(list1, list2):
	my_dict = {}
	for student, grade in zip(list1, list2): #zip allows you to go through lists at same time
		my_dict[student] = grade 
	return my_dict

student_dict = create_dictionary(students, grades)
# print(student_dict)

# find student with the highest grade
def highest_grade(student_dict):
	max_grade = 0
	max_student = ""
	for student in student_dict:
		if (student_dict[student] > max_grade):
			max_grade = student_dict[student]
			max_student = student
	print(max_student, "had the highest grade with a ", max_grade)
highest_grade(student_dict)

