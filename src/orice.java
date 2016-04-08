/**
 * Created by Sorin on 4/8/2016.
 */
public class orice extends SkeletonJava {

    public static void main(String[]args){


        //Sa se calculeze factorialul unui numar a
        //factorialul = 1*2*3*...*a

        int a = readIntGUI("Introdu numar:");
        int rez=1;
        int count=1;

        do {
            rez = rez * count;
            count++;
        }

        while (count<=a);
        {
            printGUI("Factorialul este:" + rez);
        }
        }
    }



