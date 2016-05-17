package roman.numbers;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TranslateTest {

    private Translate translate;

    private RomanSymbols romanSymbols = new RomanSymbols();

    @Before
    public void setUp() {

        translate = new Translate(romanSymbols);
    }

    @Test
    public void number_one() {
        assertThat(translate.getNumber(1), is("I"));
    }

    @Test
    public void number_two() {
        assertThat(translate.getNumber(2), is("II"));
    }

    @Test
    public void number_three() {
        assertThat(translate.getNumber(3), is("III"));
    }

    @Test
    public void number_five() {
        assertThat(translate.getNumber(5), is("V"));
    }

    @Test
    public void number_four() {
        assertThat(translate.getNumber(4), is("IV"));
    }

    @Test
    public void number_six() {
        assertThat(translate.getNumber(6), is("VI"));}

    @Test
    public void number_seven() {
        assertThat(translate.getNumber(7), is("VII"));
    }

    @Test
    public void number_eight() {
        assertThat(translate.getNumber(8), is("VIII"));
    }

    @Test
    public void number_nine() {
        assertThat(translate.getNumber(9), is("IX"));
    }

    @Test
    public void number_eleven() {
        assertThat(translate.getNumber(11), is("XI"));
    }

    @Test
    public void number_thirteen() {
        assertThat(translate.getNumber(13), is("XIII"));
    }

    @Test
    public void number_fourteen() {
        assertThat(translate.getNumber(14), is("XIV"));
    }

    @Test
    public void number_twenty() {
        assertThat(translate.getNumber(20), is("XX"));
    }

    @Test
    public void number_twentyfour() {
        assertThat(translate.getNumber(24), is("XXIV"));
    }

    @Test
    public void number_thirtyfour() {
        assertThat(translate.getNumber(34), is("XXXIV"));
    }



}