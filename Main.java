import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File dir = new File("E:/GamesJava/src");
        File dir1 = new File("E:/GamesJava/res");
        File dir2 = new File("E:/GamesJava/savegames");
        File dir3 = new File("E:/GamesJava/temp");

        dir.mkdir();
        dir1.mkdir();
        dir2.mkdir();
        dir3.mkdir();


        File dir4 = new File("E:/GamesJava/src/main");
        File dir5 = new File("E:/GamesJava/src/test");

        dir4.mkdir();
        dir5.mkdir();

        File file = new File("E:/GamesJava/src/main/Main.java");
        File file1 = new File("E:/GamesJava/src/main/Utils.java");

        try {
            if (file.createNewFile()) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if (file1.createNewFile()) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        File dir6 = new File("E:/GamesJava/res/drawables");
        File dir7 = new File("E:/GamesJava/res/vectors");
        File dir8 = new File("E:/GamesJava/res/icons");

        dir6.mkdir();
        dir7.mkdir();
        dir8.mkdir();

        File file2 = new File("E:/GamesJava/temp/temp.txt");
        try {
            if (file2.createNewFile()) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder sb = new StringBuilder();
        sb.append("каталог " + dir.getName() + " сохранён").append("\n");
        sb.append("каталог " + dir1.getName() + " сохранён").append("\n");
        sb.append("каталог " + dir2.getName() + " сохранён").append("\n");
        sb.append("каталог " + dir3.getName() + " сохранён").append("\n");
        sb.append("каталог " + dir4.getName() + " сохранён").append("\n");
        sb.append("каталог " + dir5.getName() + " сохранён").append("\n");
        sb.append("каталог " + dir6.getName() + " сохранён").append("\n");
        sb.append("каталог " + dir7.getName() + " сохранён").append("\n");
        sb.append("каталог " + dir8.getName() + " сохранён").append("\n");
        sb.append("файл " + file.getName() + " сохранён").append("\n");
        sb.append("файл " + file1.getName() + " сохранён").append("\n");
        sb.append("файл " + file2.getName() + " сохранён").append("\n");
        String text = sb.toString();

        try (FileWriter writer = new FileWriter("E:/GamesJava/temp/temp.txt")) {
            writer.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}