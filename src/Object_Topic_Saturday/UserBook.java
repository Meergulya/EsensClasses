package Object_Topic_Saturday;

import java.util.Scanner;

public class UserBook {

    public UserBook() {

        Scanner input = new Scanner(System.in);
        System.out.println("How many books do you have ? ");
        int number_books = input.nextInt();
         input.nextLine();
         Book [] library = new Book[number_books];



        for (int i=0;i<library.length;i++){
        System.out.println("Titles of the books : " + (i+1));
        String name = input.nextLine();
        System.out.println(" Who are the authors : " + (i+1));
        String author =input.nextLine();
        System.out.println(" How many pages are in each book? " + (i+1));
        int pages = input.nextInt();
        input.nextLine();
        library[i] = new Book (name,author,pages);



        }
for (Book book: library){
    System.out.println(book.name);
}



        }

    }















