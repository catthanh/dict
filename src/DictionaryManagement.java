import java.util.Scanner;

public class DictionaryManagement {


    public static void insertFromCommandline(Dictionary dictionary) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of words:");
        // number of words
        int n = sc.nextInt();
        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            String eng = sc.next();
            String vie = sc.next();
            dictionary.addWord(eng, vie);
        }

    }
}
