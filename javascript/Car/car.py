def start_car(car_status):
    if car_status is False:
        car_status = True
    return car_status


def stop_car(car_status):
    if car_status is True:
        car_status = False
    return car_status



def set_fuel_tank(fuel_tank, fuel_liters, fuel_tank_capacity=50):
    if fuel_liters <= fuel_tank_capacity:
        if fuel_liters + fuel_tank <= fuel_tank_capacity:
            fuel_tank = fuel_liters
    return fuel_tank


def get_fuel_tank(fuel_tank):
    return fuel_tank


def drive_car(distance, fuel_efficiency=8):
    fuel_consumed = distance // fuel_efficiency
    return fuel_consumed