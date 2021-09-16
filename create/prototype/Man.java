package design_patterns.create.prototype;

/**
 * <p>Title: Man</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 12:23 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class Man extends Person{
    public Man(){
        age=23;
    }
    @Override
    void draw() {
        System.out.println("男人在画动物");
    }
}
