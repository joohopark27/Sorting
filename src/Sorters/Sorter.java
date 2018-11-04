package Sorters;

public abstract class Sorter {

    int[] array;

    Sorter(int[] array){

        this.array = array;
        sort();

    }

    protected void print(){

        for(int i : array){

            System.out.print(i);

        }

        System.out.println();

    }

    protected abstract void sort();

}
