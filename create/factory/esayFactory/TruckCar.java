package design_patterns.create.factory.esayFactory;

/**
 * <p>Title: TruckCar</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 9:12 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class TruckCar extends AbstartCar{
    public TruckCar(){
        System.out.println("卡车被创建了");
    }
    @Override
   public void run() {
        System.out.println("卡车");
    }
}
