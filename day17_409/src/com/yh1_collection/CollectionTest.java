package com.yh1_collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName:CollectionTest
 * Package:com.yh1_collection
 *
 * @Author 86183
 * @Create 2024/4/9 15:04
 */
public class CollectionTest {

    /*
    1--add(Object obj):添加元素到当前集合中
    2--addAll(Collection other)：添加other集合中的所有元素对象到当前集合中，
    即this = this ∪（并集） other
    集合类型需一致
     */
    @Test
    public void test1() {
        //由于Collection是接口，使用多态形式
        Collection<Object> coll = new ArrayList<>();

        //add()
        //同一集合可以存储任意数据类型
        coll.add('a');
        coll.add("云和数据");
        coll.add(new Object());
        coll.add(new Person("Mike", 23));

        System.out.println(coll);
        System.out.println(coll.size());

        Collection<Object> coll1 = new ArrayList<>();
        coll1.add("BBB");
        coll1.add(243224);

        //addAll()
        coll.addAll(coll1);
        System.out.println(coll);
    }

    /*
        （3）int size():元素个数
        （4）boolean isEmpty()：判断当前集合是否为空集合
        （5）boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素
        （6）boolean containsAll(Collection coll)：判断coll集合中的元素是否在当前集合中都存在。即coll集合是否是当前集合的“子集”
        （7）boolean equals(Object obj)：判断当前集合与obj是否相等
     */
    @Test
    public void test2() {
        Collection<Object> coll = new ArrayList<>();

        System.out.println(coll.isEmpty()); //true

        //add()
        coll.add("AA");
        Person p1 = new Person("Tom", 12);
        coll.add(p1);
        coll.add(128);//自动装箱
        coll.add(new String("尚硅谷"));

        //contains(Object obj)
        System.out.println(coll.contains("AA")); //true
        System.out.println(coll.contains(124));  //false
        System.out.println(coll.contains(new String("云和")));

        Collection<Object> coll1 = new ArrayList<>();
        coll1.add("AA");
        coll1.add(1445);

        System.out.println(coll.containsAll(coll1)); //false

        System.out.println(coll.equals(coll1)); //false
    }

    /*
        （8）void clear()：清空集合元素
        （9） boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
        （10）boolean removeAll(Collection coll)：从当前集合中删除所有与coll集合中相同的元素。即this = this - this ∩ coll
        （11）boolean retainAll(Collection coll)：从当前集合中删除两个集合中不同的元素，使得当前集合仅保留与coll集合中的元素相同的元素，
        即当前集合中仅保留两个集合的交集，即this  = this ∩ coll；
     */
    @Test
    public void test3() {
        Collection<Object> coll = new ArrayList<>();

        System.out.println(coll.isEmpty()); //true

        //add()
        coll.add("AA");
        Person p1 = new Person("Tom", 12);
        coll.add(p1);
        coll.add(128);//自动装箱
        coll.add(new String("尚硅谷"));
        coll.add(new Person("张三", 21));
        System.out.println(coll); //[AA, Person{name='Tom', age=12}, 128, 尚硅谷, Person{name='张三', age=21}]

        //remove()
        coll.remove(new Person("张三", 21));
        //coll.remove("AA");
        System.out.println(coll); //[AA, Person{name='Tom', age=12}, 128, 尚硅谷]

        Collection<Object> coll1 = new ArrayList<>();
        coll1.add("AA");
        coll1.add(1445);

        //retainAll(Collection coll)
        coll.retainAll(coll1);
        System.out.println(coll); //[AA]

        coll.add(143);
        coll.add("DDDD");
        System.out.println(coll); //[AA, 143, DDDD]

        //removeAll(Collection coll)
        Collection<Object> coll2 = new ArrayList<>();
        coll2.add("AA");
        coll2.add(128);
        coll.removeAll(coll2);
        System.out.println(coll); //[143, DDDD]

        //clear()清空集合元素
        coll.clear();
        System.out.println(coll); //[]

    }


    /*
        （12）Object[] toArray()：返回包含当前集合中所有元素的数组
        （13）hashCode()：获取集合对象的哈希值
        （14）iterator()：返回迭代器对象，用于集合遍历
     */
    @Test
    public void test4() {
        Collection<Object> coll = new ArrayList<>();

        System.out.println(coll.isEmpty()); //true

        //add()
        coll.add("AA");
        Person p1 = new Person("Tom", 12);
        coll.add(p1);
        coll.add(128);//自动装箱
        coll.add(new String("尚硅谷"));
        coll.add(new Person("张三", 21));

        //集合 --> 数组
        Object[] arr = coll.toArray();
        System.out.println(Arrays.toString(arr));

        //hashCode()
        System.out.println(coll.hashCode()); //-1644623401

        //使用迭代器Iterator
        Iterator<Object> t = coll.iterator();
        while (t.hasNext()) {
            Object s = t.next();
            System.out.print(s + " ");
            //AA Person{name='Tom', age=12} 128 尚硅谷 Person{name='张三', age=21}
        }

    }

}
