package design_patterns.create.factory.abstractfactory;

/**
 * <p>Title: AbstractFactory</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 11:49 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
