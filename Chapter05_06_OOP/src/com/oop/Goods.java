package com.oop;

/**
 * ClassName:Goods
 * Package:com.oop
 *
 * @Author 86183
 * @Create 2024/3/28 14:18
 */
/*��׼JavaBean��
����˽�л�+�ղι���+�вι���(��ѡ)+setter��getter��Ա����
 */
public class Goods {
    private String name;
    private String info;
    private String id;

    //���췽��
    public Goods() {
    }

    //�вι����ʼ������
    public Goods(String name, String info, String id) {
        this.name = name;
        this.info = info;
        this.id = id;
    }

    //��Ա����
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
