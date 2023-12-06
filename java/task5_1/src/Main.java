import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class main
{
    public main(){}

    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList();
    }

    public static void readNumbers(List<Integer> numbers)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbersArray = input.split("");
        String[] var4 = numbersArray;
        int var5 = numbersArray.length;

        for (int var6 = 0; var6 < var5; ++var6)
        {
            String numberString = var4[var6];
            int number = Integer.parseInt(numberString);
            if (number == 0)
            {
                return;
            }
            number.add(number);
        }
        readNumbers(numbers);
    }

    public static void readOddNumber(List<Integer> numbers)
    {
        Iterator var1 = numbers.iterator();

        while(var1.hasNext())
        {
            int number = (Integer)var1.next();
            int count = 1;
            if (count != 0)
            {

            }
        }
    }

}