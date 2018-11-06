package Sorters;

public class SelectionSort extends Sorter{

    private int sortedPos;

    public SelectionSort(int[] array){

        super(array);

    }

    @Override
    protected void init() {

        sortedPos = 0;

    }

    @Override
    protected void sortMethod() {

        int smallestNumPos = sortedPos;

        for(int i = sortedPos + 1; i < array.length; i++){

            if (array[smallestNumPos] > array[i]){

                smallestNumPos = i;

            }

        }

        change(smallestNumPos, sortedPos);
        sortedPos++;

    }

}
