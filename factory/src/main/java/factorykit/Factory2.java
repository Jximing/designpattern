package factorykit;

/**
 * @ClassName Factory2
 * @Description TODO
 * @Author mingjie
 * @Date 2019/8/24 02:20
 * @Versrion 1.0
 **/
public class Factory2 implements Factory {
    @Override
    public ProductA manufactureProductA() {
        //返回Factory2的具体ProductA
        return null;
    }

    @Override
    public ProductB manufactureProductB() {
        //返回Factory2的具体ProductB
        return null;
    }
}
