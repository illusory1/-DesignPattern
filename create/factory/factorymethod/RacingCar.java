package design_patterns.create.factory.factorymethod;

import design_patterns.create.factory.esayFactory.AbstartCar;

/**
 * <p>Title: RacingCar</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 9:38 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class RacingCar extends AbstartCar{
    @Override
    public void run() {
        System.out.println("赛车跑起来了");
    }
}
