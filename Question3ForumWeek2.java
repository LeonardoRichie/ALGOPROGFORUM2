import java.util.Scanner;
import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.ArrayList;
public class Question3ForumWeek2 {
    static void PrintScore(){
        //state variable
        int NUM_ITEMS;
        String NumVal;
        int x;
        x = 1;
        NUM_ITEMS = 1;
        int GradeStud;
        GradeStud = 0;
        float Total;
        float Mean;
        Mean = 0;
        Total = 0;

        //input number of students
        while(x==1){
        Scanner myNum = new Scanner(System.in);
        System.out.println("Enter the number of students (Must be Positive): ");

        NUM_ITEMS = myNum.nextInt();
        if (NUM_ITEMS>0){
            break;
        }
        }
        //create array
        int[] GradeList = new int[NUM_ITEMS];

        //input grade students
        for(int i=0; i<NUM_ITEMS;i++){
            Scanner myGrade = new Scanner(System.in);
            System.out.println("Enter the grade for student "+(i+1)+" :");
            GradeStud = myGrade.nextInt();
            GradeList[i] = GradeStud;
            Total += GradeStud;
        }

        //counting means
        Mean = Total/NUM_ITEMS;
        Arrays.sort(GradeList);
        //printing
        System.out.println("The average is: "+ String.format("%.2f",Mean));
        System.out.println("The minimum is: "+GradeList[0]);
        System.out.println("The maximum is: "+GradeList[NUM_ITEMS-1]);
    }
    public static void main(String[] args) {
        PrintScore();
    }    
}