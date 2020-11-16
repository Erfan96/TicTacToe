public class Person1 {
    private String name;
    private char bead;

    public Person1(String n, char b) {
        setName(n);
        setBead(b);
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
