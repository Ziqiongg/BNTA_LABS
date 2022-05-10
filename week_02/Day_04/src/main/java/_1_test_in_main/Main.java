package _1_test_in_main;

import _2_test_with_junit.Service2;

import java.security.Provider;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        String msgFromHelloWorld = service.helloWorld();
        System.out.println(msgFromHelloWorld);
        //or
        System.out.println(new Service().helloWorld());

        Service2 s2 = new Service2();
        String helloMsg = s2.hello("hellin");
        System.out.println(new Service2().hello("Carol"));




    }
}
