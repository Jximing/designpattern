/**
 * @ClassName Captain
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/25 21:33
 * @Versrion 1.0
 **/
public class Captain {

    private RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row() {
        rowingBoat.row();
    }
}
