package designmode;

import designmode.base.Condiment;
import designmode.base.Humburger;

/**
 * Created by 林丹荣 on 2018/1/3.
 * 配料 -->辣椒
 */

public class Chilli extends Condiment {

    Humburger mHumburger;

    public Chilli(Humburger humburger){
        this.mHumburger = humburger;
    }

    @Override
    public String getName() {
        return mHumburger.getName()+"加辣椒";
    }

    @Override
    public double getprice() {
        return mHumburger.getprice(); //辣椒是免费的
    }

}
