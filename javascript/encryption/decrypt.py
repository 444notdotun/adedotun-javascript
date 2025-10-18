numbers = int(input("enter 4digits: "))
new_number=[]
for count in range(4):
	moduled_number = numbers%10
	numbers//=10
	moduled_number-=7
	moduled_number+=10
	if moduled_number > 10:
		moduled_number%=10
	new_number.append(moduled_number)

swap_cont = new_number[2]
new_number[2] = new_number[0]
new_number[0] = swap_cont
swap_cont = new_number[3]
new_number[3]= new_number[1]
new_number[1] = swap_cont
user_key=""
for count in range(-1,-5,-1):
	user_key +=str(new_number[count])
print("decrypted is " + user_key)
