package design_patterns.create.singleton.lazysingleton;

/**
 * <p>Title: LazySingleton</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/21 10:36 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    //分析这种情况
    public synchronized static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        } else {
            return instance;
        }
        return instance;
    }
}

class TestLazySingleton {
    public static void th() {
        new Thread(() -> {
            System.out.println(LazySingleton.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(LazySingleton.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(LazySingleton.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(LazySingleton.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(LazySingleton.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(LazySingleton.getInstance());
        }).start();
    }

    public static void main(String[] args) {
        th();
    }
}
