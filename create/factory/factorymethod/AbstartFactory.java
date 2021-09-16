package design_patterns.create.factory.factorymethod;

import design_patterns.create.factory.esayFactory.AbstartCar;

/**
 * <p>Title: AbstartFactory</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 9:42 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public abstract class AbstartFactory {
    //抽像工厂的核心方法 在工厂里面通过组合的方法 返回去创建的顶级父类 实现了工厂的的创建对象
    public abstract AbstartCar newCar();
}
