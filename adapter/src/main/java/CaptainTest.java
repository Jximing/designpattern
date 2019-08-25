/**
 * @ClassName CaptainTest
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/25 21:35
 * @Versrion 1.0
 **/
public class CaptainTest {

    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
