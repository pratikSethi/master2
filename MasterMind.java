import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by torap on 7/27/2016.
 */
public class MasterMind {
    public static void main(String[] args) {
        int difficulty=getDifficulty();
        getWordFromUSer(difficulty);
    }
    public static int getDifficulty(){
        int diff;
        int choice=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Difficulty between 3 to 5");
        diff=sc.nextInt();
        return diff;
    }

    public static String getWordFromUSer(int diff) {
        System.out.println("enter"+diff+" letter word");
        String s=new String();
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        while(s.length()!=diff) {
            System.out.println("enter correct word");
            s=sc.next();
        }
        return s;
    }
}
