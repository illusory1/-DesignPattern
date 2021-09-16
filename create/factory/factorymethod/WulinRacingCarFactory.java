package design_patterns.create.factory.factorymethod;

import design_patterns.create.factory.esayFactory.AbstartCar;

/**
 * <p>Title: WulinRacingCarFactory</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 9:44 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class WulinRacingCarFactory extends AbstartFactory{
    @Override
    public AbstartCar newCar() {
        return new RacingCar();
    }
}
