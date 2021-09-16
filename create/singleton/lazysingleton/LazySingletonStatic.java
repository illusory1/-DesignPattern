package design_patterns.create.singleton.lazysingleton;

/**
 * <p>Title: LazySingletonStatic</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/21 11:29 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class LazySingletonStatic {
 private LazySingletonStatic(){

 }
 private static class newInstance{
  private static final LazySingletonStatic instance=new LazySingletonStatic();
 }
 public static LazySingletonStatic getInstance(){
     return newInstance.instance;
 }

}
