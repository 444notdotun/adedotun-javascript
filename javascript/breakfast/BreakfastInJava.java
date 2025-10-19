
public class BreakfastInJava{
	public static void main(String ...args){
String name = "adedotun";
	String [] total = {"a","d","e","d","o","t","u","n"};
	for(int count = name.length()-1; count >= 0; count--){
		System.out.print(total[count]); 
	
	}

	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");

	
	int numbers = 12345;
	int [] sum = {1,2,3,4,5};
	for(int count = 4; count >= 0; count--){
		 
		System.out.print(sum[count]); 
	
	}

	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");

	String vowels = "aeiou";
	String letters = "adedotun";
	int vowelcount = 0;
	for(int count = 0; count < letters.length(); count++){
		char newvowel = ' ';
		char newletters = letters.charAt(count);
		
			for(int counting = 0; counting < vowels.length() ;counting++){
				newvowel = vowels.charAt(counting);
				
				if(newletters==newvowel){
					vowelcount++;
					
					break;
				}
			}
				if(newletters==newvowel){
					
					break;
				}

	}
		System.out.print("vowelcount "+ vowelcount);	


			
				
		
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" "); 
	/*letters = "adedotun";
	for(int count = 0; count < letters.length();count++){
		char newletter = letters.charAt(count);
		System.out.print( newletter + " is  " + char newletter);
	} */
		
	
	
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	int average = 0;
	int ofSum = 0;
	for (int count =1 ; count <= 100; count++){
		ofSum+=count;
		average = ofSum/100;
	}
	System.out.print("average is " + average);

	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	int givenNumber = 50;
	ofSum = 0;
	for (int count =2 ; count < givenNumber; count++){
		if (givenNumber%count == 0){
			
		System.out.println(count);
		}
	}
	
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");


	givenNumber = 50;
	ofSum = 0;
	int counter = 0;
	for (int count =2 ; count < givenNumber; count++){
		if (givenNumber%count == 0){
			counter++;
		
		}
	}
	System.out.println(counter);

	

	
	String number = "ada";
	if(number.charAt(0) == number.charAt(2)){
			System.out.print("its a palindrome");
		}
		else{


		System.out.print("its not a palindrome");}




	System.out.println(" ");
	System.out.println(" ");


int new_number = 11211;
int last_numbers = 0;
int first_numbers = 0;
int last_num1 =  0;
int last_num2 = 0;
int first_num1 = 0;
int first_num2 = 0;


	
		last_numbers = new_number % 100;
		first_numbers = new_number / 1000;
		last_num1 = last_numbers % 10;
		last_num2 = last_numbers / 10;
		first_num1 = first_numbers % 10;
		first_num2 = first_numbers / 10;
				
		if (last_num1 == first_num2 && last_num2 == first_num1){
			System.out.print("it is a palindrome");}
			
		else{
			System.out.print("it is not a palindrome");}
		

		System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");	




		
		int base = 2;
		int exponent = 3;
		int result = 1;
		for(int count = 0; count<= exponent;count++){
			
			result*=base;
		}
		System.out.println(base + " raise to the power of "+ exponent +" is" + result);

		
		int numbersIn = 272;
		int even = 0;
		result = 0;
		for(int count = 0; numbersIn != 0 ;count++){
			even = numbersIn % 10;
			numbersIn=numbersIn/10;
			if (even % 2 == 0){
			
				result +=even;
			}	
		}
			System.out.println("even digits in a number " +  result);

		

		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		numbersIn = 272;
		int odd = 0;
		result = 0;
		for(int count = 0; numbersIn != 0 ;count++){
			odd = numbersIn % 10;
			numbersIn=numbersIn/10;
			if (odd % 2 > 0){
			
				result +=odd;
			}	
		}
			System.out.println("odd digits in a number " + result);

				System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		int prime = 0;
		result = 0;
		for (int count = 2; count <= 100; count++){
			int newcount = (int)Math.sqrt(count);
			newcount++;
			int exp = 0;
			for(counter = 2; counter <= newcount;counter++){
				exp = count%counter;
				if(exp == 0 ){
				
				break;}
				
				
				}
				if(exp>0){
				result+=count;
				System.out.println(count);}
				counter = 2;
				
				
			
			
		}








		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");






		int countPrime=0;
		prime = 0;
		result = 0;
		for (int count = 2; count <= 100; count++){
			int newcount = (int)Math.sqrt(count);
			newcount++;
			
			int exp = 0;
			for(counter = 2; counter <= newcount;counter++){
				exp = count%counter;
				if(exp == 0 ){
				
				break;}
				
				
				}
				if(exp>0){
				countPrime++;
				}
				counter = 2;
				
				
			
			
		}
			
		System.out.println(countPrime);


		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");




name = "adedotun is  a boy";
counter=0;
for(int count = 0; count < name.length(); count++){
	
	if( name.charAt(count)== ' '){
		continue;
		
	}else{

	
		counter++;

}
	}

//System.out.print("counter"+counter);

int nameOutput =0;
int newreturn = 0;
name = "11011";
int nameNumber =Integer.parseInt(name);

for(int count = 0; nameNumber != 0;count+=2){
	
	int newNumber = nameNumber%10;
	
	nameNumber/=10;
	
	newreturn +=  newNumber*count;
	


	nameOutput+=newreturn;

}
System.out.print(nameOutput);
	
	







	
	}
}