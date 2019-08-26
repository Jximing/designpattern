package menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName Menu
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/27 00:44
 * @Versrion 1.0
 **/
public class Menu extends MenuComponet {

    ArrayList<MenuComponet> menuComponets = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponet menuComponet) {
        menuComponets.add(menuComponet);
    }

    @Override
    public void remove(MenuComponet menuComponet) {
        menuComponets.remove(menuComponet);
    }

    @Override
    public MenuComponet getChild(int i) {
        return menuComponets.get(i);
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
    public void print() {
        System.out.print("\n"+getName());
        System.out.println(", "+getDescription());
        System.out.println("---------------");
        Iterator<MenuComponet> iterator = menuComponets.iterator();
        while (iterator.hasNext()){
            iterator.next().print();
        }

    }
}
