package designmode;

import designmode.base.Condiment;
import designmode.base.Humburger;

/**
 * Created by 林丹荣 on 2018/1/3.
 * 配料 --> 生菜
 */

public class Lettuce extends Condiment {

    Humburger mHumburger;

    public Lettuce(Humburger humburger){
        this.mHumburger = humburger;
    }

    @Override
    public String getName() {
        return mHumburger.getName()+"加生菜";
    }

    @Override
    public double getprice() {
        return mHumburger.getprice()+1.5 ;
    }

}
