import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @ClassName MyRemoteClient
 * @Description TODO
 * @Author mingjie
 * @Date 2019/10/9 22:50
 * @Versrion 1.0
 **/
public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go(){
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            System.out.println(service.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
