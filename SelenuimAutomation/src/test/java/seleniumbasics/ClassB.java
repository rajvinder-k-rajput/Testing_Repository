package seleniumbasics;

import static seleniumbasics.ClassA.methodThree;

public class ClassB {
    public static void main(String[] args) {
        ClassA method = new ClassA();
        method.methodOne();
        method.methodTwo();
        methodThree();
    }
}
