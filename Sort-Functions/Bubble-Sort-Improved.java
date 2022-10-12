import java.util.Arrays;

public class Bubble_Sort_Improved {

    public static void main(String[] args) {

        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
        }
        System.out.println("Not sorted random numbers: " + Arrays.toString(mas));
        int tmp;
        boolean statusSort = false;
        while (!statusSort) {
            statusSort = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    statusSort = false;
                    tmp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = tmp;
                }
            }
        }
        System.out.println("Sorted random numbers: " + Arrays.toString(mas));
    }
}
