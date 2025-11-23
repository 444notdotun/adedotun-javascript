
const {startCar,stopCar,setFuelTank,getFuelTank,driveCar} = require("./car"); 

describe("Car Functions", () => {
  test("car can start", () => {
    let carStatus = false;
    carStatus = startCar(carStatus);
    expect(carStatus).toBe(true);
  });

  test("car can be turned off", () => {
    let carStatus = true;
    carStatus = stopCar(carStatus);
    expect(carStatus).toBe(false);
  });

  test("fuel tank can be set within capacity", () => {
    let fuelTank = 0;
    fuelTank = setFuelTank(fuelTank, 20);
    expect(fuelTank).toBe(20);
  });

  test("fuel tank cannot exceed capacity", () => {
    let fuelTank = 0;
    fuelTank = setFuelTank(fuelTank, 60); 
    expect(fuelTank).toBe(0); 
  });

  test("get fuel tank returns current value", () => {
    let fuelTank = 15;
    expect(getFuelTank(fuelTank)).toBe(15);
  });

  test("drive car consumes fuel correctly", () => {
    const distance = 40;
    const fuelConsumed = driveCar(distance, 8); 
    expect(fuelConsumed).toBe(5);
  });
});