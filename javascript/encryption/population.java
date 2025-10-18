public class Population{
	public static void main(String ... args){
double population = 8142000000L; 
double growthRate = 1.0/100;
System.out.println(" YEAR \t WORLD POPULATION \t INCREASE IN POPULATION");
                                                                                                                                                                                                            
for(int count = 1; count <= 75; count++){
	
	double populationYears = population*(Math.pow((1+growthRate),count));
	
	double diffrence = populationYears - population;

	System.out.println(count +"\t" + populationYears+"\t\t\t" + diffrence );
	population = populationYears;
	
}













	}

} 