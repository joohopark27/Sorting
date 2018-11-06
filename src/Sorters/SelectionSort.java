package Sorters;

public class SelectionSort extends Sorter{

    private int sortedPos = 0;

    public SelectionSort(int[] array){

        super(array);

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
