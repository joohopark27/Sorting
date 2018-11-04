/**
 * creates a random array from 0 to n
 * created with Fisher-Yates shuffle
 * https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
 */
public class Randomizer {

    private int[] array;

    /**
     * Constructs a new Randomize that has a array with specific size.
     *
     * @param size size of the array
     */
    public Randomizer(int size){

        array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = i;
        }

    }

    public int[] getRandomArray(){

        randomize();

        return array;

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
