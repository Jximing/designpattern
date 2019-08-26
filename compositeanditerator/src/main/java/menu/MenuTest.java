package menu;

/**
 * @ClassName MenuTest
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/27 00:58
 * @Versrion 1.0
 **/
public class MenuTest {

    public static void main(String[] args) {
        MenuComponet dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponet pacakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponet cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponet dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponet allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(dinerMenu);
        allMenus.add(pacakeHouseMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "Spaghtti", true, 3.89));

        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
//        waitress.printMenu();
        waitress.printVegetarainMenu();
    }
}
