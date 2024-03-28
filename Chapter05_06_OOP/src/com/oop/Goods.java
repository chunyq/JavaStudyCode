package com.oop;

/**
 * ClassName:Goods
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/28 14:18
 */
/*标准JavaBean类
属性私有化+空参构造+有参构造(可选)+setter和getter成员方法
 */
public class Goods {
    private String name;
    private String info;
    private String id;

    //构造方法
    public Goods() {
    }

    //有参构造初始化对象
    public Goods(String name, String info, String id) {
        this.name = name;
        this.info = info;
        this.id = id;
    }

    //成员方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
