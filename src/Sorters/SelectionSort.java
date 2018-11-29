package Sorters;

public class SelectionSort extends Sorter{

    public SelectionSort(int[] array){

        super(array);

    }

    @Override
    protected void sort(int start, int finish) {

        for (int sortedPos = 0; sortedPos < array.length; sortedPos++) {

            int smallestNumPos = sortedPos;

            for (int i = sortedPos + 1; i < array.length; i++) {

                if (compare(smallestNumPos, i)) {

                    smallestNumPos = i;

                }

            }

            change(smallestNumPos, sortedPos);

        }
    }

}
