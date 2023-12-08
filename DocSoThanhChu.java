import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số (0 - 999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
            return;
        }
        if (number < 10) {
            printOneDigitNumber(number);
        }
        else if (number < 20) {
            printTwoDigitNumberLessThanTwenty(number);
        }
        else if (number < 100) {
            printTwoDigitNumberGreaterThanTwenty(number);
        }
        else {
            printThreeDigitNumber(number);
        }
    }
    private static void printOneDigitNumber(int number) {
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            // Add cases for 3, 4, ..., 9
            default:
                System.out.println("Out of ability");
        }
    }
    private static void printTwoDigitNumberLessThanTwenty(int number) {
        switch (number) {
            case 10:
                System.out.println("Ten");
                break;
            case 11:
                System.out.println("Eleven");
                break;
            // Add cases for 12, 13, ..., 19
            default:
                System.out.println("Out of ability");
        }
    }
    private static void printTwoDigitNumberGreaterThanTwenty(int number) {
        int tens = number / 10;
        int ones = number % 10;

        switch (tens) {
            case 2:
                System.out.print("Twenty");
                break;
        }

        if (ones > 0) {
            System.out.print(" ");
            printOneDigitNumber(ones);
        }

        System.out.println();
    }

    private static void printThreeDigitNumber(int number) {
        int hundreds = number / 100;
        int remainingTwoDigits = number % 100;

        printOneDigitNumber(hundreds);
        System.out.print(" Hundred");

        if (remainingTwoDigits > 0) {
            System.out.print(" and ");
            if (remainingTwoDigits < 10) {
                printOneDigitNumber(remainingTwoDigits);
            } else if (remainingTwoDigits < 20) {
                printTwoDigitNumberLessThanTwenty(remainingTwoDigits);
            } else {
                printTwoDigitNumberGreaterThanTwenty(remainingTwoDigits);
            }
        }

        System.out.println();
    }
}



