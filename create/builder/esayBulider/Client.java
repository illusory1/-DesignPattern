package design_patterns.create.builder.esayBulider;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 10:12 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class Client {
    public static void main(String[] args) {
        ProductBuilder builder = new ConcreateBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product.toString());
    }
}