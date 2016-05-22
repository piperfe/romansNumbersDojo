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
        if(number == 50){
            return RomanSymbols.fifty();
        }
        if(number == 100){
            return RomanSymbols.onehundred();
        }

        if(number > romanSymbols.previousSymbol(number)
                && number < romanSymbols.followingSymbol(number)){
            return withSymbol(number);
        }


        return null;
    }


    private String withSymbol(int number) {
        int followingSymbol = romanSymbols.followingSymbol(number);
        int previousSymbol = romanSymbols.previousSymbol(number);

        int rest = number % previousSymbol;
        int  numberLeftPreviousSymbol = (number / previousSymbol) * previousSymbol;

        if(number + previousSymbol == followingSymbol){
            return getNumber(previousSymbol) + getNumber(romanSymbols.followingSymbol(number));
        }
        if(number + romanSymbols.previousSymbol(previousSymbol) == followingSymbol){
            return getNumber(romanSymbols.previousSymbol(previousSymbol)) + getNumber(romanSymbols.followingSymbol(number));
        }

        if(rest == 0){
            return getNumber(previousSymbol) + getNumber(number - previousSymbol);
        }
        else{
            return getNumber(numberLeftPreviousSymbol) + getNumber(rest);
        }

    }


}
