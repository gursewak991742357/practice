
import hockeyregistrar.HockeyRegistrarValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HockeyRegistrarValidatorTest {

    HockeyRegistrarValidator validator = new HockeyRegistrarValidator();

    @Test
    public void testValidateBirthYearValid() {
        assertTrue(validator.validateBirthYear(2009), "Expected true for a birth year of 2009.");
    }
}
