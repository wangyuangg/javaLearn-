package com.baidu.exercise_;

public class customerException {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1,n2);
            System.out.println("计算结果="+res);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("除0的异常");
        }
    }

    public static double cal(int a, int b) {
        return a / b;
    }

}

