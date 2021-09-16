package design_patterns.create.factory.esayFactory;

/**
 * <p>Title: TsetMain</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 9:18 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class TsetMain {
    public static void main(String[] args) {
      Car car =(Car) BuliderFactory.instance("car");
      car.run();


    }
}
