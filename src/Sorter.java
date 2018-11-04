public abstract class Sorter {

    protected int[] array;

    public Sorter(int[] array){

        this.array = array;
        sort();

    }

    public void print(){

        for(int i : array){

            System.out.print(i);

        }

        System.out.println();

    }

    public abstract void sort();

}
