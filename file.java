import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileExample {
    public static void main(String[] args) {
        try {
            File file = new File("ajay.txt");
            if (file.createNewFile()) {
                System.out.println("created");
    
            } else {
                System.out.println("not");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
