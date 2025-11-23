import org.junit.jupiter.api. *;
import static org.junit.jupiter.api.Assertions. *;
public class carTest {
    Car cars;
    @BeforeEach
    void setValue(){
        cars = new Car();
    }

    @Test
    public void testThatCarCanStart(){
        cars.setStartCar();
        assertEquals(cars.igniteCar(),true);
    }

@Test
public void testThatCarCanbeTurnedOff(){
cars.setStartCar();
cars.setStopCar();
assertEquals(cars.igniteCar(),false);
}
    
    
    
}