package mvc.servlet.basic.domain;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class TestClass {

    @Test
    void test() {
        String a  = "AB";
        String result = Optional.of(a).filter(v -> v.startsWith("AB")).orElse("Not AB");
        System.out.println(result);
    }

}
