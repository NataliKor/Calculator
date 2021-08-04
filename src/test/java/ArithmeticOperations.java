import java.util.ArrayList;
import java.util.Arrays;

public class ArithmeticOperations {
    private static final String[] OPERATIONS = {"+", "-", "*", "/"};
    private static final String ERROR_INCORRECT_INPUT = "Неверный ввод. Вводите 2 числа (от 1 до 10 включительно) и 1 арифметическую операцию. Все через пробел";
    private static final String ERROR_RESULT_LESS_THAN_ONE = "Результат меньше 1. В римских цифрах такого числа нет";

    public static int compareTheElementWithArithmeticOperations(String element) {
        int result;
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(OPERATIONS));
        result = arrayList.indexOf(element);
        return result;
    }

    public static int weSolveTheEquation(int index1, int index2, int index3) {
        int oneElement = index1 + 1;
        int threeElement = index3 + 1;
        int result = 0;

        switch (index2) {
            case 0 -> result = oneElement + threeElement;
            case 1 -> result = oneElement - threeElement;
            case 2 -> result = oneElement * threeElement;
            case 3 -> result = oneElement / threeElement;
        }
        return result;
    }

    public static String weSolveTheEquationRomanNumerals(int index1, int index2, int index3) {
        int oneElement = index1 + 1;
        int threeElement = index3 + 1;
        int result = 0;
        String result1;

        switch (index2) {
            case 0 -> result = oneElement + threeElement;
            case 1 -> result = oneElement - threeElement;
            case 2 -> result = oneElement * threeElement;
            case 3 -> result = oneElement / threeElement;
        }

        if (result < 1) {
            try {
                throw new RuntimeException();
            } catch (Exception e) {
                System.out.println(ERROR_RESULT_LESS_THAN_ONE);
                return "";
            }
        } else {
            result1 = RomanNumerals.resultOfEquationRomanNumberToTen(result);
        }
        return result1;
    }

    //проверяем на наличие пробелов
    public static void examinationOne(String str, String[] array) {
        int i = str.indexOf(" ");
        int i2;
        if (i > 0) {
            i2 = str.indexOf(" ", i + 1);
            if (i2 > 0) {
                array[0] = str.substring(0, i);
                array[1] = str.substring(i + 1, i2);
                array[2] = str.substring(i2 + 1);
            }
        } else {
            examination(str, array);
        }
    }

    public static void examination(String str, String[] array) {
        int i = str.indexOf("+");
        if (i > 0) {
            array[0] = str.substring(0, i);
            array[1] = str.substring(i, i + 1);
            array[2] = str.substring(i + 1);
        } else {
            int i1 = str.indexOf("-");
            if (i1 > 0) {
                array[0] = str.substring(0, i1);
                array[1] = str.substring(i1, i1 + 1);
                array[2] = str.substring(i1 + 1);
            } else {
                int i2 = str.indexOf("*");
                if (i2 > 0) {
                    array[0] = str.substring(0, i2);
                    array[1] = str.substring(i2, i2 + 1);
                    array[2] = str.substring(i2 + 1);
                } else {
                    int i3 = str.indexOf("/");
                    if (i3 > 0) {
                        array[0] = str.substring(0, i3);
                        array[1] = str.substring(i3, i3 + 1);
                        array[2] = str.substring(i3 + 1);
                    } else {
                        try {
                            throw new RuntimeException();
                        } catch (Exception o) {
                            System.out.println(ERROR_INCORRECT_INPUT);
                            System.exit(0);
                        }
                    }
                }
            }
        }

    }
}
