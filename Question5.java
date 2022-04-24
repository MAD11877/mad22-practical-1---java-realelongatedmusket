import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int num = in.nextInt();
    System.out.println("Enter " + num + " integers");
    List<Integer> valList = new ArrayList<>();
    for(int i = 0; i < num; i++) {
        System.out.println("Enter next integer: ");
        int val = in.nextInt();
        valList.add(val);
    }
    in.close();
    int maxNum = -1;
    int maxAppearances = -1;
    for(int i = 0; i < valList.size(); i++){
        int count = 0;
        for(int j = 0; j < valList.size(); j++){
            if (valList.get(i) == valList.get(j))
                count++;
        }
        if (count > maxAppearances){
          maxNum = valList.get(i);
          maxAppearances = count;
        }
    }
    System.out.println("The mode is " + maxNum);
 
    

  }
}
