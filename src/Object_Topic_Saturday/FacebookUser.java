package Object_Topic_Saturday;

public class FacebookUser {
    String username;
    String password;
    String name;
    int age;
    int numberOfFriends;

    public FacebookUser(String username,String password){
        this.username=username;
    if (password.contains(username)){
        System.out.println("Password contained Username");
        this.password="password";
    }else{
        this.password=password;
    }
    }


public FacebookUser(String username, String password,String name){
        boolean valid=true;
    for(int i=0; i<name.length();i++){
    if (!Character.isLetter(name.charAt(i))){
        valid=false;
        break;
    }
    if (valid){
        this.name=name;
    }else{
        System.out.println("Invalid Name");
        this.name= "no name";
    }
    }
}
public FacebookUser(String username,String password,int age,String name,int numberOfFriends){
        this(username,password,name);

        if (age<0){
            System.out.println("Invalid age");
        }else{
            this.age=age;
        }
        if (numberOfFriends<0){
            System.out.println(" Invalid Number Of Friends");
        }else{
            this.numberOfFriends=numberOfFriends;
        }
}
public void info(){

    System.out.println(" Username: " + this.username);
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Number of Friends: " + this.numberOfFriends);
}



public  boolean sendFriendRequest(FacebookUser userTwo){
        int count=0;
        if (this.numberOfFriends>=5000){
            System.out.println("You reached the limit");
            return false;
        }else if (userTwo.numberOfFriends >=5000){
            System.out.println(userTwo.name + " has reached the limit of friends");
            return false;
        }else{
            System.out.println("Request sent");
            this.numberOfFriends++;
            userTwo.numberOfFriends++;
            return true;
        }


}

}
