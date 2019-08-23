package simplefactory;

import beans.CheesePizza;
import beans.PepperoniPizza;
import beans.Pizza;

/**
 * @ClassName SimplePizzaFactory
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/24 01:24
 * @Versrion 1.0
 **/
public class SimplePizzaFactory {

    public Pizza creatPizza(String type){
        Pizza pizza = null;
        if ("ChessPizza".equals(type)){
            pizza = new CheesePizza();
        }else if("PepperoniPizza".equals(type)){
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
