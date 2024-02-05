package Task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppData {
    private String[] header;
    private int[][] data;

    private int buffForArray = 30;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void saveIntoFile(String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(String.join(";", header));
            fileWriter.write("\n");
            for (int i = 0; i < data.length; i++) {
                String[] rowData = new String[data[i].length];
                for (int j = 0; j < rowData.length; j++) {
                    rowData[j] = Integer.toString(data[i][j]);
                }
                fileWriter.write(String.join(";", rowData));
                fileWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public AppData readFromFile(String fileName) {
        String[] headers = null;
        int[][] data = null;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String row;
            row = fileReader.readLine();
            if (row != null) {
                headers = row.split(";");
            }
            int rowIterator = 0;

            while ((row = fileReader.readLine()) != null) {
                String[] rowValues = row.split(";");
                if (data == null) {
                    data = new int[buffForArray][];
                }

                int[] rowData = new int[rowValues.length];

                for (int i = 0; i < rowValues.length; i++) {
                    rowData[i] = Integer.parseInt(rowValues[i]);
                }
                data[rowIterator] = rowData;
                rowIterator++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new AppData(headers, data);
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }
}