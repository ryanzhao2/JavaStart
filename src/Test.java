public class Test {
    public static void main(String[] args) {
        /*
        System.out.println("Hello World!");
        System.out.println("Bye World.");
        System.out.print("Yes");
        System.out.println("No");
        System.out.println(3);
        */

        //System.out.println(3000);
        //System.out.println(5+3);
        String name = "John";
        System.out.println(name);
        int myNum = 5;
        System.out.println(myNum);
        int large;
        large = 89;
        System.out.println(large);
        int small = 2;
        small = 1;
        System.out.println(small);
        final int hey = 10;

        System.out.println(hey);

        Person p = new Person();
        p.setAge(5);
        p.setName("Joe");
        p.setCountry("Mozambique");
        System.out.println(p.getAge() + " " + p.getName() + " " +  p.getCountry());
    }

}
