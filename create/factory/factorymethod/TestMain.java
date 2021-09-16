package design_patterns.create.factory.factorymethod;

import design_patterns.create.factory.esayFactory.AbstartCar;

/**
 * <p>Title: TestMain</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 9:57 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class TestMain {
    public static void main(String[] args) {
        WulinMinCarFactory wulinMinCarFactory = new WulinMinCarFactory();
        MiniCar miniCar = (MiniCar) wulinMinCarFactory.newCar();
        miniCar.run();

        WulinRacingCarFactory wulinRacingCarFactory = new WulinRacingCarFactory();
        RacingCar racingCar= (RacingCar) wulinRacingCarFactory.newCar();
        racingCar.run();


    }
}
