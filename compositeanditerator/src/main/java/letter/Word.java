package letter;

import java.util.List;

/**
 * @ClassName Word
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/27 00:24
 * @Versrion 1.0
 **/
public class Word extends LetterComposite {
    public Word(List<Letter> letters) {
        for (Letter letter : letters) {
            add(letter);
        }
    }
    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}
