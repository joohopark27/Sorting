package Sorters;

public class QuickSort extends Sorter {

    public QuickSort(int[] array){

        super(array);

    }

    @Override
    protected void sort(int start, int finish) {

        if(start == finish){

            return;

        }

        int pivot = (start + finish) / 2;
        int[] temp = array.clone();

        int smaller = start;
        int larger = finish;

        System.out.println(array[pivot] + " " + pivot);

        for(int i = 0; i < array.length; i++){

            if(i == pivot){
                continue;
            }

            if(compare(i, pivot)){

                temp[larger--] = array[i];
                System.out.println(larger);

            }else{

                temp[smaller++] = array[i];
                System.out.println(smaller);

            }

        }

        System.out.println(this);
        temp[smaller] = array[pivot];
        System.out.println(" " + smaller);
        System.out.println(" " + larger);
        System.out.println(smaller == larger);
        array = temp;
        System.out.println(this);
//        sort(start, smaller - 1);
//        sort(smaller + 1, finish);
    }

}
