/**
 * @ClassName Item
 * @Description TODO
 * @Author mingjie
 * @Date 2019-08-19 23:16
 * @Versrion 1.0
 **/
public class Item {

    private String upcCode;
    private int price;

    public Item(String upc, int cost){
        this.upcCode=upc;
        this.price=cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

}
