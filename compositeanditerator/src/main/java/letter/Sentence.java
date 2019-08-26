package letter;

import java.util.List;

/**
 * @ClassName Sentence
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/27 00:26
 * @Versrion 1.0
 **/
public class Sentence extends LetterComposite {
    public Sentence(List<Word> words) {
        for (Word w : words) {
            this.add(w);
        }
    }
    @Override
    protected void printThisAfter() {
        System.out.print(".");
    }
}
