package com.baidu.collection_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //list集合类中元素有序
        //1支持索引
        //2可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("jack");
        list.add("jack");
        System.out.println(list);
        System.out.println(list.get(2));
    }
}
