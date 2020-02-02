import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class Java11Test {

    @Test
    void shouldPass() {
        Set<String> set = Set.of("one", "two");
        assertEquals(2, set.size());
    }

//    @Test
//    void shouldFail() {
//        fail("Always fails");
//    }
}
