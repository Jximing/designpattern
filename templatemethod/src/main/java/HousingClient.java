/**
 * @ClassName test
 * @Description TODO
 * @Author mingjie
 * @Date 2019-08-17 10:52
 * @Versrion 1.0
 **/
public class HousingClient {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
