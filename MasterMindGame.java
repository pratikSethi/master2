import java.util.Scanner;

/**
 * Created by patelbh on 7/27/2016.
 */
public class MasterMindGame {
    public static void main(String[] args) {

        int difficulty = getDifficulty();
    }

    public static String getWord (int diff)
    {
        System.out.println("Enter" +diff+ "letter word");
        String s = new String();
        Scanner sc  = new Scanner(System.in());
        s = sc.next();
        while(s.length() != diff)
        {
            System.out.println("Enter correct word");
            s = sc.next();
        }
        System.out.println(s);
        return s;
    }


}
