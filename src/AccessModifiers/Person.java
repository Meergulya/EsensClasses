package AccessModifiers;

public class Person {
     String name;
     double height;
    double weight;
    String gender;
    int age;

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >0 && age <= 120) {
            this.age = age;
        }else{
            System.out.println("Not valid age");
        }
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
            this.gender = gender;
        } else {
            System.out.println("Invalid gender entered. Please try again!");
        }
    }
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }else{
            System.out.println("Invalid weight entered");
        }
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }else{
            System.out.println("Invalid height entered");
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }














}
