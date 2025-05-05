package fr.epita.tests;

import fr.epita.maths.MathsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit {


    @Test
    public void testFactorial() {
        // given
        Integer number = 5;

        // when
        Integer result = MathsService.factorial(number);

        // then
        Assertions.assertEquals(120, result);
    }

    @Test
    public void testFactorialNegativeInput() {
        // given
        Integer number = -1;
        Exception e = null;

        // when
        try {
            Integer result = MathsService.factorial(number);
        } catch (Exception encounterdException) {
            e = encounterdException;
        }

        // then
        Assertions.assertNotNull(e);
        Assertions.assertTrue(e instanceof IllegalArgumentException);
    }

    @Test
    public void testFactorialWithZero() {
        // given
        Integer number = 0;

        // when
        Integer result = MathsService.factorial(number);

        // then
        Assertions.assertEquals(1, result);
    }
}
