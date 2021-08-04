import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение. Используйте арабские или римские числа от 1 до 10 включительно, и 1 математическую операцию: +, -, *, /");
        while (true) {
            String enteredString = scanner.nextLine(); //вводим строку в консоль
            String[] array = new String[3];

            if (enteredString.length() < 3) {
                try {
                    throw new RuntimeException();
                } catch (Exception e) {
                    System.out.println("Неверный ввод. Введите 2 числа (от 1 до 10 включительно) и 1 арифметическую операцию! Все через пробел");
                    System.exit(0);
                }
            } else {
                ArithmeticOperations.examinationOne(enteredString, array);

                int oneElementArray = ArabicNumerals.compareTheElementWithArabicNumerals(array[0]);

                if (oneElementArray >= 0) {
                    System.out.println(ArabicNumerals.ifTheFirstNumberIsArabic(oneElementArray, array));
                } else {
                    System.out.println(RomanNumerals.ifTheFirstNumberIsNoArabic(array));
                }
            }
        }
    }
}

