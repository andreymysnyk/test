import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceImplTest {

    private Service service = new ServiceImpl();


    @Test
    public void testService() {
        assertEquals("Well-done", service.service());
    }
}