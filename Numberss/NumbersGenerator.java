import lt.itakademija.exam.IntegerGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class NumbersGenerator implements IntegerGenerator {
    private int min;
    private int max;
    @Override
    public Integer getNext() {

        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        return randomNum;
    }



}
