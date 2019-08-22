/**
 * @ClassName CarDecorator
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/22 23:50
 * @Versrion 1.0
 **/
public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car c){
        this.car=c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}
