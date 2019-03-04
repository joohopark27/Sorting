package Sorters;

public class QuickSort extends Sorter {

    public QuickSort(int[] array){

        super(array);

    }

    @Override
    protected void sort(int start, int finish) {

        if(finish <= start || finish < 0){

            return;

        }

        int pivot = (start + finish) / 2;
        int[] temp = array.clone();

        int smaller = start;
        int larger = finish;

        for(int i = start; i < finish + 1; i++){

            if(i == pivot){
                continue;
            }

            if(compare(i, pivot)){

                temp[larger--] = array[i];

            }else{

                temp[smaller++] = array[i];

            }

        }

        temp[smaller] = array[pivot];
        array = temp;

        /*System.out.println(" " + smaller);
        System.out.println(" " + larger);
        System.out.println(smaller == larger);
        System.out.println(this);*/

        sort(start, smaller - 1);
        sort(smaller + 1, finish);
    }

}
