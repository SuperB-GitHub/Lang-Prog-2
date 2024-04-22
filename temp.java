import java.util.Arrays;

public class temp {
    public static void main(String[] args) {
        String text = "Вы в курсе, что я вас понял?  вас понял, вы в курсе?";
        String[] words = text.split(" ");
        
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j] + "s") || words[i].equals(words[j] + "ed") || words[i].equals(words[j] + "ing")) {
                    System.out.println("Пара слов: " + words[i] + " и " + words[j]);
                }
            }}}}
