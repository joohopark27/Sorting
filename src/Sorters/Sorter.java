package Sorters;

import java.util.Arrays;

public abstract class Sorter {

    int[] array;
    int[] previousArray;
    boolean sortComplete;

    Sorter(int[] array){

        long startTime = System.nanoTime();
        sortComplete = false;
        this.array = array;

        sort();

        System.out.println("\nIt took " + (System.nanoTime() - startTime) + " nanoseconds for completion");
    }

    protected void print(){

        for(int i : array){

            System.out.print(i);

        }

        System.out.println();

    }

    protected void isSorted(){

        sortComplete = Arrays.equals(array, previousArray);
        previousArray = array.clone();

    }

    protected abstract void sort();

}
