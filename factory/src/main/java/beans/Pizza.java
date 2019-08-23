package beans;

/**
 * @ClassName beans.Pizza
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/24 01:18
 * @Versrion 1.0
 **/
public abstract class Pizza {

    public void prepare(){
        System.out.println("paeparing "+getName());
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in offical PizzaStore box");
    }

    public abstract String getName();
}
