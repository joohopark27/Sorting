package Sorters;

public class BogoSort extends Sorter{

    public BogoSort(int[] array){

        super(array);

    }

    @Override
    protected void sort(int start, int finish) {

        while(!isSorted()) {
            randomize();
        }
    }

    private void randomize(){

        int[] temp = array.clone();

        for(int i = array.length - 1; i >= 0; i--){

            int randomNum = (int) Math.floor(Math.random() * i);
            array[i] = temp[randomNum];
            temp[randomNum] = temp[i];

        }

    }

}
