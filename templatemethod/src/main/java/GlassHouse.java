/**
 * @ClassName GlassHouse
 * @Description TODO
 * @Author mingjie
 * @Date 2019-08-17 11:10
 * @Versrion 1.0
 **/
public class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }

}
