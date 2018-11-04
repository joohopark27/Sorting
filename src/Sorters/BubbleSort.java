package Sorters;

public class BubbleSort extends Sorter {

    public BubbleSort(int[] array){

        super(array);

    }

    @Override
    public void sort() {

        for(int i = 0; i < array.length; i++){

            for(int j = 1; j < array.length; j++){

                if(array[j - 1] > array[j]){

                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                }

            }

            print();

        }

    }
}
