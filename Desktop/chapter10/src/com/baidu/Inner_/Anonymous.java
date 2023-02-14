package com.baidu.Inner_;

/**
 *
 */
public class Anonymous {
    public static void main(String[] args) {
        AA A = new AA() {
            @Override
            public void car() {
                System.out.println("老虎叫");
            }
        };
        A.car();
//        System.out.println(A.getClass());
        Father jack = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写test方法");
            }
        };
        jack.test();
        System.out.println(jack.getClass());
    }
}

class Outer04 {
    private int n1 = 10;

    public void method() {
        AA tiger = new Tiger();
        tiger.car();
    }
}

class Tiger implements AA {

    @Override
    public void car() {
        System.out.println("老虎开车");
    }
}

interface AA {
    public void car();
}

class Father {
    public Father(String name) {
    }

    public void test() {
        System.out.println("泥马");
    }
}