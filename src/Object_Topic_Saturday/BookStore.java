package Object_Topic_Saturday;

public class BookStore {
    public static void main(String[] args) {
       Book book1=new Book("Harry Potter", "Cybertek",200);
       Book book2 = new Book (" HP", "Cyber", 167);

       Book [] myBooks = new Book [3];
       myBooks[0] =book1;
       myBooks[1]=book2;
       for (Book eachBook: myBooks){
           eachBook.info();
           System.out.println(eachBook.name + " has " + eachBook.pages + " pages ");
       }


       for (int i=0; i<myBooks.length;i++){


}











    }














}
