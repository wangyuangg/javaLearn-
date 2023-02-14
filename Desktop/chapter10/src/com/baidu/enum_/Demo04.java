package com.baidu.enum_;

public class Demo04 {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        System.out.println("所有星期的数据如下");
        for (Week week : weeks) {
            System.out.println(week);
        }
    }
}
//枚举可以实现接口
enum Week {

    MONDAY("星期1"),
    TUESDAY("星期2"),
    WEDNESDAY("星期3"), THURSDAY("星期4"),
    FRIDAY("星期5"), SATURDAY("星期6"), SUNDAY("星期日");
    private final String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}