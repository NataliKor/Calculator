import java.util.ArrayList;
import java.util.Arrays;

public class RomanNumerals {
    private static final String[] NUMBERS = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    private static final String ERROR_INCORRECT_INPUT = "Неверный ввод. Вводите 2 числа (от 1 до 10 включительно) и 1 арифметическую операцию. Все через пробел";

    public static int compareTheElementWithRomanNumerals(String element) {
        int result;
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(NUMBERS));
        result = arrayList.indexOf(element);
        return result;
    }

    public static String ifTheFirstNumberIsNoArabic(String[] array) {
        String result = null;
        int oneElementArray = RomanNumerals.compareTheElementWithRomanNumerals(array[0]);
        int twoElementArray = ArithmeticOperations.compareTheElementWithArithmeticOperations(array[1]);
        int threeElementArray = RomanNumerals.compareTheElementWithRomanNumerals(array[2]);

        if (oneElementArray < 0) {
            try {
                throw new RuntimeException();
            } catch (Exception e) {
                System.out.println(ERROR_INCORRECT_INPUT);
                System.exit(0);
            }
        } else {
            if (twoElementArray < 0) {
                try {
                    throw new RuntimeException();
                } catch (Exception e) {
                    System.out.println(ERROR_INCORRECT_INPUT);
                    System.exit(0);
                }
            } else {
                if (threeElementArray < 0) {
                    try {
                        throw new RuntimeException();
                    } catch (Exception e) {
                        System.out.println(ERROR_INCORRECT_INPUT);
                        System.exit(0);
                    }
                } else {
                    result = ArithmeticOperations.weSolveTheEquationRomanNumerals(oneElementArray, twoElementArray, threeElementArray);
                }
            }
        }
        return result;
    }

    //перевод решения уравнения в римское число
    public static String resultOfEquationRomanNumberToTen(int resultArabic) { //1-10
        String resultRoman;
        if (resultArabic > 0 && resultArabic < 11) {
            resultRoman = NUMBERS[resultArabic - 1];
        } else {
            resultRoman = resultOfEquationRomanNumberToTwenty(resultArabic);
        }
        return resultRoman;
    }

    public static String resultOfEquationRomanNumberToTwenty(int resultArabic) { //11-20
        String resultRoman;
        if (resultArabic > 10 && resultArabic < 21) {
            resultRoman = "X" + NUMBERS[resultArabic - 11];
        } else {
            resultRoman = resultOfEquationRomanNumberToThirty(resultArabic);
        }
        return resultRoman;
    }

    public static String resultOfEquationRomanNumberToThirty(int resultArabic) { //21-30
        String resultRoman;
        if (resultArabic > 20 && resultArabic < 31) {
            resultRoman = "XX" + NUMBERS[resultArabic - 21];
        } else {
            resultRoman = resultOfEquationRomanNumberToFourty(resultArabic);
        }
        return resultRoman;
    }

    public static String resultOfEquationRomanNumberToFourty(int resultArabic) { //31-40
        String resultRoman;
        if (resultArabic > 30 && resultArabic < 40) {
            resultRoman = "XXX" + NUMBERS[resultArabic - 31];
        } else {
            if (resultArabic == 40) {
                resultRoman = "XL";
            } else {
                resultRoman = resultOfEquationRomanNumberToFifty(resultArabic);
            }
        }
        return resultRoman;
    }

    public static String resultOfEquationRomanNumberToFifty(int resultArabic) { //41-50
        String resultRoman;
        if (resultArabic > 40 && resultArabic < 50) {
            resultRoman = "XL" + NUMBERS[resultArabic - 41];
        } else {
            if (resultArabic == 50) {
                resultRoman = "L";
            } else {
                resultRoman = resultOfEquationRomanNumberToSixty(resultArabic);
            }
        }
        return resultRoman;
    }

    public static String resultOfEquationRomanNumberToSixty(int resultArabic) { //51-60
        String resultRoman;
        if (resultArabic > 50 && resultArabic < 61) {
            resultRoman = "L" + NUMBERS[resultArabic - 51];
        } else {
            resultRoman = resultOfEquationRomanNumberToSeventy(resultArabic);
        }
        return resultRoman;
    }

    public static String resultOfEquationRomanNumberToSeventy(int resultArabic) { //61-70
        String resultRoman;
        if (resultArabic > 60 && resultArabic < 71) {
            resultRoman = "LX" + NUMBERS[resultArabic - 61];
        } else {
            resultRoman = resultOfEquationRomanNumberToEighty(resultArabic);
        }
        return resultRoman;
    }

    public static String resultOfEquationRomanNumberToEighty(int resultArabic) { //71-80
        String resultRoman;
        if (resultArabic > 70 && resultArabic < 81) {
            resultRoman = "LXX" + NUMBERS[resultArabic - 71];
        } else {
            resultRoman = resultOfEquationRomanNumberToNinety(resultArabic);
        }
        return resultRoman;
    }

    public static String resultOfEquationRomanNumberToNinety(int resultArabic) { //81-90
        String resultRoman;
        if (resultArabic > 80 && resultArabic < 90) {
            resultRoman = "LXXX" + NUMBERS[resultArabic - 81];
        } else {
            if (resultArabic == 90) {
                resultRoman = "XC";
            } else {
                resultRoman = resultOfEquationRomanNumberToHundred(resultArabic);
            }
        }
        return resultRoman;
    }

    public static String resultOfEquationRomanNumberToHundred(int resultArabic) { //91-100
        String resultRoman = null;
        if (resultArabic > 90 && resultArabic < 100) {
            resultRoman = "XC" + NUMBERS[resultArabic - 91];
        }
        if (resultArabic == 100) {
            resultRoman = "C";
        }
        return resultRoman;
    }
}
