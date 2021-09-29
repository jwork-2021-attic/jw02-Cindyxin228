package S191220097.taskSecond;

public class SelectSorter implements Sorter {
    private int[] a;

    // get the array to be sorted
    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    private String plan = "";

    @Override
    public void sort() {
        for (int i = 0; i < a.length; i++) {
            int k = i;
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < a[k])
                    k = j;
            }
            if (k != i)
                swap(i, k);
        }
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

}
