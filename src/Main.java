import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Лог установки:" + "\n");

        File src = new File("F://Games", "src");
        File res = new File("F://Games", "res");
        File savegame = new File("F://Games", "savegame");
        File temp = new File("F://Games", "temp");

        if (src.mkdir())
            sb.append(src.getName()).append(" успешно создана" + "\n");
        else
            sb.append("Ошибка!" + "\n");

        if (res.mkdir())
            sb.append(res.getName()).append(" успешно создана" + "\n");
        else
            sb.append("Ошибка!" + "\n");

        if (savegame.mkdir())
            sb.append(savegame.getName()).append(" успешно создана" + "\n");
        else
            sb.append("Ошибка!" + "\n");

        if (temp.mkdir())
            sb.append(temp.getName()).append(" успешно создана" + "\n");
        else
            sb.append("Ошибка!" + "\n");

        File main = new File("F://Games/src", "main");
        File test = new File("F://Games/src", "test");

        if (main.mkdir())
            sb.append(main.getName()).append(" успешно создана" + "\n");
        else
            sb.append("Ошибка!" + "\n");

        if (test.mkdir())
            sb.append(test.getName()).append(" успешно создана" + "\n");
        else
            sb.append("Ошибка!" + "\n");

        File Main = new File("F://Games/src/main", "Main.java");
        File Utils = new File("F://Games/src/main", "Utils.java");

        try {
            if (Main.createNewFile())
                sb.append("Файл ").append(Main.getName()).append(" успешно создана" + "\n");
            else
                sb.append("Ошибка! Файл ").append(Main.getName()).append(" не создан" + "\n");
        } catch (IOException exception) {
            sb.append(exception.getMessage());
        }

        try {
            if (Utils.createNewFile())
                sb.append("Файл ").append(Utils.getName()).append(" успешно создан" + "\n");
            else
                sb.append("Ошибка! Файл ").append(Utils.getName()).append(" не создан" + "\n");
        } catch (IOException exception) {
            sb.append(exception.getMessage());
        }

        File drawables = new File("F://Games/res", "drawables");
        File vectors = new File("F://Games/res", "vectors");
        File icons = new File("F://Games/res", "icons");

        if (drawables.mkdir())
            sb.append(drawables.getName()).append(" успешно создана" + "\n");
        else
            sb.append("Ошибка!" + "\n");

        if (vectors.mkdir())
            sb.append(vectors.getName()).append(" успешно создана" + "\n");
        else
            sb.append("Ошибка!" + "\n");

        if (icons.mkdir())
            sb.append(icons.getName()).append(" успешно создана" + "\n");
        else
            sb.append("Ошибка!" + "\n");

        File Temp = new File("F://Games/temp", "temp.txt");

        try {
            if (Temp.createNewFile())
                sb.append("Файл ").append(Temp.getName()).append(" успешно создан" + "\n");
            else
                sb.append("Ошибка! Файл ").append(Temp.getName()).append(" не создан" + "\n");
        } catch (IOException exception) {
            sb.append(exception.getMessage());
        }

        try (FileWriter text = new FileWriter("F://Games/temp/temp.txt")) {
            text.write(String.valueOf(sb));
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}