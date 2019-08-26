package menu;

import java.util.Iterator;
import java.util.Stack;

/**
 * @ClassName CompositeItrator
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/27 01:10
 * @Versrion 1.0
 **/
public class CompositeItrator implements Iterator {

    private Stack<Iterator<MenuComponet>> stack = new Stack<>();

    public CompositeItrator(Iterator<MenuComponet> iterator) {
        stack.add(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator<MenuComponet> iterator = stack.peek();
            MenuComponet componet = iterator.next();
            if (componet instanceof Menu){
                stack.push(componet.createIterator());
            }
            return componet;
        }else {
            return null;
        }

    }
}
