import com.andreym.test.service.TestService;
import com.andreym.test.service.TestServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestServiceImplTest {

    private TestService testService = new TestServiceImpl();


    @Test
    public void testService() {
        assertEquals("Hello Spring MVC Framework!", testService.service());
    }
}