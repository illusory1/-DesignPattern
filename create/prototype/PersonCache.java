package design_patterns.create.prototype;

import java.util.Hashtable;

/**
 * <p>Title: PersonCache</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 12:24 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class PersonCache {
    private static Hashtable<Integer,Person> personMap=new Hashtable<>();
    public static Person getPerson(Integer age){
        Person person = personMap.get(age);
        Person personclone=(Person) person.clone();
        return personclone;
    }
    public static void loadCache(){
        Man man = new Man();
        man.setName("张三");
        personMap.put(man.getAge(),man);
        Woman woman=new Woman();
        personMap.put(woman.getAge(), woman);
    }

}


