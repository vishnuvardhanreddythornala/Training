package module12.OOPs.Encapsulation;

class Student {

    // private variables (data hiding)
    private int id;
    private String name;
    private double percentage;

    // public setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercentage(double percentage) {
        if (percentage >= 0 && percentage <= 100) { // validation
            this.percentage = percentage;
        }
    }

    // public getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }
}


public class Demo {

    public static void main(String[] args) {

        Student s1 = new Student();

        // setting values using setters
        s1.setId(101);
        s1.setName("Vishnu");
        s1.setPercentage(85.5);

        // getting values using getters
        System.out.println("Student ID: " + s1.getId());
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Percentage: " + s1.getPercentage());
    }
}

