import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.maven_github_demo1.App;

public class AppTest {

    App c = new App();

    @Test
    void testAdd() {
        assertEquals(2, c.add(20, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(15, c.subtract(20, 5));
    }
}

