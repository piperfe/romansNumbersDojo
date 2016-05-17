package roman.numbers;

public class Translate {

    private RomanSymbols romanSymbols;

    public Translate(RomanSymbols romanSymbols) {
        this.romanSymbols = romanSymbols;
    }

    public String getNumber(int number) {

        if(number == 1){
            return RomanSymbols.one();
        }
        if(number == 5){
            return RomanSymbols.five();
        }
        if(number == 10){
            return RomanSymbols.ten();
        }

        int previousSymbol = romanSymbols.previousSymbol(number);
        int followingSymbol = romanSymbols.followingSymbol(number);

        if(number + 1 == followingSymbol){
            return withFollowingSymbol(number);
        }

        if(number + 1 == (previousSymbol * (number / 10)) + romanSymbols.previousSymbol(previousSymbol)){
            return withFollowingSymbol(number);
        }

        else if(number > previousSymbol && number < followingSymbol){
            return withSymbol(previousSymbol, number);
        }
        return null;
    }


    private String withFollowingSymbol(int number) {
        int unity = number % 10;
        int numberLeftUnity = (number / 10) * 10;

        if (numberLeftUnity == 0) {
            return romanSymbols.one() + getNumber(romanSymbols.followingSymbol(number));
        }
        else {
            return getNumber(numberLeftUnity) + getNumber(unity);
        }
    }

    private String withSymbol(int previousSymbol, int number) {
        int rest = number % previousSymbol;

        if(rest == 0){
            return getNumber(previousSymbol) + getNumber(number - previousSymbol);
        }
        else{
            return getNumber(previousSymbol) + getNumber(rest);
        }

    }


}
