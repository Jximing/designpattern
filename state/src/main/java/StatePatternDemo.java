/**
 * @ClassName StatePatternDemo
 * @Description TODO
 * @Author mingjie
 * @Date 2019/9/3 23:52
 * @Versrion 1.0
 **/
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }

}
