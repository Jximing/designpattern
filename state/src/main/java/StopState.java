/**
 * @ClassName StopState
 * @Description TODO
 * @Author mingjie
 * @Date 2019/9/3 23:49
 * @Versrion 1.0
 **/
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
