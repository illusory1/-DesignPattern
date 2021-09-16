package design_patterns.create.prototype;

/**
 * <p>Title: Person</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/21 11:45 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public abstract class Person implements Cloneable {
    private String name;
    protected Integer age;
    abstract void draw();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
