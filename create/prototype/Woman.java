package design_patterns.create.prototype;

/**
 * <p>Title: Woman</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 12:18 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class Woman extends Person {

    public Woman(){
        age=18;
    }

    @Override
    void draw() {
        System.out.println("女生在画画");
    }
}
