import java.util.Scanner;
public class Encrypt{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter 4digits: ");
	int numbers = input.nextInt();
	int [] newNumber = new int [4];
	int moduledNumber = 0;
	
	for(int count = 0;count <= 3 ; count++){
		moduledNumber = numbers%10;
		numbers/=10;
		moduledNumber+=7;
		moduledNumber%=10;

		newNumber[count] = moduledNumber;
	}

	int swap_cont = newNumber[0];
	newNumber[0] = newNumber[2];
	newNumber[2] = swap_cont;
	swap_cont = newNumber[1];
	newNumber[1]= newNumber[3];
	newNumber[3] = swap_cont;
	String userKey="";
	
	for(int count=3; count >= 0; count--){
		System.out.print("hi");
	userKey +=String.valueOf(newNumber[count]);}
	System.out.print("decrypted is " + userKey);
	



































	}
}