public class Cat {
    private String name = "";

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String toString() {
        return "Cat: " + name;
    }
}
