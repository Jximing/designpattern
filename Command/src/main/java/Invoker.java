/**
 * @ClassName Invoker
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/25 20:03
 * @Versrion 1.0
 **/
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.execute();
    }

}
