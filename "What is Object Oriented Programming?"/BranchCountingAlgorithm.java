
/* This is where we create our class (a folder-like thing to store code).
 * The modifier "public" means it can be called from other classes, 
 * but is slightly irrelevant to this example.
*/
public class BranchCountingAlgorithm {
    
    /* Declare fields ("double" means the field represents a decimal) */
    
    static double aliveBranches = 10;
    static double deadBranches = 0;
    static double decrease = aliveBranches * 2;
    static double increase = aliveBranches * 0.5;
    

    /* Define growing() method by adding parameters for it to follow */
    private static void growing(double increase) {
        aliveBranches = aliveBranches + increase;
    }

    /* Define dying() method */
    private static void dying(double decrease) {
        aliveBranches = aliveBranches - decrease;
       deadBranches = deadBranches + decrease;
    }
    
    /* Define printStates() method to display data*/
    private static void printStates() {
        System.out.println("Alive Branches: " + aliveBranches);
        System.out.println("Dead Branches: " + deadBranches);
    }
    /* This is known as the "main method" and is a necessary part of any java program.
     * The JVM (one of the many software items needed to run Java programs) will not
     * execute the program without a main method. 
    */
    public static void main(String[] args) {
        
        /* Define a specific growth/death rate in branches*/

        growing(increase);
        dying(decrease);
        printStates();
    }

}
