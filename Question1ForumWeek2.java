import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Question1ForumWeek2 {
    static void PrintArray(){
        //state variable
        int NUM_ITEMS;
        String NumVal;
        int x;
        x = 1;
        NUM_ITEMS = 1;
        NumVal = "";

        while(x==1){
            //input number of items
        Scanner myNum = new Scanner(System.in);
        System.out.println("Enter the number of items (Must be Positive integer): ");

        NUM_ITEMS = myNum.nextInt();
        if (NUM_ITEMS>0){
            break;
        }
        }
        //input items
        Scanner myVal = new Scanner(System.in);
        System.out.println("Enter the value of all items (separated by space): ");

        NumVal = myVal.nextLine();
        String[] ValSplit = NumVal.split(" ");//split spaces

        int [] Items = new int[NUM_ITEMS];
        Items[0] = 5;
        for(int i=0; i<Items.length;i++){
            Items[i] = Integer.parseInt(ValSplit[i]);
            //putting int into array
        }
        System.out.println(Arrays.toString(Items));
    }
    public static void main(String[] args) {
        PrintArray();
    }    
}