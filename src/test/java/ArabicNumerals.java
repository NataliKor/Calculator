import java.util.ArrayList;
import java.util.Arrays;

public class ArabicNumerals {
    private static final String[] NUMBERS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private static final String ERROR_INCORRECT_INPUT = "Неверный ввод. Вводите 2 (от 1 до 10 включительно) числа и 1 арифметическую операцию. Все через пробел";

    public static int compareTheElementWithArabicNumerals(String element) {
        int result;
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(NUMBERS));
        result = arrayList.indexOf(element);
        return result;
    }

    public static int ifTheFirstNumberIsArabic(int oneElementArray, String[] array) {
        int result = 0;
        int twoElementArray = ArithmeticOperations.compareTheElementWithArithmeticOperations(array[1]);
        int threeElementArray = ArabicNumerals.compareTheElementWithArabicNumerals(array[2]);

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
                result = ArithmeticOperations.weSolveTheEquation(oneElementArray, twoElementArray, threeElementArray);
            }
        }
        return result;
    }
}

