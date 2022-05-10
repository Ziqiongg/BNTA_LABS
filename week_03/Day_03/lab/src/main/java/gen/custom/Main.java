package gen.custom;

import gen.ajfdi.Person;

public class Main {
    public static void main(String[] args) {
        GenericsClass<Person, String> maoMao = new GenericsClass<>();
        maoMao.useGenerics(new Person(), "SFAd");

    }


}
