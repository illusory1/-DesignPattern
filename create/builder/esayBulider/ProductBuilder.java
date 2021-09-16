package design_patterns.create.builder.esayBulider;

/**
 * <p>Title: ProductBuilder</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 10:02 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public  abstract  class ProductBuilder {
    protected  Product product=new Product();
    abstract void builerdA();
    abstract void builerdB();
    abstract void builerdC();

    public Product getProduct(){
        return product;
    }
}
