package factorymethod;

import beans.Pizza;

/**
 * @ClassName NYStylePizzaStore
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/24 01:51
 * @Versrion 1.0
 **/
public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        //根据判断返回具体的bean
        return null;
    }
}
