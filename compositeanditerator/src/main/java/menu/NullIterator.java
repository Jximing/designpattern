package menu;

import java.util.Iterator;

/**
 * @ClassName NullIterator
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/27 01:25
 * @Versrion 1.0
 **/
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
