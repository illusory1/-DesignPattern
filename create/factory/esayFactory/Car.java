package design_patterns.create.factory.esayFactory;

/**
 * <p>Title: Person</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 8:36 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class Car extends AbstartCar{
    public Car(){
        System.out.println("小汽车被创建了");
    }
    @Override
   public void run() {
        System.out.println("小型汽车");
    }
}
