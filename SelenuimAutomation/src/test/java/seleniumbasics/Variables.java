package seleniumbasics;

public class Variables {
    int b = 100;
    static int num;
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.println(num);
    }

    public void m1(){
        System.out.println(b);
        num = 200;
        System.out.println(num);
    }
    public void m2(){
        System.out.println(b);
    }
}
