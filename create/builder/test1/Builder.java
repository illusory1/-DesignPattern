package design_patterns.create.builder.test1;

/**
 * <p>Title: Builder</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 7:45 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public abstract class Builder {
    abstract void buildBoard(String board);
    abstract void buildDisplay(String display);
    abstract void buildOs();
    abstract Computer build();
}
