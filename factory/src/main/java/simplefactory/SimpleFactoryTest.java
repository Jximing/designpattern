package simplefactory;

/**
 * @ClassName SimpleFactoryTest
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/24 01:37
 * @Versrion 1.0
 **/
public class SimpleFactoryTest {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        pizzaStore.orderPizza("ChessPizza");
    }
}
