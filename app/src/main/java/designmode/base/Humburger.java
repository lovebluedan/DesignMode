package designmode.base;

/**
 * --- 装饰者模式
 * Created by 林丹荣 on 2018/1/3.
 * 汉堡的基类
 */

public abstract class Humburger {

    protected String name = null;

    public String getName(){
        return name;
    }
    public abstract double getprice();

}
