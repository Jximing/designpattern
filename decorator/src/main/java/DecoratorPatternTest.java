/**
 * @ClassName DecoratorPatternTest
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/22 23:55
 * @Versrion 1.0
 **/
public class DecoratorPatternTest {


    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
