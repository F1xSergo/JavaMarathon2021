package day9.Task1;

public class Student extends Human {
    private String groupName;


    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void printInfo(){
        String a =  "Этот студент с именем " + super.getName();
        super.printInfo();
        System.out.println(a);


    }
}
