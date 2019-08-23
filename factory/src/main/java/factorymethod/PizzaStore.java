package factorymethod;

import beans.Pizza;

/**
 * @ClassName PizzaStore
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/24 01:47
 * @Versrion 1.0
 **/
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    //工厂方法，子类去决定返回什么
    abstract Pizza createPizza(String type);
}
