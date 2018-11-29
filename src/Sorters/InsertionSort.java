package Sorters;

public class InsertionSort extends Sorter {

    public InsertionSort(int[] array){

        super(array);

    }

    @Override
    protected void sort(int start, int finish) {

        for (int k = 1; k < array.length; k++) {
            for (int i = k - 1; i >= 0; i--) {

                if (compare(i + 1, i)) {
                    break;
                } else {

                    change(i, i + 1);

                }

            }
        }

    }

}
