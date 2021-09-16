package design_patterns.create.prototype;

/**
 * <p>Title: TestMain</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 12:11 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class TestMain {
    public static void main(String[] args) {
        PersonCache.loadCache();
        Person person = PersonCache.getPerson(23);
        System.out.println(person.getName());
    }
}
