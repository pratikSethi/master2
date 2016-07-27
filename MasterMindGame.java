import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class MasterMindGame {
    public static String wordWithUniqueLetters(int difficulty){
        ArrayList<String> lines =getLines("src\\sowpods.txt");
        ArrayList<String> words = new ArrayList<>();
        for (String line : lines){
            String[] wordsInLine = getWords(line);
            for(String string : wordsInLine) {
                words.add(string);
            }
        }
        int randomNum = (int) (Math.random() * 50 + 1);
        String requiredWord = words.get(randomNum);
        return requiredWord;
    }
    public static String[] getWords(String line) {
        return line.replaceAll("[[^a-zA-Z]&&[^a-zA-z'a-zA-Z]]", " ").split(" +");
    }
    public static ArrayList<String> getLines (String filename){
        File f = new File(filename);
        BufferedReader br = null;
        ArrayList<String> lineArray = new ArrayList<>();
        try{
            FileReader fr = new FileReader(f);
            br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                lineArray.add(line);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("error");
        }
        catch (IOException e){
            System.out.println("can't read");
        }
        try{
            br.close();
        }
        catch(IOException e){
            System.out.println("can't close");
        }
        catch(NullPointerException e){
            System.out.println("File never opened");
        }
        return lineArray;
    }
}