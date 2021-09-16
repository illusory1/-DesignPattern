package design_patterns.create.builder.esayBulider;

/**
 * <p>Title: Director</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 10:08 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class Director {
    private ProductBuilder builder;
    public Director(ProductBuilder builder){
        this.builder=builder;
    }
    public Product construct(){
        builder.builerdA();
        builder.builerdB();
        builder.builerdC();
        return builder.getProduct();
    }
}
