package com.baidu.enum_;

public class Demo03 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
    }
}
enum Season2 {
    //将构造器私有化防止直接new
    //防止属性被修改
    //在该类内部创造一些固定的值
//    public final static Season SPRING = new Season2("春天","温暖");
//    public final static Season WINTER = new Season2("冬天","寒冷");
//    public final static Season AUTUMN = new Season2("秋天","两双");
//    public final static Season SUMMER = new Season2("夏天","炎热");
    SPRING("春天","温暖"), //常量名（实参列表）
    WINTER("冬天","寒冷"),
    AUTUMN("秋天","两双"),
    SUMMER("夏天","炎热");
    private String name;
    private String desc;
    private Season2(String name, String desc) {
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