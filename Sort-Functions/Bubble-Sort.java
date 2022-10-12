import java.util.Arrays;

public class Bubble_Sort {

    public static void main(String[] args) {

        int mas[] = new int[10];
        for(int i=0; i<mas.length; i++){
            mas[i] = (int) (Math.random()*10);
        }
        System.out.println("Not sorted random numbers: " + Arrays.toString(mas));
        int tmp;
        for(int i=0; i<mas.length; i++){
            for(int j=0; j<mas.length-1; j++){
                if(mas[j]>mas[j+1]){
                    tmp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = tmp;
                }
            }
        }
        System.out.println("Sorted random numbers: " + Arrays.toString(mas));

    }
}
