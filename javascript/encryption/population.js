
let population = 8142000000; 
let growthRate = 1.0/100;
console.log(" YEAR \t WORLD POPULATION \t INCREASE IN POPULATION");
                                                                                                                                                                                                            
for(let count = 1; count <= 75; count++){
	
	let populationYears = population*(Math.pow((1+growthRate),count));
	
	let diffrence = populationYears - population;

	console.log(count +"\t" + populationYears+"\t\t\t" + diffrence );
	population = populationYears;
	
}
