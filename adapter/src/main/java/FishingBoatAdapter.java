/**
 * @ClassName FishingBoatAdapter
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/25 21:34
 * @Versrion 1.0
 **/
public class FishingBoatAdapter implements RowingBoat {


    private FishingBoat boat;

    public FishingBoatAdapter() {
        boat = new FishingBoat();
    }

    @Override
    public void row() {
        boat.sail();
    }

}
