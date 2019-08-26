package menu;

import java.util.Iterator;

/**
 * @ClassName Waitress
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/27 00:57
 * @Versrion 1.0
 **/
public class Waitress {

    private MenuComponet allMenus;

    public Waitress(MenuComponet allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarainMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARAIN MENU\n-----");
        while (iterator.hasNext()){
            MenuComponet menuComponet = (MenuComponet) iterator.next();
            try {
                if (menuComponet.isVegetarian()) {
                    menuComponet.print();
                }
            } catch (Exception e) {
//                System.out.println(menuComponet.getName());
            }
        }
    }
}
