package ReflectionTopicTest;

@Usage(goal = "Airplane entity")
public class Airplane {
    public String name;
    private int age;

    public Airplane(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Airplane() {
        this.name = "Default name";
        this.age = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void startFlightPublic(){
        System.out.printf(name + " starts flying public");
    }

    private void startFlightPrivate(){
        System.out.printf(name + " starts flying private");
    }
}
