package design_patterns.create.singleton.SingletonHungryMan;

/**
 * <p>Title: SingletonHungryMan2</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/21 9:55 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class SingletonHungryMan2 {
    private static SingletonHungryMan2 instance=new SingletonHungryMan2();
    private SingletonHungryMan2(){
    }
    public static SingletonHungryMan2 getInstance(){
        return instance;
    }
}
class test{
    public static void main(String[] args) {
        SingletonHungryMan2 instance = SingletonHungryMan2.getInstance();
        SingletonHungryMan2 instance2 = SingletonHungryMan2.getInstance();
        System.out.println(instance == instance2);
    }
}