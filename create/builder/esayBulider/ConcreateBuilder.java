package design_patterns.create.builder.esayBulider;

/**
 * <p>Title: ConcreateBuilder</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 10:04 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class ConcreateBuilder extends ProductBuilder {

    @Override
    void builerdA() {
        product.setPartA("建造 PartA");
    }

    @Override
    void builerdB() {
        product.setPartB("建造 PartB");
    }

    @Override
    void builerdC() {
        product.setPartC("建造 PartC");
    }
}
