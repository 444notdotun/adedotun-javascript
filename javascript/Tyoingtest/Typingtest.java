public class Typingtest{

	public String Display(String output){

		return output;
	}


	int total =0;
	public int inputValidator(String input, String output){
	try {
		for (int count = 0; count < output.length(); count++) {
			if (input.charAt(count) == output.charAt(count)) {
				total++;
           		}
     		}
    	}catch(Exception e){
       		System.out.println("Error: " + e.getMessage());
		total-=5;
  	}

    return total;
}


	public String Accuracy(int total,String output){
		double newtotal = total;
		double results = (newtotal/output.length())*100;
		int newresult = (int)results;
		
		return newresult+"%";
	}
	
	
	
	public double wordPerMinute(String words,  double timeInMinute){
		int count = 0;
		int wordcount = 0; 
		while(count < words.length()){
			if (words.charAt(count)!=(' ')){
				wordcount++;
			}
			count++;
		}
		double result = wordcount/timeInMinute;
		
		return result;
	}
}	

	