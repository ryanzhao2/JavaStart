public class Person {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age, String name, String country) {
        this.age = age;
        this.name = name;
        this.country = country;
    }
    public Person() {

    }

    int age;

    public String getName(){
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }
    String name;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    String country;
}
