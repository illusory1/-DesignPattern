package design_patterns.create.factory.abstractfactory;

/**
 * <p>Title: Bule</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 11:48 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}