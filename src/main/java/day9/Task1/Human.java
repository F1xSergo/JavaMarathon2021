package day9.Task1;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        String s = "Этот человек с именем " + name;
        System.out.println(s);
    }
}
//    public void printInfo(){
//        System.out.println("Этот человек с именем " + name);
//    }


