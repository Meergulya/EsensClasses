package PackageWrapperClass;

import java.util.ArrayList;
import java.util.Random;

public class MagicNumber {
    Random random = new Random();
    ArrayList<Integer> numbers = new ArrayList<>();

    public void generateNumbers(int size) {
        for (int i = 0; i < size; i++) {


            numbers.add(random.nextInt(1000));
        }

    }


    public void generateEvens(int size) {
        Random random = new Random();
        numbers.clear();
while (true){
    int i = random.nextInt(100);
    if (i%2==0){
        numbers.add(i);
    }
if (numbers.size() == size){
    break;
}
}

    }
}