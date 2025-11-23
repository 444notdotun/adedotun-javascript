import unittest

from car import start_car, stop_car, set_fuel_tank, get_fuel_tank, drive_car


class TestCarFunctions(unittest.TestCase):
    def test_start_car(self):
        car_status = False
        car_status = start_car(car_status)
        self.assertTrue(car_status)

    def test_stop_car(self):
        car_status = True
        car_status = stop_car(car_status)
        self.assertFalse(car_status)

    def test_set_fuel_tank_within_capacity(self):
        fuel_tank = 0
        fuel_tank = set_fuel_tank(fuel_tank, 20)  # 20 liters
        self.assertEqual(fuel_tank, 20)

    def test_set_fuel_tank_exceeds_capacity(self):
        fuel_tank = 0
        fuel_tank = set_fuel_tank(fuel_tank, 60)  # exceeds 50 liters
        self.assertEqual(fuel_tank, 0)  # should remain unchanged

    def test_get_fuel_tank(self):
        fuel_tank = 15
        self.assertEqual(get_fuel_tank(fuel_tank), 15)

    def test_drive_car_consumption(self):
        distance = 40
        fuel_consumed = drive_car(distance, fuel_efficiency=8)  # 40/8 = 5
        self.assertEqual(fuel_consumed, 5)

