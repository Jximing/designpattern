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
//            这段代码有问题，第二层的CompositeItrator返回的Menu会加到第一层里面去。
//            MenuComponet componet = iterator.next();
//            if (componet instanceof Menu){
//                stack.push(componet.createIterator());
//            }
//            return componet;
            //这里不返回Menu对象，因为返回Menu的话会逐层往上添加CompositeItrator导致重复数据成倍增加
            MenuComponet componet = iterator.next();
            if (null!=componet && componet instanceof Menu){
                stack.push(componet.createIterator());
                return null;
            }
            return componet;
        }else {
            return null;
        }

    }
}
