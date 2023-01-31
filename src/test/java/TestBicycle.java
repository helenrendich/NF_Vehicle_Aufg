import org.example.Bicycle;
import org.example.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBicycle {

    @Test
    void testAccelerateBicycle () {
        Bicycle bicycle1 = new Bicycle();
        bicycle1.setId(123);
        bicycle1.setName("Smart");
        bicycle1.setVelocity(20);
        int result = bicycle1.accelerate(10);
        Assertions.assertEquals(30, result);
    }

    @Test
    void testAccelerateBicycleOver35 () {
        Bicycle bicycle1 = new Bicycle();
        bicycle1.setId(123);
        bicycle1.setName("Smart");
        bicycle1.setVelocity(30);
        int result = bicycle1.accelerate(10);
        Assertions.assertEquals(35, result);
    }
}
