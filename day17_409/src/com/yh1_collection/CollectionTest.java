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
    1--add(Object obj):���Ԫ�ص���ǰ������
    2--addAll(Collection other)�����other�����е�����Ԫ�ض��󵽵�ǰ�����У�
    ��this = this �ȣ������� other
    ����������һ��
     */
    @Test
    public void test1() {
        //����Collection�ǽӿڣ�ʹ�ö�̬��ʽ
        Collection<Object> coll = new ArrayList<>();

        //add()
        //ͬһ���Ͽ��Դ洢������������
        coll.add('a');
        coll.add("�ƺ�����");
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
        ��3��int size():Ԫ�ظ���
        ��4��boolean isEmpty()���жϵ�ǰ�����Ƿ�Ϊ�ռ���
        ��5��boolean contains(Object obj)���жϵ�ǰ�������Ƿ����һ����obj����equals����true��Ԫ��
        ��6��boolean containsAll(Collection coll)���ж�coll�����е�Ԫ���Ƿ��ڵ�ǰ�����ж����ڡ���coll�����Ƿ��ǵ�ǰ���ϵġ��Ӽ���
        ��7��boolean equals(Object obj)���жϵ�ǰ������obj�Ƿ����
     */
    @Test
    public void test2() {
        Collection<Object> coll = new ArrayList<>();

        System.out.println(coll.isEmpty()); //true

        //add()
        coll.add("AA");
        Person p1 = new Person("Tom", 12);
        coll.add(p1);
        coll.add(128);//�Զ�װ��
        coll.add(new String("�й��"));

        //contains(Object obj)
        System.out.println(coll.contains("AA")); //true
        System.out.println(coll.contains(124));  //false
        System.out.println(coll.contains(new String("�ƺ�")));

        Collection<Object> coll1 = new ArrayList<>();
        coll1.add("AA");
        coll1.add(1445);

        System.out.println(coll.containsAll(coll1)); //false

        System.out.println(coll.equals(coll1)); //false
    }

    /*
        ��8��void clear()����ռ���Ԫ��
        ��9�� boolean remove(Object obj) ���ӵ�ǰ������ɾ����һ���ҵ�����obj����equals����true��Ԫ�ء�
        ��10��boolean removeAll(Collection coll)���ӵ�ǰ������ɾ��������coll��������ͬ��Ԫ�ء���this = this - this �� coll
        ��11��boolean retainAll(Collection coll)���ӵ�ǰ������ɾ�����������в�ͬ��Ԫ�أ�ʹ�õ�ǰ���Ͻ�������coll�����е�Ԫ����ͬ��Ԫ�أ�
        ����ǰ�����н������������ϵĽ�������this  = this �� coll��
     */
    @Test
    public void test3() {
        Collection<Object> coll = new ArrayList<>();

        System.out.println(coll.isEmpty()); //true

        //add()
        coll.add("AA");
        Person p1 = new Person("Tom", 12);
        coll.add(p1);
        coll.add(128);//�Զ�װ��
        coll.add(new String("�й��"));
        coll.add(new Person("����", 21));
        System.out.println(coll); //[AA, Person{name='Tom', age=12}, 128, �й��, Person{name='����', age=21}]

        //remove()
        coll.remove(new Person("����", 21));
        //coll.remove("AA");
        System.out.println(coll); //[AA, Person{name='Tom', age=12}, 128, �й��]

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

        //clear()��ռ���Ԫ��
        coll.clear();
        System.out.println(coll); //[]

    }


    /*
        ��12��Object[] toArray()�����ذ�����ǰ����������Ԫ�ص�����
        ��13��hashCode()����ȡ���϶���Ĺ�ϣֵ
        ��14��iterator()�����ص������������ڼ��ϱ���
     */
    @Test
    public void test4() {
        Collection<Object> coll = new ArrayList<>();

        System.out.println(coll.isEmpty()); //true

        //add()
        coll.add("AA");
        Person p1 = new Person("Tom", 12);
        coll.add(p1);
        coll.add(128);//�Զ�װ��
        coll.add(new String("�й��"));
        coll.add(new Person("����", 21));

        //���� --> ����
        Object[] arr = coll.toArray();
        System.out.println(Arrays.toString(arr));

        //hashCode()
        System.out.println(coll.hashCode()); //-1644623401

        //ʹ�õ�����Iterator
        Iterator<Object> t = coll.iterator();
        while (t.hasNext()) {
            Object s = t.next();
            System.out.print(s + " ");
            //AA Person{name='Tom', age=12} 128 �й�� Person{name='����', age=21}
        }

    }

}
