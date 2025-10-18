import java.util.Scanner;
public class Dinner{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter a number for factorial: ");
	int number =input.nextInt();
	int count = number
	int factorial= 1
	while(count > 0):
		factorial *= count
		count-=1

	print("factorial" + factorial)


System.out.print(" ");
System.out.print(" ");
System.out.print(" ");



	
		
			System.out.print("enter a number: ");
			int number1 = input.nextInt();
	
			count = 2;
			int solution = 0;
			int div1 = number1; 

			while( div > 1){
				int nun = div % count;

				if( nun == 0 ){
					solution += count;
				
					div = div / count;
					
				}
				else {
			 		count++;
					
				}
						
				
			}
			
			System.out.println(solution);
			
}





			
			
			int mod = 0;
			int tempnumber = 153;
			int modsum = 1;
			int count = 1;
			int sum = 0;
			
			while(tempnumber > 0){
				mod = tempnumber % 10;
				
				while(count != 4){

					modsum *= mod;

					count++;
											
				}
				sum += modsum;
				
				modsum = 1;
				count = 1;	
				tempnumber = tempnumber / 10;
			
				
			}

			if( sum == number){
				 
					System.out.printf("%d is a armstrong number",number);

				}
				else{
				System.out.printf("%d is a not armstrong number %n",number);
				}
		
		}

	}








			mod = 0;
			tempnumber = 153;
			int modsum = 1;
			int count = 1;
			int sum = 0;
			
			while(tempnumber > 0){
				mod = tempnumber % 10;
				
				while(count != 4){

					modsum *= mod;

					count++;
											
				}
				sum += modsum;
				
				modsum = 1;
				count = 1;	
				tempnumber = tempnumber / 10;
			
				
			}

			if( sum == number){
				 
					System.out.printf("%d is a armstrong number",number);

				}
				else{
				System.out.printf("%d is a not armstrong number %n",number);
				}
		
		}

	}


/*
if(year % 4 == 0){
	if(year % 100 == 0){
		if (year % 400 == 0){
			return true;}
	return false;
	}
return true;
}
return false;
}

*/











