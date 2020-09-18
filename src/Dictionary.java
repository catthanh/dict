import java.util.ArrayList;

public class Dictionary {
    private ArrayList<Word> words;

    public Dictionary() {
        words = new ArrayList<>();
    }

    public int getDictSize() {
        return words.size();
    }

    public void addWord(String eng, String vie) {
        Word word = new Word(eng, vie);
        words.add(word);
    }

    public void showWord(int i) {
        System.out.println(i + 1 + "\t| " + words.get(i).getWordTarget() + "\t| " + words.get(i).getWordExplain());
    }

}
