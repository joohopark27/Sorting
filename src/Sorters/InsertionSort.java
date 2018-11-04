package Sorters;

public class InsertionSort extends Sorter {

    private int k = 0;

    public InsertionSort(int[] array){

        super(array);

    }

    @Override
    protected void sortMethod() {

        k++;

        for(int i = k - 1; i >= 0; i--){

            if(array[i + 1]  > array[i]){
                break;
            }else{

                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

            }

        }

    }

}