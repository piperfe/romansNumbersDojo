package roman.numbers;


import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class RomanSymbols {

    static String one() {
        return "I";
    }

    static String ten() {
        return "X";
    }

    static String five() {
        return "V";
    }

    static String fifty() {
        return "L";
    }

    List<Integer> romanSymbolsNumeric = asList(0,1,5,10,50);

    public Integer previousSymbol(int number) {
        List<Integer> inferiorList = romanSymbolsNumeric.stream().filter(o -> o < number).collect(Collectors.toList());
        return inferiorList.get(inferiorList.size() - 1);
    }

    public Integer followingSymbol(int number) {
        return romanSymbolsNumeric.stream().filter(o -> o > number).collect(Collectors.toList()).get(0);
    }
}
