package Task6;

//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/Task6/file.csv";
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123},
                {300, 400, 500}};
        AppData appData = new AppData(header, data);
        appData.saveIntoFile(fileName);
        AppData result = appData.readFromFile(fileName);


        System.out.println(String.join("; ", result.getHeader()));

        for (int[] row : result.getData()) {
            if (row != null) {
                for (int element : row) {
                    System.out.print(element + "; ");
                }
                System.out.print("\n");
            }
        }

    }
}
