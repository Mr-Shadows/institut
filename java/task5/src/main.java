import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        readNumbers(numbers);
        printOddNumbers(numbers);
    }

    public static void readNumbers(List<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbersArray = input.split(" ");

        for (String numberString : numbersArray) {
            int number = Integer.parseInt(numberString);

            if (number == 0) {
                return;
            }

            numbers.add(number);
        }

        readNumbers(numbers);
    }

    public static void printOddNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}