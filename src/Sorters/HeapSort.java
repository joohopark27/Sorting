package Sorters;

public class HeapSort extends Sorter {

    private int treeSize;

    public HeapSort(int[] array){

        super(array);
        treeSize = 0;

    }

    @Override
    protected void sort(int start, int finish) {

        for (int i = start; i <= finish; i++){

            add(start);

        }

        System.out.println(this);

        for (int i = start; i <= finish; i++){

            remove(start);

        }

    }

    private void add(int start){

        int pos = start + treeSize++;

        while(compare(pos, (pos - start - 1) / 2 + start) && pos > start){

            change(pos, (pos - start - 1) / 2 + start);
            pos = (pos - start - 1) / 2 + start;

        }

    }

    private void remove(int start){

        change(start, start + --treeSize);

        int pos = start;

        while(((pos - start) * 2 + 1 < treeSize && compare((pos - start) * 2 + 1 + start, pos))
                || ((pos - start) * 2 + 2 < treeSize && compare((pos - start) * 2 + 2 + start, pos))){

            if(compare((pos - start) * 2 + 1, (pos - start) * 2 + 2)){

                change(pos, (pos - start) * 2 + 1 + start);
                pos = (pos - start) * 2 + 1 + start;

            }else if((pos - start) * 2 + 2 < treeSize){

                change(pos, (pos - start) * 2 + 2 + start);
                pos = (pos - start) * 2 + 2;

            }else{
                break;
            }

        }

    }

}
