import java.util.Scanner;

public class DictionaryCommandline {
    public static void showAllWords(Dictionary dictionary) {
        System.out.println("No\t| English\t| Vietnamese");

        for (int i = 0; i < dictionary.getDictSize(); i++) {
            dictionary.showWord(i);
        }

    }

    enum Phase {
        MENU,
        ADD,
        SHOW
    }

    public static void dictionaryBasic() {
        Dictionary dict = new Dictionary();
        boolean running = true;
        boolean menu = true;
        Phase appPhase = Phase.MENU;

        while (running) {
            switch (appPhase) {
                case MENU: {
                    System.out.println("Input 'i' to add words");
                    System.out.println("Input 's' to show all words");
                    System.out.println("Input 'x' to exit");

                    break;
                }
                case ADD: {
                    System.out.println("Add new words:");
                    DictionaryManagement.insertFromCommandline(dict);
                    System.out.println("Input 'i' to keep adding words");
                    System.out.println("Input 's' to show all words");
                    System.out.println("Input 'x' to exit");

                    break;
                }
                case SHOW: {
                    showAllWords(dict);
                    System.out.println("Input 'i' to add words");
                    System.out.println("Input 'x' to exit");
                }
            }
            //clrscr();
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);
            switch (c) {
                case 'i': {
                    appPhase = Phase.ADD;
                    break;
                }
                case 's': {
                    appPhase = Phase.SHOW;
                    break;
                }
                case 'x': {
                    running = false;
                    break;
                }
                default: {
                    appPhase = Phase.MENU;
                    break;
                }
            }

        }
//        DictionaryManagement.insertFromCommandline(dict);
//        showAllWords(dict);

    }


    public static void main(String[] args) {
        dictionaryBasic();
    }
}
