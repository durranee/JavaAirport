import org.junit.Test;

import static junit.framework.TestCase.assertTrue;


public class AirportTest {

    @Test
    public void AirportShouldHaveAnArrayforHangars() {
        Airport airport = new Airport();
        assertTrue(airport.hangar instanceof int[]);

    }

}