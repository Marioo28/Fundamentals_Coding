package ro.sda.fundamentals._7_static;

public class Main {
    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNomOfInstances());
        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNomOfInstances());
        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNomOfInstances());
    }
}
