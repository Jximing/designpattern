/**
 * @ClassName StartState
 * @Description TODO
 * @Author mingjie
 * @Date 2019/9/3 23:48
 * @Versrion 1.0
 **/
public class StartState implements State{

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }

}
