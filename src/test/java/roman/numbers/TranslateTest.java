package roman.numbers;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static roman.numbers.Translate.*;

public class TranslateTest {

    private Translate translate;

    @Before
    public void setUp() throws Exception {
        translate = new Translate();
    }

    @Test
    public void number_one() throws Exception {
        RomanNumber number = translate.getNumber(1);

        assertThat(RomanNumber.I, is(number));
    }

    @Test
    public void number_two() throws Exception {
        RomanNumber number = translate.getNumber(2);

        assertThat(RomanNumber.II, is(number));
    }

    @Test
    public void number_three() throws Exception {
        RomanNumber number = translate.getNumber(3);

        assertThat(RomanNumber.III, is(number));
    }

    @Test
    public void number_five() throws Exception {
        RomanNumber number = translate.getNumber(5);

        assertThat(RomanNumber.V, is(number));
    }

}