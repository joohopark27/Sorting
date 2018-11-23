package Sorters;

public class CombSort extends Sorter {

    public CombSort(int[] array){

        super(array);

    }

    @Override
    protected void sort() {

        for(int gap = array.length; gap > 0; gap--){
            for(int i = 0; i + gap < array.length; i++){

                if(compare(i, i + gap)){
                    change(i, i + gap);
                }

            }
        }

    }

}
