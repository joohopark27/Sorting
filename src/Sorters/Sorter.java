package Sorters;

public abstract class Sorter {

    int[] array;
    private long startTime;
    private int comparisons;

    Sorter(int[] array){

        startTime = System.nanoTime();
        this.array = array;
        comparisons = 0;

        sort(0, array.length - 1);
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
     * compares 2 index
     *
     * @return true if a1 is bigger, false if a2 is bigger
     */
    protected final boolean compare(int a1, int a2){

        comparisons++;
        return array[a1] > array[a2];

    }

    /**
     * switches a[a1] to a[a2]
     *
     * @param a1 location of place to switch
     * @param a2 another location of place to switch
     */
    protected final void change(int a1, int a2){

        int temp = array[a1];
        array[a1] = array[a2];
        array[a2] = temp;

//        System.out.println(this);

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

        if(isSorted()) {
            System.out.println("\nIt took " + ((System.nanoTime() - startTime) / 1000000) + " milliseconds for completion");
            System.out.println("It took " + comparisons + " comparisons");
        }else{
            System.out.println("\nSort incomplete");
        }

        System.out.println(this);
    }

    protected abstract void sort(int start, int finish);

}
