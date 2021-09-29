package S191220097.taskThree;

//the matrix differs from line only in the showing
public class Matrix extends Line {
    private int colLength;

    Matrix(int num, int col) {
        super(num);
        colLength = col;
    }

    @Override
    public String toString() {
        String lineString = "\t";
        int count = 0;
        for (Position p : positions) {
            if (count == colLength) {
                lineString += "\n\t";
                count = 0;
            }
            count++;
            lineString += p.linable.toString();
        }
        return lineString;
    }
}
