import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main extends lt.itakademija.exam.test.BaseTest{
    public Main() {
        super();
    }

    @Override
    public void setUp() {
        super.setUp();
    }

    @Override
    public void createsExamExercisesCorrectly() {
        super.createsExamExercisesCorrectly();
    }

    @Override
    public void findsSmallestIntegerInList() {
        super.findsSmallestIntegerInList();
    }

    @Override
    public void findsLargestIntegerInList() {
        super.findsLargestIntegerInList();
    }

    @Override
    public void checksObjectLogicalEquality() {
        super.checksObjectLogicalEquality();
    }

    @Override
    public void checksObjectPhysicalEquality() {
        super.checksObjectPhysicalEquality();
    }

    @Override
    public void computesTheSumOfAllNumbersFrom1ToN() {
        super.computesTheSumOfAllNumbersFrom1ToN();
    }

    @Override
    public void computesTheSumOfAllFilteredNumbersFrom1ToN() {
        super.computesTheSumOfAllFilteredNumbersFrom1ToN();
    }

    @Override
    public void computesTheListOfNumbersFrom1ToN() {
        super.computesTheListOfNumbersFrom1ToN();
    }

    @Override
    public void consumesAllNumbersFromIterator() {
        super.consumesAllNumbersFromIterator();
    }

    @Override
    public void countsOccurrences() {
        super.countsOccurrences();
    }

    @Override
    public void generatesIntegers() {
        super.generatesIntegers();
    }

    @Override
    public void generatesFilteredIntegers() {
        super.generatesFilteredIntegers();
    }

    @Override
    protected Exercises createExercises() {
        return new Exercises() {
            @Override
            public Integer findSmallest(List<Integer> list) {
                    Collections.sort(list);
                    int element=list.get(0);
                    return element;
            }

            @Override
            public Integer findLargest(List<Integer> list) {
                Collections.sort(list);
                int element=list.get(list.size()-1);
                return element;
            }

            @Override
            public boolean isEqual(Object o, Object o1) {
                if(o.equals(o1)){
                    return true;
                }
                return false;
            }

            @Override
            public boolean isSameObject(Object o, Object o1) {
                if(o.equals(o1) && o == o1){
                    return true;
                }
                return false;

            }

            @Override
            public List<Integer> consume(Iterator<Integer> iterator) {
                List<Integer> list = new ArrayList<>();

                return list;
            }

            @Override
            public int computeSumOfNumbers(int i) {
                int sum = 0;
                for(int j=0; j<=i; j++){

                    sum+=j;

                }
                return sum;

            }

            @Override
            public int computeSumOfNumbers(int i, NumberFilter numberFilter) {
                int sum=0;
                for(int j=1; j<=i; j++){
                    if(numberFilter.accept(j)){
                        sum=sum+j;
                    }
                }
                return sum;
            }

            @Override
            public List<Integer> computeNumbersUpTo(int i) {
                List<Integer> list = new ArrayList<>();
                for(int j=1; j<i; j++){
                    list.add(j);
                }
                return list;
            }

            @Override
            public Map<Integer, Integer> countOccurrences(List<Integer> list) {
                int result;
                for(int i=0; i<list.size(); i++){
                   // if(){

                   // }
                }
                return null;
            }

            @Override
            public IntegerGenerator createIntegerGenerator(int i, int i1) {

                return null;



            }

            @Override
            public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
                return null;

            }
        };
    }

    public static void main(String[] args) {

    }
}