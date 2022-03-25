import java.util.Scanner;
import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.ArrayList;
public class Question2ForumWeek2 {
    static void PrintArrayInStars(){
        //state variable
        int NUM_ITEMS;
        String NumVal;
        int x;
        x = 1;
        NUM_ITEMS = 1;
        NumVal = "";
        String RepeatStars;
        RepeatStars = "";

        //input number of items
        while(x==1){
        Scanner myNum = new Scanner(System.in);
        System.out.println("Enter the number of items (Must be Positive integer): ");

        NUM_ITEMS = myNum.nextInt();
        if (NUM_ITEMS>0){
            break;
        }
        }
        Scanner myVal = new Scanner(System.in);
        System.out.println("Enter the value of all items (separated by space): ");

        NumVal = myVal.nextLine();
        String[] ValSplit = NumVal.split(" ");//split spaces
        //create array
        int [] Items = new int[NUM_ITEMS];
        Items[0] = 5;
        //put item in array
        for(int i=0; i<Items.length;i++){
            Items[i] = Integer.parseInt(ValSplit[i]);
        }
        //print stars
        for(int i=0; i<Items.length;i++){
            for(int y=0; y<Items[i];y++){
                RepeatStars += "*";
            }
            System.out.println(Items[i]+": "+RepeatStars+
            "("+Items[i]+")");
            RepeatStars = "";
        }
    }
    public static void main(String[] args) {
        PrintArrayInStars();
    }    
}