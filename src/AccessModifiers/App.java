package AccessModifiers;

import java.util.ArrayList;

public class App {
    private String description;
    private double size;
    private ArrayList<String> reviews;
    private String name;
    private String category;
    private double rating;
    public static int numberOfApps;


    public App(String name, String category, double size) {
        this.name = name;
        this.size = size;
        this.category = category;
        numberOfApps++;
        this.reviews=new ArrayList<>();
    }
public static int getNumberOfApps(){
        return numberOfApps;
}
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public double getSize() {
        return size;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void setReview(String reviews) {
        if (reviews.length() > 3) {
            this.reviews.add(reviews);
            System.out.println("Success message");
        } else {
            System.out.println("Failure message");
        }
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void open() {
        System.out.println(this.name + " is opening! ");
    }

    public void close() {
        System.out.println(this.name + " is closing! ");
    }

    public void update() {
        System.out.println(this.name + " is updating! ");
    }

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("Category: " + this.category);
        System.out.println("Size: " + this.size);
        System.out.println("Description: " + this.description);
        System.out.println("Rating: " + this.rating);
    }







}


