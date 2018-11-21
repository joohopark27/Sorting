package Sorters;

public class SelectionSort extends Sorter{

    public SelectionSort(int[] array){

        super(array);

    }

    @Override
    protected void sort() {

        for (int sortedPos = 0; sortedPos < array.length; sortedPos++) {

            int smallestNumPos = sortedPos;

            for (int i = sortedPos + 1; i < array.length; i++) {

                if (array[smallestNumPos] > array[i]) {

                    smallestNumPos = i;

                }

            }

            change(smallestNumPos, sortedPos);

        }
    }

}
