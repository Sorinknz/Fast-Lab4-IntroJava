import javax.imageio.IIOException;
import java.io.IOException;

/**
 * Created by Sorin on 4/8/2016.
 */
public class orice extends SkeletonJava {

    public static void main(String[]args){

        String user="soft";
        String parola="123456";

        //lansare notePad doar daca combinatia user-parola e corecta

        boolean allowNotepad=false;
        do {
            String u = readStringGUI("user");
            String p = readStringGUI("Pwd");

            if (user.equals(u) && parola.matches(p)) {
                allowNotepad = true;
            }
        }
            while (!allowNotepad) ;
            lansareNotepad ();
        }
    public static void lansareNotepad(){
        System.out.println("lansare");
        try {
            Runtime.getRuntime().exec("1s");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



