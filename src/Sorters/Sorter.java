package Sorters;

import java.util.Arrays;

public abstract class Sorter {

    int[] array;
    boolean sortComplete;

    Sorter(int[] array){

        long startTime = System.nanoTime();
        sortComplete = false;
        this.array = array;

        sort();
        print();

        System.out.println("\nIt took " + (System.nanoTime() - startTime) + " nanoseconds for completion");
    }

    protected void print(){

        for(int i : array){

            System.out.print(i);

        }

        System.out.println();

    }

    protected void isSorted(){

        for(int i = 1; i < array.length; i++){
            if(array[i - 1] > array[i]){
                return;
            }
        }

        sortComplete = true;
    }

    protected abstract void sort();

}
