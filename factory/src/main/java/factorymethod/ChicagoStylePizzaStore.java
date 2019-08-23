package factorymethod;

import beans.Pizza;

/**
 * @ClassName ChicagoStylePizzaStore
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/24 01:52
 * @Versrion 1.0
 **/
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        //根据判断返回具体的bean
        return null;
    }
}
