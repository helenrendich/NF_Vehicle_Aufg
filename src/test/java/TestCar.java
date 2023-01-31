import org.example.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCar {

    @Test
    void testAccelerate () {
        Car car1 = new Car();
        car1.setId(123);
        car1.setName("Porsche");
        car1.setVelocity(130);
        int result = car1.accelerate(20);
        Assertions.assertEquals(150, result);
    }



}
