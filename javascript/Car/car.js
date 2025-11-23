function startCar(carStatus) {
  if (carStatus === false) {
    carStatus = true;
  }
  return carStatus;
}

function stopCar(carStatus) {
  if (carStatus === true) {
    carStatus = false;
  }
  return carStatus;
}

function setFuelTank(fuelTank, fuelLiters, fuelTankCapacity = 50) {
  if (fuelLiters <= fuelTankCapacity) {
    if (fuelLiters + fuelTank <= fuelTankCapacity) {
      fuelTank = fuelLiters;
    }
  }
  return fuelTank;
}

function getFuelTank(fuelTank) {
  return fuelTank;
}

function driveCar(distance, fuelEfficiency = 8) {
  const fuelConsumed = Math.floor(distance / fuelEfficiency);
  return fuelConsumed;
}
module.exports={startCar,stopCar,setFuelTank,getFuelTank, driveCar}