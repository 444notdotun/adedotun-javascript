public class Car{
   private boolean carStatus = false; 
   private final int fuelTankCapacity = 50;
   private final int fuelEfficiency = 1;
   private int fuelTank = 0;


   public void setStartCar(){
    if(carStatus == false){
       this.carStatus=true; 
    }
    }

    public void setStopCar(){
        if(carStatus == true){
            this.carStatus = false;
        }
    }
    
    
    public boolean igniteCar(){
        return this.carStatus;
    }

    public void setfuelTank(int fuelLiters){
        if(fuelLiters <= fuelTankCapacity){
            if(fuelLiters+fuelTank <= fuelTankCapacity){
                this.fuelTank =fuelLiters;
            }   
        }
    }

    public int getFuelTank(){
        return this.fuelTank;
    }

    public int driveCar(int distance){
        int fuelConsumed = distance/fuelEfficiency;
        return fuelConsumed;
    } 
}

