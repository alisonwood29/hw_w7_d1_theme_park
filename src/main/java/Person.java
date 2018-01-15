public abstract class Person {

    public String name;
    public double height;

    public Person(String name, double height){
        this.name = name;
        this.height = height;
    }


    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }
}
