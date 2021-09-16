package design_patterns.create.singleton.SingletonHungryMan;

import java.util.Date;

/**
 * <p>Title: SingletonEnum</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/21 10:06 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public enum SingletonEnum {
    INSTANCE;
    private Date birthDay;

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public static SingletonEnum getInstance()
    {
        return INSTANCE;
    }

}
class Tests{
    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.getInstance();
        SingletonEnum instance2 = SingletonEnum.getInstance();
        System.out.println(instance == instance2);
    }




}