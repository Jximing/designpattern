/**
 * @ClassName Singleton
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/24 12:10
 * @Versrion 1.0
 **/
public class Singleton {
    //私有构造
    private Singleton(){}

    private static Singleton instance;

    //线程不安全
    public static Singleton getInstance(){
        if(instance == null){
            instance =  new Singleton();
        }
        return instance;
    }

    //整个方法上锁性能低
    public static synchronized Singleton getInstance1(){
        if(instance == null){
            instance =  new Singleton();
        }
        return instance;
    }

    //volatile防止指令重排，jdk1.5之前仍有问题
    private volatile static Singleton instancea;
    /**
     *mem = allocate();             //Allocate memory for Singleton object.
     * instance = mem;               //Note that instance is now non-null, but
     *                               //has not been initialized.
     * ctorSingleton(instance);      //Invoke constructor for Singleton passing
     *                               //instance.
     * 不加volatile可能导致创建对象还未执行其构造的时候另一线程判断instancea不为null返回了
     **/
    //双重检查加锁，只有第一次执行时进入加锁方法，防止getInstancea()时线程阻塞
    public static Singleton getInstancea(){
        if (instancea == null) {
            synchronized (Singleton.class){
                if (instancea == null) {
                    instancea = new Singleton();
                }
            }
        }
        return instancea;
    }

    private static Singleton instanceb = new Singleton();

    //初始化就加载，占用资源
    public static Singleton getInstanceb(){
        return instanceb;
    }

    //加载Singleton类时并不会初始化对象，调用getInstancec方法时加载SingletonHolder类时实例化
    public static Singleton getInstancec(){
        return SingletonHolder.instancec;
    }

    private static class SingletonHolder {
        private static final Singleton instancec = new Singleton();
    }
}
