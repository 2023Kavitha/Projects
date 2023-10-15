import java.util.ArrayList;
import java.util.Collections;

class Shuffled_Array {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(6);
        A.add(7);
        Collections.shuffle(A);
        System.out.println(A);

    }
}