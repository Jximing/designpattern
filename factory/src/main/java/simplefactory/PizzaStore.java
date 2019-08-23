package simplefactory;

import beans.Pizza;

/**
 * @ClassName PizzaStore
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/24 01:34
 * @Versrion 1.0
 **/
public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = simplePizzaFactory.creatPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
