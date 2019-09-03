/**
 * @ClassName Context
 * @Description TODO
 * @Author mingjie
 * @Date 2019/9/3 23:47
 * @Versrion 1.0
 **/
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

}
