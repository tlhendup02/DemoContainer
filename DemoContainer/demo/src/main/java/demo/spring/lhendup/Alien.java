package demo.spring.lhendup;

public class Alien {

    private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        System.out.println(" Set Alien Called");
        this.age = age;
    }
    public Alien() {
        System.out.println("Alien object created");
    }
}