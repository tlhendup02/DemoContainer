package demo.spring.lhendup;

public class Laptop implements Computer{
    public Laptop() {
        System.out.println("Laptop is created");
    }
    public void compile() {
        System.out.println("compiling");
    }
}
