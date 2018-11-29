package Sorters;

public class RadixSort extends Sorter{

    public RadixSort (int[] array){

        super(array);

    }

    private int findMax(){

        int max = array[0];

        for(int num: array){
            max = (num > max) ? num : max;
        }

        return max;

    }

    @Override
    protected void sort(int start, int finish) {

        int max = findMax();
        int base = 10;

        for(int i = 1; i <= max; i *= 10){

            int[] temp = new int[array.length];
            int pos = 0;

            for(int count = 0; count < base; count++){

                for(int j = 0; j < array.length; j++){
                    if((array[j] / i) % 10 == count){

                        temp[pos++] = array[j];

                    }
                }

            }

            array = temp;

        }

    }
}