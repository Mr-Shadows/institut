import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Queue<Integer> player1Deck = new LinkedList<>();
        Queue<Integer> player2Deck = new LinkedList<>();

        //int[] player1Deck = new int[10];
        //int[] player2Deck = new int[10];

        Random random = new Random();

        for (int i = 0; i < 5; i++)
        {

            player1Deck.add(random.nextInt(10));
            player2Deck.add(random.nextInt(10));
            //player2Deck.add(i);
        }

        System.out.println("Player 1: " + player1Deck);
        System.out.println("Player 2: " + player2Deck);

        int rounds = 0;

        while (!player1Deck.isEmpty() && !player2Deck.isEmpty())
        {
            int player1Card = player1Deck.poll();
            int player2Card = player2Deck.poll();

            if (player1Card == 0 && player2Card == 9)
            {
                player1Deck.add(player1Card);
                player1Deck.add(player2Card);
            }
            else if (player2Card == 0 && player1Card == 9)
            {
                player2Deck.add(player1Card);
                player2Deck.add(player2Card);
            }
            else if (player1Card > player2Card)
            {
                player1Deck.add(player1Card);
                player1Deck.add(player2Card);
            }
            else
            {
                player2Deck.add(player1Card);
                player2Deck.add(player2Card);
            }
            if (rounds >= 106)
            {
                System.out.println("botva");
                return;
            }
            rounds++;
        }

        if (player1Deck.isEmpty())
        {
            System.out.println("Player 2 wins after " + rounds + " rounds!");
        }
        else
        {
            System.out.println("Player 1 wins after " + rounds + " rounds!");
        }
    }
}