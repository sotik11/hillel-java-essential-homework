package essential.java.hillel.sotik.home_work_6;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class journalEvents {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/home-work-6/journalEvents_ru.csv");
        List<String[]> subList2d = new ArrayList<>();
        List<String> subList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(String.valueOf(path)));
        String line = br.readLine();

        do {
            String[] temp = line.split(",");
            String lastWord = temp[temp.length - 1];
            subList2d.add(line.split("," + lastWord));
            subList.add(lastWord);
        } while ((line = br.readLine()) != null);

        String[][] array2d = new String[subList2d.size()][];
        String[] array = new String[subList.size()];

/*        for (int i = 0; i < subList2d.size(); i++) {
            String[] row2d = subList2d.get(i);
            array2d[i] = row2d;
        }
        for (int j = 0; j < subList.size(); j++) {
            String row = subList.get(j);
            array[j] = row;
        }
        */
        for (int i = 0, j = 0; i < subList2d.size() && j < subList.size(); i++, j++) {
            String[] row2d = subList2d.get(i);
            array2d[i] = row2d;
            String row = subList.get(j);
            array[j] = row;
        }

        System.out.println(Arrays.deepToString(array2d));
        System.out.println(Arrays.toString(array));
    }
}
