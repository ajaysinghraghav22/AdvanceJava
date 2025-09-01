import java.io.FileWriter;
import java.io.IOException;
class Write{
    public static void main(String [] args){
        try{
FileWriter Writer = new FileWriter("ajay.txt");
Writer.write("hello this side ajay");
 Writer.close();
 System.err.println("kaam 35 hogya");
        }
        catch( IOException e){
            System.out.println("na hua abhi dkt hai");
            e.printStackTrace();
        }

    }
}