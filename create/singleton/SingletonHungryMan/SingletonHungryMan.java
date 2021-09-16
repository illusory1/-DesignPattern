package design_patterns.create.singleton.SingletonHungryMan;

/**
 * <p>Title: design_patterns</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/21 9:34 下午</p>
 *  单例模式
 *  什么是单例模式
 *  单例构造器的私有化
 * @author :fengjp
 * @version :1.0
 */
//饿汉模式
public class SingletonHungryMan {
    private static SingletonHungryMan instance;

    static {
        instance=new SingletonHungryMan();
    }

    private SingletonHungryMan(){

    }
    public static SingletonHungryMan instance(){
        return instance;
    }

}
class client{
    public static void main(String[] args) {
        SingletonHungryMan instance = SingletonHungryMan.instance();
        SingletonHungryMan instance1 = SingletonHungryMan.instance();
        System.out.println(instance==instance1);
    }
}
