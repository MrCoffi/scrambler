package org.example;
import org.example.Logic.MainLogic;
public class Main {
    public static void main(String[] args) {
        MainLogic mainLogic = new MainLogic("100009");
        System.out.println("a) " + mainLogic);

        MainLogic mainLogic1 = new MainLogic("900001");
        System.out.println("б) " + mainLogic1);

        MainLogic mainLogic2 = new MainLogic("100009");
        System.out.println("в) " + mainLogic2);

        MainLogic mainLogic3 = new MainLogic("190000");
        System.out.println("г) " + mainLogic3);
    }
}
