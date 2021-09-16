package design_patterns.create.builder.test1;

/**
 * <p>Title: TestMain</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 10:21 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class TestMain {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        Director director = new Director(computerBuilder);
        director.construct("zhang","wang");
        Computer build = computerBuilder.build();
        System.out.println(build.toString());


    }
}
