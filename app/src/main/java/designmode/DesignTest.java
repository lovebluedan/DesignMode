package designmode;

/**
 * Created by 林丹荣 on 2018/1/3.
 */

public class DesignTest {

    public static void main(String[] args){
//        //买个鸡腿汉堡
//        Humburger humburger = new ChickenBurger();
//        System.out.println(humburger.getName()+" 价格："+humburger.getprice());
//
//        // 鸡腿汉堡 >加上生菜
//        Lettuce lettuce = new Lettuce(humburger);
//        System.out.println(lettuce.getName()+ " 价格："+lettuce.getprice());
//
//        // 鸡腿汉堡 >加上生菜>再加上免费的辣椒
//        Chilli chilli = new Chilli(lettuce);
//        System.out.println(chilli.getName()+" 价格："+chilli.getprice());
//
//        //鸡腿汉堡>加上免费辣椒
//        Chilli chilli1 = new Chilli(humburger);
//        System.out.println(chilli1.getName()+" 价格："+chilli1.getprice());


        Chilli chilli2 = new Chilli(new Lettuce(new ChickenBurger()));
        System.out.println(chilli2.getName()+" 价格："+chilli2.getprice());
    }
}
