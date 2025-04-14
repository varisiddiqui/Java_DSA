// Java program to illustrate usage of
// return keyword in void method
 
// Class 1
// Main class
class returnStat {
 
    // Method 1
    // Since return type of RR method is
    // void so this method should not return any value
    void demofunction(double j)
    {
        if (j < 9)
 
            // return statement below(only using
            // return statement and not returning
            // anything):
            // control exits the method if this
            // condition(i.e, j<9) is true.
            return;//means not returning any value
        ++j;
    }
    //Note: return statement need not to be last statement in a method, but it must be last statement to execute in a method. 

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        returnStat gfg = new returnStat();
        // Calling above method declared in above class
        gfg.demofunction(5.5);
 
        // Display message on console to illustrate
        // successful execution of program
        System.out.println("Program executed successfully");
    }
}
/*public class returnStat
{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.println(j);
            }
            if(i==2)
                break;
            System.out.println(i+",");
        }
    }
}*/
//Above will clear difference between return; and break;