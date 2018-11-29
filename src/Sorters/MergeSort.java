package Sorters;

public class MergeSort extends Sorter {

    public MergeSort(int[] array){

        super(array);

    }

    @Override
    protected void sort(int start, int end){

        if(start == end){
            return;
        }

        int middle = (start + end) / 2;

        sort(start, middle);
        sort(middle + 1, end);

        int[] temp = array.clone();
        int a0 = start, a1 = start, a2 = middle + 1;

        while(a1 <= middle && a2 <= end){

            temp[a0++] = (compare(a1, a2)) ? array[a2++] : array[a1++];

        }
        while(a1 <= middle){
            temp[a0++] = array[a1++];
        }
        while(a2 <= end){
            temp[a0++] = array[a2++];
        }

        array = temp;

    }

}
