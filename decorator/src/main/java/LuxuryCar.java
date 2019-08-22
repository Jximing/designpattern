/**
 * @ClassName LuxuryCar
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/22 23:53
 * @Versrion 1.0
 **/
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car c) {
        super(c);
    }

    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
