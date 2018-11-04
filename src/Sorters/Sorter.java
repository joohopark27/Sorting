package Sorters;

public abstract class Sorter {

    int[] array;

    Sorter(int[] array){

        long startTime = System.nanoTime();
        this.array = array;

        sort();
        print();

        System.out.println("\nIt took " + ((System.nanoTime() - startTime) / 1000000) + " milliseconds for completion");
    }

    private void sort(){

        while(!isSorted()){

//            print();
            sortMethod();

        }

    }

    private void print(){

        for(int i : array){

            System.out.print(i);

        }

        System.out.println();

    }

    private boolean isSorted(){

        for(int i = 1; i < array.length; i++){
            if(array[i - 1] > array[i]){
                return false;
            }
        }

        return true;
    }

    protected abstract void sortMethod();

}
