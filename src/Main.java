import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            arrayList.add(i);
        }
        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 100; j++) {
                if (arrayList.contains(i * j)) {
                    arrayList.remove(arrayList.indexOf(i * j));
                }
            }
        }
        System.out.println("Не простые числа!");
        for (int i = 1; i <= 100; i++) {
            if (!arrayList.contains(i)) {
                System.out.print(i + " ");
            }
        }

    }


    }
