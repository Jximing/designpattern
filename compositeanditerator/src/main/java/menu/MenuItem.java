package menu;

/**
 * @ClassName MenuItem
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/27 00:40
 * @Versrion 1.0
 **/
public class MenuItem extends MenuComponet {

    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print("   " +getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        System.out.println(",  "+getPrice());
        System.out.println("    -- "+ getDescription());
    }
}
