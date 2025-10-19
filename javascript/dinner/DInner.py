# number = int(input("enter a number for factorial: "))
# count = number
# factorial = 1
# while count > 0:
#     factorial *= count
#     count -= 1
# print("factorial is", factorial)
# print()
# print()
# print()

# firstNumber = int(input("enter number1 for factorial: "))
# secondNumber = int(input("enter number2 for factorial: "))
# smallest = firstNumber
# if secondNumber < smallest:
#     divison = 1
#     smallest = secondNumber
#     while divison != 0:
#         divison = firstNumber % smallest
#         if divison == 0:
#             print("GCD", smallest)
#         else:
#             firstNumber = smallest
#             smallest = divison
# else:
#     divison = 1
#     while divison != 0:
#         divison = secondNumber % smallest
#         if divison == 0:
#             print("GCD", smallest)
#         else:
#             secondNumber = smallest
#             smallest = divison

# firstNumber = int(input("enter number1: "))
# secondNumber = int(input("enter number2: "))
# count = 2
# while count > 0:
#     smallest = secondNumber
#     if firstNumber < smallest:
#         smallest = firstNumber
#         divison = smallest * count
#         if divison % smallest == 0:
#             firstdivison = secondNumber * count
#             if firstdivison % secondNumber == 0:
#                 print("lcm is", firstdivison)
#                 break
#             else:
#                 count += 1
#         else:
#             count += 1
#     else:
#         divison = smallest * count
#         if divison % smallest == 0:
#             firstdivison = firstNumber * count
#             if firstdivison % firstNumber == 0:
#                 print("lcm is", firstdivison)
#                 break
#             else:
#                 count += 1
#         else:
#             count += 1

# sum = 0
# number = 6
# for count in range(1, 6):
#     if number % count == 0:
#         sum += count
# if sum == number:
#     print("it is a perfect number")
# else:
#     print("not a perfect number")

# moduled = 0
# tempnumber = 153
# modsum = 1
# count = 1
# sum = 0
# countnumber = tempnumber
# counter = 0
# while countnumber > 0:
#     countnumber //= 10
#     counter += 1
# newnumber = tempnumber
# while newnumber > 0:
#     moduled = newnumber % 10
#     while count <= counter:
#         modsum *= moduled
#         count += 1
#     sum += modsum
#     modsum = 1
#     count = 1
#     newnumber //= 10
# if sum == tempnumber:
#     print(f"{tempnumber} is an armstrong number")
# else:
#     print(f"{tempnumber} is not an armstrong number")

# tempnumber = 1
# while tempnumber <= 1000:
#     countnumber = tempnumber
#     counter = 0
#     sum = 0
#     while countnumber > 0:
#         countnumber //= 10
#         counter += 1
#     newnumber = tempnumber
#     count = 1
#     while newnumber > 0:
#         moduled = newnumber % 10
#         modsum = 1
#         while count <= counter:
#             modsum *= moduled
#             count += 1
#         sum += modsum
#         count = 1
#         newnumber //= 10
#     if sum == tempnumber:
#         print(tempnumber, "is an armstrong")
#     tempnumber += 1

# number = 1
# while number < 1000:
#     sum = 0
#     for count in range(1, number):
#         if number % count == 0:
#             sum += count
#     if sum == number:
#         print(number, "it is a perfect number")
#     number += 1

# sum = 0
# count = 40585
# number = count
# counter = 0
# while count > 0:
#     counter = count % 10
#     factorial = 1
#     while counter > 0:
#         factorial *= counter
#         counter -= 1
#     sum += factorial
#     count //= 10
# if sum == number:
#     print(number, "is a strong number")

# year = 1900
# while year <= 2025:
#     if year % 4 == 0:
#         if year % 100 == 0:
#             if year % 400 == 0:
#                 print(year)
#         print(year)
#     year += 1

count = 0
year = 1900
while year <= 2025:
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                count += 1
        count += 1
    year += 1
print(count)