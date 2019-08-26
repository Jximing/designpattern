package letter;

/**
 * @ClassName Letter
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/27 00:24
 * @Versrion 1.0
 **/
public class Letter extends LetterComposite {
    private char c;
    public Letter(char c) {
        this.c = c;
    }
    @Override
    protected void printThisBefore() {
        System.out.print(c);
    }
}
