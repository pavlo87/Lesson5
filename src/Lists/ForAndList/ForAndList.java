package Lists.ForAndList;

import java.util.ArrayList;

public class ForAndList {
    public static void main(String[] args) {
        ArrayList<Integer> hundred = new ArrayList<>();
        for (int i=0; i<=100; i++) {
            hundred.add(i);
        }
        System.out.println(hundred);

        ArrayList<Integer>hundred2= new ArrayList<>();
        for (int i=2; i<=100; i=i+2) {
            hundred2.add(i);
        }
        System.out.println("Even numbers: "+hundred2);
        ArrayList<Integer>hundred3= new ArrayList<>();
        for (int i=3; i<=100; i=i+3) {
            hundred3.add(i);
        }
        System.out.println("Number of numbers is multiple 3: "+hundred3.size());

    }
}

