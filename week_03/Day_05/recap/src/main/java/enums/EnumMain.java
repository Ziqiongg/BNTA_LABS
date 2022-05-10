package enums;

public class EnumMain {
    public static void main(String[] args) {

        Person carol = new Person("Carol", "zhucheng",Month.NOVEMBER);
        Person carol2 = new Person("Carol", "zhu",Month.APRIL);
        Person carol3 = new Person("Carol", "zhu",Month.AUGUST);

        System.out.println(carol.getBirthMonth().getMonthNumber());
        System.out.println(Month.NOVEMBER);

    }
}
