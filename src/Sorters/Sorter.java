package Sorters;

public abstract class Sorter {

    int[] array;
    private long startTime;

    Sorter(int[] array){

        startTime = System.nanoTime();
        this.array = array;

        sort();

    }

    protected void sort(){
        
        init();

        while(!isSorted()){

//            print();
            sortMethod();

        }

        end();

    }

    public String toString(){

        String string = "[ ";

        for(int i : array){

            string += i + " ";

        }

        string += "]";
        return string;

    }

    /**
     * changes a[a1] to a[a2]
     *
     * @param a1 location of place to switch
     * @param a2 another location of place to switch
     */
    protected final void change(int a1, int a2){

        int temp = array[a1];
        array[a1] = array[a2];
        array[a2] = temp;

    }

    /**
     * checks if the array is sorted
     *
     * @return if it is sorted or not
     */
    protected final boolean isSorted(){

        for(int i = 1; i < array.length; i++){
            if(array[i - 1] > array[i]){
                return false;
            }
        }

        return true;
    }

    private void end(){

        System.out.println("\nIt took " + ((System.nanoTime() - startTime) / 1000000) + " milliseconds for completion");
        System.out.println(this);

    }

    protected abstract void init();
    protected abstract void sortMethod();

}
