
	
	let prompt = require("prompt-sync")();
	let numbers = prompt("enter a value: ");
	
	let newNumber =  [];
	let moduledNumber = 0;
	
	for(let count = 0;count <= 3 ; count++){
		moduledNumber =numbers%10;
	
		numbers=Math.floor(numbers/10);
		moduledNumber-=7;
		moduledNumber+=10;
		if (moduledNumber > 10){
		moduledNumber%=10;}

		newNumber[count] = moduledNumber;
	}

	let swap_cont = newNumber[2];
	newNumber[2] = newNumber[0];
	newNumber[0] = swap_cont;
	swap_cont = newNumber[3];
	newNumber[3]= newNumber[1];
	newNumber[1] = swap_cont;
	let userKey="";
	

/*
//Just created a Register Api for you
//You can send your appreciation message later
//And yes, you're welcome


@PostMapping("registerUser")
public ResponseEntity<?> registerUser(@RequestBody RegisterUserRequest request){
		RegisterUserResponse response = userService.registerUser(request);
		return ResponseEntity.status(HttpStatus.Created).body(response);

}




*/


	for(let count=3; count >= 0; count--){
	userKey +=newNumber[count].toString();}
	console.log("decrypted is " + userKey);


	
