package com.baidu.static_;

public class VisitStatic {
    public static void main(String[] args) {
      //  A a = new A();
      //  System.out.println("a.name="+A.name);
        System.out.println(One.N1);
    }
}
class Animal{
    static {
        System.out.println("Animal的静态代码块1");
    }
}
class One extends Animal{
    public static int N1 = 900;
    static {
        System.out.println("One的静态代码块1");
    }
}

class B{
    static {
        System.out.println("b的静态代码块1");
    }
}
class  A extends B{
    static {
        System.out.println("A的静态代码块1");
    }
}


