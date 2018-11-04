import Sorters.BubbleSort;

public class Tester {

    public static void main(String[] args) {

        Randomizer randomizer = new Randomizer(10);

        int[] array = randomizer.getRandomArray();
        new BubbleSort(array);

    }

}
