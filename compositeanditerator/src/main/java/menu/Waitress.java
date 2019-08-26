package menu;

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
}
