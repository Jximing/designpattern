/**
 * @ClassName ConcreteCommand
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/25 20:02
 * @Versrion 1.0
 **/
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
