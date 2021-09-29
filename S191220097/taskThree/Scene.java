package S191220097.taskThree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scene {

    public static void main(String[] args) throws IOException {

        final int num = 64;
        // Line line = new Line(num);
        Line line = new Matrix(64, 8);
        Monster.initialize(num);
        for (int i = 0; i < num; i++) {
            line.put(Monster.monster[i], i);
        }

        Snake theSnake = Snake.getTheSnake();

        // Sorter sorter = new BubbleSorter();
        Sorter sorter = new QuickSorter();
        // Sorter sorter = new SelectSorter();

        theSnake.setSorter(sorter);

        String log = theSnake.lineUp(line);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
