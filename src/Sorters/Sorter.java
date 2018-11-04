package Sorters;

public abstract class Sorter {

    int[] array;
    private long startTime;

    Sorter(int[] array){

        startTime = System.nanoTime();
        this.array = array;

        sort();

    }

    protected void sort(){

        while(!isSorted()){

//            print();
            sortMethod();

        }

        print();
        end();

    }

    private void print(){

        for(int i : array){

            System.out.print(i);

        }

        System.out.println();

    }

    protected final boolean isSorted(){

        for(int i = 1; i < array.length; i++){
            if(array[i - 1] > array[i]){
                return false;
            }
        }

        return true;
    }

    private void end(){

        System.out.println("\nIt took " + ((System.nanoTime() - startTime) / 1000000) + " milliseconds for completion");

    }

    protected abstract void sortMethod();

}
