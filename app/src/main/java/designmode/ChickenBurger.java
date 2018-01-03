package designmode;

import designmode.base.Humburger;

/**
 * Created by 林丹荣 on 2018/1/3.
 * 汉堡---鸡腿堡-->
 */

public class ChickenBurger extends Humburger {

    public ChickenBurger(){
        name ="鸡腿堡";
    }

    @Override
    public double getprice() {
        return 10;
    }
}
