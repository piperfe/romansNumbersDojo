package roman.numbers;

public class Translate {

    public enum RomanNumber {
        I, II, III, V
    }

    public RomanNumber getNumber(int number) {
        if(number == 1){
            return RomanNumber.I;
        }
        else if(number == 2){
            return RomanNumber.II;
        }
        else if(number == 3){
            return RomanNumber.III;
        }
        else if(number == 5){
            return RomanNumber.V;
        }
        return null;
    }
}
