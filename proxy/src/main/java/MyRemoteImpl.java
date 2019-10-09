import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @ClassName MyRemoteImpl
 * @Description TODO
 * @Author mingjie
 * @Date 2019/10/9 22:43
 * @Versrion 1.0
 **/
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "hello world";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello",service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
