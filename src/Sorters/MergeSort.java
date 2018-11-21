package Sorters;

public class MergeSort extends Sorter {

    private int level;
    private int i;
    private int a1, a2;

    public MergeSort(int[] array){

        super(array);

    }

    @Override
    protected void sort() {

        mergeSort(0, array.length - 1);

    }

    private void mergeSort(int start, int end){

        if(start == end){
            return;
        }

        int middle = (start + end) / 2;

        mergeSort(start, middle);
        mergeSort(middle + 1, end);

        int a1 = start, a2 = middle + 1;
        while(a1 <= middle && a2 <= end){

            if(array[a1] > array[a2]){

                change (a1, a2);
                a1++;

            }else{

                a2++;

            }
        }

    }

}
