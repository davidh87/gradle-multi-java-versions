import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class Java8Test {

    @Test
    void shouldPass() {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");

        String property = System.getProperty("java.version");
        assertEquals("1.8.0_232", property);

        try {
            Runtime.runFinalizersOnExit(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(2, set.size());
    }
//
//    @Test
//    void shouldFail() {
//        fail("Always fails");
//    }
}
