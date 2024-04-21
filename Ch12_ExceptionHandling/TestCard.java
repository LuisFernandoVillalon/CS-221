public class TestCard
{
    public static void main(String[] args)
    {
      String[] ranks = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
      String[] suits = {"spades", "hearts", "diamonds", "clubs"};
      Card c = new Card("ace", "spades");
      System.out.println(c);
    }
}