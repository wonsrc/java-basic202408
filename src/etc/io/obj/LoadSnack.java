package etc.io.obj;

import etc.io.FileExample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class LoadSnack {

    public static void main(String[] args) {

        try(FileInputStream fis =
                    new FileInputStream(FileExample.ROOT_PATH + "\\snack.sav")) {

            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Snack> snackList = (List<Snack>) ois.readObject();

            for (Snack snack : snackList) {
                System.out.println(snack.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
