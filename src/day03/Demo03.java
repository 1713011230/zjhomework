package day03;

public class Demo03 {
    public static void main(String[] args) {

    }
}
class Person{
    private Integer id;
    private  String name;

public Person(Integer id, String name){
    this.id=id;
    this.name=name;
}

    public Person(String username) {
    this.name=username;
    }
    public Person(Integer id){
    this.id=id;
    }

    public static void main(String[] args) {
        Person p1 = new Person("123456");
    }

}
