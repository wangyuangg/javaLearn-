package com.baidu.enum_;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
    }
}

//演示自定义枚举
class Season {
    private String name;
    private String desc;

    //将构造器私有化防止直接new
    //防止属性被修改
    //在该类内部创造一些固定的值
    public final static Season SPRING = new Season("春天","温暖");
    public final static Season WINTER = new Season("冬天","寒冷");
    public final static Season AUTUMN = new Season("秋天","两双");
    public final static Season SUMMER = new Season("夏天","炎热");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
