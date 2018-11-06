package Sorters;

public class InsertionSort extends Sorter {

    private int k;

    public InsertionSort(int[] array){

        super(array);

    }

    @Override
    protected void init() {

        k = 0;

    }

    @Override
    protected void sortMethod() {

        k++;

        for(int i = k - 1; i >= 0; i--){

            if(array[i + 1]  > array[i]){
                break;
            }else{

                change(i, i + 1);

            }

        }

    }

}
