/**
 * @ClassName SportsCar
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/22 23:52
 * @Versrion 1.0
 **/
public class SportsCar extends CarDecorator {

    public SportsCar(Car c) {
        super(c);
    }

    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }

}
