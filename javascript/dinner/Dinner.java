import java.util.Scanner;
public class Dinner{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
/*
	System.out.print("enter a number for factorial: ");
	int number =input.nextInt();
	int count = number;
	int factorial= 1;
	while(count > 0){
		factorial *= count;
		count-=1;
	}

	System.out.print("factorial is " + factorial);


System.out.print(" ");
System.out.print(" ");
System.out.print(" ");



System.out.print("enter number1 for factorial: ");
int firstNumber =input.nextInt();
System.out.print("enter number2 for factorial: ");
int secondNumber =input.nextInt();

int smallest = firstNumber;
if(secondNumber < smallest){
	int divison = 1;
	smallest = secondNumber;
	while(divison != 0){
	divison = firstNumber%smallest;
	
	if(divison == 0){
		System.out.print( "GCD " + smallest);
	}
	else{
	firstNumber = smallest;
	smallest = divison;}
	
	}
	

}
else{
	int divison = 1;
	while(divison != 0){
	divison = secondNumber%smallest;
	if(divison == 0){
		System.out.print( "GCD " + smallest);
	}
	else{
	secondNumber = smallest;
	smallest = divison;
		}
	}

}


System.out.print("enter  number1: ");
int
firstNumber = input.nextInt();
System.out.print("enter  number2: ");
int secondNumber = input.nextInt();

int count = 2;
while (count > 0){
int smallest = secondNumber;
if(firstNumber < smallest){
	smallest = firstNumber;
	int divison = smallest*count;
	if(divison % smallest == 0){
		int firstdivison = secondNumber * count;
		if(firstdivison % secondNumber == 0){
			System.out.print("lcm is "+ firstdivison);
			break;
		}
		else{
			count++;
		}
	}
	else{
		count++;
	}
}

else{
int divison = smallest*count;
if(divison % smallest == 0){
  	int firstdivison = firstNumber * count;
	if(firstdivison % firstNumber == 0){
		System.out.print("lcm is "+ firstdivison);
		break;
	}
	else{
		count++;
	}
}
else{
	count++;
}
}
}



int sum = 0;
int number = 6;
for(int count = 1; count < 6; count++){
	if(number%count == 0){
		sum+=count;}
}

if (sum == number){
	System.out.print("it is a perfect number");
}
else{
	System.out.print("not a perfect number");
}



		
int moduled = 0;
int tempnumber = 153;
int modsum = 1;
int count = 1;
int sum = 0;
int countnumber=tempnumber;
int counter =0;
while(countnumber > 0){

	countnumber/=10;
	counter++;
}

int newnumber = tempnumber;
while(newnumber > 0){
	moduled = newnumber % 10;
	while(count <= counter){
		modsum *= moduled;
		count++;
											
	}
	sum += modsum;
	modsum = 1;
	count = 1;	
	newnumber /=10;
}

if( sum == tempnumber){
	System.out.printf("%d is a armstrong number",tempnumber);
}
else{
	System.out.printf("%d is a not armstrong number %n",tempnumber);
}
	

	



int moduled = 0;
int tempnumber = 1;

int count = 1;

while(tempnumber <= 1000){
int countnumber=tempnumber;
int counter =0;
int sum = 0;
while(countnumber > 0){

	countnumber/=10;
	counter++;
}

int newnumber = tempnumber;
while(newnumber > 0){
	moduled = newnumber % 10;
	int modsum = 1;
	while(count <= counter){
		modsum *= moduled;
		
		count++;
											
	}

	sum += modsum;
	
	count = 1;	
	newnumber /=10;
}

if(sum == tempnumber){
System.out.println(tempnumber + " is a armstrong");
}
	
tempnumber++;
}





int number = 1;
while(number < 1000){
int sum = 0;
for(int count = 1; count < number; count++){
	if(number%count == 0){
		sum+=count;}
}

if (sum == number){
	System.out.println(number + " it is a perfect number");
}

number++;
}


int sum = 0;
int count =40585;
int number = count;
int counter = 0;
while(count > 0){
	counter = count % 10;
	int factorial= 1;
	while(counter > 0){
		factorial *= counter;
		counter--;
	
	}
sum +=factorial;
count/=10;

}

if( sum == number){
System.out.println(number+ " is a strong number");	
}



int year = 1900;		
while(year <=2025){
if(year % 4 == 0){
	if(year % 100 == 0){
		if (year % 400 == 0){
			System.out.println(year);
		}
	}
System.out.println(year);
}


year++;
}
*/
int count = 0;
int year = 1900;		
while(year <=2025){
if(year % 4 == 0){
	if(year % 100 == 0){
		if (year % 400 == 0){
			count++;
		}
	}
count++;
}


year++;
}
System.out.print(count);

}
}











