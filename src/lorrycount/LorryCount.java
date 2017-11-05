package lorrycount;

import java.util.Scanner;

/**
 * @author Imran Aziz 16:48 11/10/2017
 */

public class LorryCount 
{
    
    public static void main(String args[])
    {
        
        end(LorryNum()); //runs the only important method 
        
    }
    
    public static void end(double Pc)
    {
        System.out.println("Lorries were " + Pc + "%" + "of all vehicles this session");
    }
    
    public static double LorryNum() 
    {
        int OtherNum = 0; //declaration and initialisation of my two main variables
        String input = "";
        int LorryNum = 0;
        
        while (!input.equalsIgnoreCase("CLOSE")) 
        {
            input = input("What kind of vehicle passed?");
                            if ("Lorry".equalsIgnoreCase(input)) //accounts for input "lorry"
                            {
                                LorryNum = ++LorryNum; //adds one to LorryNum
                                System.out.println("Lorries:" + LorryNum);
                            }
                            
                            else if (!"Close".equalsIgnoreCase(input))
                            {
                                OtherNum = ++OtherNum; //accounts for all other input, adds one to OtherNum
                                System.out.println("Other:" + OtherNum);
                            }
        }
        
        return percentage(LorryNum,OtherNum); //returns percentage, calling LorryNum and OtherNum to create Pc
    }
    
    public static String input(String variable) {
        
         Scanner scan = new Scanner(System.in); //takes input
         System.out.println(variable);
         return scan.nextLine();
    }
    
    public static double percentage(int LorryNum, int OtherNum) 
    {
        
        System.out.println("You saw " + LorryNum + " Lorries");
        double Both = LorryNum + OtherNum;
        double Pcdouble = LorryNum / Both;
        double Pc = Pcdouble * 100;
        return Math.round(Pc); //creates percentage variable "Pc" based on LorryNum and OtherNum
    }
    
}
