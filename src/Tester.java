import Mixer.Randomizer;
import Sorters.BogoSort;
import Sorters.BubbleSort;

public class Tester {

    public static void main(String[] args) {

        Randomizer randomizer = new Randomizer(5);

        int[] array = randomizer.getRandomArray();
        //new BubbleSort(array);
        new BogoSort(array);

    }

}
