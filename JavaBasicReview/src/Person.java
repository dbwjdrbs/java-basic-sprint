public class Person {
    public String name;
    public String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void getInformation() {
        System.out.printf("이름 : %s, 나이 : %s\n", name, age);
    }
}
