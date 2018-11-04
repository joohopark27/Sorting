import Mixer.Randomizer;
import Sorters.BogoSort;
import Sorters.BubbleSort;
import Sorters.InsertionSort;
import Sorters.SelectionSort;

public class Tester {

    public static void main(String[] args) {

        Randomizer randomizer = new Randomizer(9999);

        int[] array = randomizer.getRandomArray();
//        int[] array = {4, 0, 9, 6, 3, 1, 8, 2, 7, 5};

//        new BubbleSort(array);
//        new BogoSort(array);
//        new SelectionSort(array);
        new InsertionSort(array);

    }

}
