package design_patterns.create.factory.factorymethod;

import design_patterns.create.factory.esayFactory.AbstartCar;

/**
 * <p>Title: MiniCar</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 9:37 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class MiniCar extends AbstartCar {
    @Override
    public void run() {
        System.out.println("小汽车跑起来了");
    }
}
