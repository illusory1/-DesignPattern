package design_patterns.create.singleton.lazysingleton;

/**
 * <p>Title: LazySingleton2</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/21 11:17 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class LazySingleton2 {
    private static volatile LazySingleton2 instance;

    private LazySingleton2() {
    }

    //分析这种情况
    public static LazySingleton2 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton2.class) {
                if (instance == null) {
                    instance = new LazySingleton2();
                }
            }
        }
        return instance;
    }
}

class Test {
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
