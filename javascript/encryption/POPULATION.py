public class Population{
	public static void main(String ... args){
long population = 8142000000L; 
long growthRate = 1.0/100;
System.out.println(" YEAR \t WORLD POPULATION \t INCRE0ASEIN POPULATION");
                                                                                                                                                                                                            
for(double count = 1; count <= 75; count++){
	
	long populationYears = population*(Math.pow((1+growthRate),count));
	long diffrence = populationYears - population;

	System.out.println(count +"\t" + populationYears+"\t" + diffrence );
	population = populationYears;
}













	}

} 