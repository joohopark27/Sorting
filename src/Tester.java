import Mixer.Randomizer;
import Sorters.*;

public class Tester {

    public static void main(String[] args) {

        Randomizer randomizer = new Randomizer(10);

        int[] array = randomizer.getRandomArray();
//        int[] array = {5, 4, 3, 2, 1};

//        new BubbleSort(array.clone());
//        new CombSort(array.clone());
//        new BogoSort(array.clone());
//        new SelectionSort(array.clone());
//        new InsertionSort(array.clone());
//        new MergeSort(array.clone());
//        new RadixSort(array.clone());
        new QuickSort(array.clone());

    }

}
