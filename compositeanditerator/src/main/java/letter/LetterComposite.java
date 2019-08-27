package letter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LetterComposite
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/27 00:23
 * @Versrion 1.0
 **/
public abstract class LetterComposite {
    private List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite letter) {
        children.add(letter);
    }

    public int count() {
        return children.size();
    }

    protected void printThisBefore() {
    }

    protected void printThisAfter() {
    }

    public void print() {
        printThisBefore();
        for (LetterComposite letter : children) {
            letter.print();
        }
        printThisAfter();
    }
}