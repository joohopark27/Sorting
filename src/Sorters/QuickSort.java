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

        int pivot = start / finish;
        int[] temp = new int[array.length];

        int smaller = start;
        int larger = finish;

        for(int i = 0; i < array.length; i++){

            if(compare(i, pivot)){

                temp[larger--] = array[i];

            }else{

                temp[smaller++] = array[i];

            }

        }

        System.out.println(array[pivot]);
        System.out.println(smaller);
        System.out.println(larger);
        System.out.println(smaller == larger);
        array = temp;
        sort(start, larger);
        sort(smaller, finish);
    }

}
