package seleniumbasics;

public class ArrayEx {
    public static void main(String[] args) {
        int [] a = {11,22,33}; // index order - 0,1,2
        String [] b = {"Hi", "How", "are", "You"}; // Index - 0,1,2,3

        System.out.println(a[1]);
        System.out.println(b[3]);

        System.out.println(a.length);
        System.out.println(b.length);

        for (int i = 0; i < a.length ; i++)
            System.out.println(a[i]);
    }
}
