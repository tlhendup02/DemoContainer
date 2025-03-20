package demo.spring.lhendup;

public class Alien {

    private int age;
    private Computer laptop;
    private Computer comp;
    private Desktop desktop;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        System.out.println(" Set Alien Called");
        this.age = age;
    }

    public Computer getLaptop(){
        return laptop;
    }
    public void setLap(Computer lap){
        this.laptop = lap;
    }

    public Computer getComp(){
        return comp;
    }
    public void setComp(Computer comp){
        this.comp = comp;
    }

    public Desktop getDesk(){
        return desktop;
    }
    public void setDesk(Desktop desk){
        this.desktop = desk;
    }

    public Alien() {
        System.out.println("Alien object created");
    }
    public void code(){
        laptop.compile();
    }
}