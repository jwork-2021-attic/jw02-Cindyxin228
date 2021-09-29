package S191220097.taskThree;

public class QuickSorter implements Sorter {
    private int[] a;

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

    int partition(final int low, final int high) {
        int pivotPos = low;
        int pivot = a[low];
        for (int i = low + 1; i <= high; i++) {
            if (a[i] < pivot) {
                pivotPos++;
                if (pivotPos != i) {
                    swap(pivotPos, i);
                }
            }
        }
        swap(low, pivotPos);
        return pivotPos;
    }

    void quickSort(final int left, final int right) {
        if (left < right) {
            int pivotPos = partition(left, right);
            quickSort(left, pivotPos - 1);
            quickSort(pivotPos + 1, right);
        }
    }

    @Override
    public void sort() {
        quickSort(0, a.length - 1);
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

}
