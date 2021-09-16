package design_patterns.create.factory.abstractfactory;

/**
 * <p>Title: Circle</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 11:45 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
