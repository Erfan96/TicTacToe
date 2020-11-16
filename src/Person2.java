public class Person2 {
    private String name;
    private char bead;

    public Person2(String n, char b) {
        setName(n);
        setBead(b);
        display();
    }

    public void display(){
        System.out.println(getName() + "  : " + getBead());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getBead() {
        return bead;
    }

    public void setBead(char bead) {
        this.bead = bead;
    }
}
