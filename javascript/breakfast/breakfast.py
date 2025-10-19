


name = "adedotun"
total = ["a","d","e","d","o","t","u","n"]
for count in range(len(name)-1, -1, -1):
    print(total[count], end='')
print("\n")
print("\n")
print("\n")

numbers = 12345
sum = [1,2,3,4,5]
for count in range(4, -1, -1):
    print(sum[count], end='')
print("\n")
print("\n")
print("\n")

vowels = "aeiou"
letters = "adedotun"
vowelcount = 0
for count in range(0, len(letters)):
    newvowel = ' '
    newletters = letters[count]
    for counting in range(0, len(vowels)):
        newvowel = vowels[counting]
        if(newletters.lower()==newvowel):
            vowelcount+=1
            break
    if(newletters.lower()==newvowel):
        break
print("vowelcount", vowelcount)

# System.out.print("vowelcount "+ vowelcount);
print("\n")
print("\n")
print("\n")

average = 0
ofSum = 0
for count in range(1, 101):
    ofSum+=count
    average = ofSum//100
print("average is", average)

print("\n")
print("\n")
print("\n")

givenNumber = 50
ofSum = 0
for count in range(2, givenNumber):
    if (givenNumber%count == 0):
        print(count)

print("\n")
print("\n")
print("\n")

givenNumber = 50
ofSum = 0
counter = 0
for count in range(2, givenNumber):
    if (givenNumber%count == 0):
        counter+=1
print(counter)

# System.out.println(" ");
# System.out.println(" ");
# System.out.println(" ");
# letters = "adedotun";
# for(int count = 0; count < letters.length();count++){
# char newletter = letters.charAt(count);
# System.out.print( newletter + " is " + char newletter);
# }

print("\n")
print("\n")
print("\n")

new_number = 11211
last_numbers = 0
first_numbers = 0
last_num1 = 0
last_num2 = 0
first_num1 = 0
first_num2 = 0
last_numbers = new_number % 100
first_numbers = new_number // 1000
last_num1 = last_numbers % 10
last_num2 = last_numbers // 10
first_num1 = first_numbers % 10
first_num2 = first_numbers // 10
if (last_num1 == first_num2 and last_num2 == first_num1):
    print("it is a palindrome")
else:
    print("it is not a palindrome")

# char letter = ' ';
# String number = "adedade";
# for(int count = 0;count < number.length();count++){
# letter = number.charAt(count);
# }
# if(letter== number){
# System.out.print("its a palindrome");
# } else{
# System.out.print("its not a palindrome");}
print("\n")
print("\n")
print("\n")

base = 2
exponent = 3
result = 1
for count in range(0, exponent+1):
    result*=base
print(base, " raise to the power of ", exponent, " is", result)

numbersIn = 272
even = 0
result = 0
for count in range(0, len(str(numbersIn))):
    even = numbersIn % 10
    numbersIn=numbersIn//10
    if (even % 2 == 0):
        result +=even
print("even digits in a number ", result)

numbersIn = 272
odd = 0
result = 0
for count in range(0, len(str(numbersIn))):
    odd = numbersIn % 10
    numbersIn=numbersIn//10
    if (odd % 2 > 0):
        result +=odd
print("odd digits in a number ", result)

prime = 0
result = 0
for count in range(2, 101):
    newcount = int(count ** 0.5)
    newcount+=1
    exp = 0
    for counter in range(2, newcount+1):
        exp = count%counter
        if(exp == 0 ):
            break
    if(exp>0):
        result+=count
        print(count)
    counter = 2

prime = 0
result = 0
for count in range(2, 101):
    newcount = int(count ** 0.5)
    newcount+=1
    countPrime=0
    exp = 0
    for counter in range(2, newcount+1):
        exp = count%counter
        if(exp == 0 ):
            break
    if(exp>0):
        countPrime+=1
    counter = 2
print(countprime)
