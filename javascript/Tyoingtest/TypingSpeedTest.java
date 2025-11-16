import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;

public class TypingSpeedTest{
	public static void  main(String ... args){
		Typingtest typingtest = new Typingtest();
		Scanner input = new Scanner(System.in);

		System.out.println("I LOVE PROGRAMMING");
		System.out.print("READY FOR THE TEST?(YES OR NO) ");
		String choice =input.nextLine();
		choice = choice.toLowerCase();
		switch(choice){
			case "yes"->{
			System.out.println("time starts now");
	
			Instant start = Instant.now();
			String typedWords = input.nextLine();
			Instant end = Instant.now();
		
			long result = Duration.between(start,end).getSeconds();
		
			int results = (int) result;
			System.out.println("timetaken"+" "+ results+ " seconds");
	
			String output = "I LOVE PROGRAMMING";
		
			int total = typingtest.inputValidator(output,typedWords);
		
			System.out.println("ACCURACY PERCENTAGE "+typingtest.Accuracy(total,output));
			double minutes = results/60.0;
			double finalresult = typingtest.wordPerMinute(typedWords,minutes);
			System.out.printf("Words perminute %.2f",finalresult);
			}
			case "no"->{
				System.out.print("okey!!!");
				}
			default-> {System.out.print("enter a valid input");}
		}
	}	
}
		
		
		