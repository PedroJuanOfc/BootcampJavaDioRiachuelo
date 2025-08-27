package Modulo_03.Aula_01;

public class Main {
    public static void main(String[] args) {
        var male = new Person();
        male.setName("Pedro Juan");
        male.setAge(24);
        var female = new Person();
        female.setName("Luanna Catharyna");
        female.setAge(23);

        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());
    }
}
