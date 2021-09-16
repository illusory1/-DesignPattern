package design_patterns.create.builder.test1;

/**
 * <p>Title: Director</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 10:29 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class Director {
    Builder mBuilder=null;
    public Director(Builder builder){
        this.mBuilder=builder;
    }
    public void construct(String board,String display){
        mBuilder.buildBoard(display);
        mBuilder.buildDisplay(display);
        mBuilder.buildOs();
    }
}
