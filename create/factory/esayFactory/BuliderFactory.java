package design_patterns.create.factory.esayFactory;

/**
 * <p>Title: BuliderFactory</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 8:38 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class BuliderFactory {

    //创建工厂的条件 传入不同的对象在其他类使用的基础上你才去实例化代码
    public static Object instance(Object o) {

        if ("car".equals(o)) {
           return   new Car();
        } else if ("truckCar".equals(o)) {
          return new TruckCar();
        }
        return null;
    }

}
