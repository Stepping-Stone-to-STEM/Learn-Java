// Create the class "Tree"
class Tree {
    
    // Declare possible fields (a.k.a. states)
    static String vitality;
    static int branches;
    static String color;

    // Create & define shrivel() method
    static void shrivel(int branchesShriveled){
        branches = branches - branchesShriveled;
    } 

    // Create & define grow() method
    static void grow(int branchesGrown){
        branches = branches + branchesGrown;
    }

    // Create & define setColor() method
    static void setColor(String newColor){
        color = newColor;
    }

    // Create evaluateVitality() method & nested "if... else" clause
    static void evaluateVitality(){
        if(branches <= 0){
        vitality = "dead";
        }else{
            vitality = "alive";
        }
    }

    // Create printStates() method, used to display the new value of each
    // field modified in the prior methods
    static void printStates(){
        evaluateVitality();
        System.out.println("Number of Branches: " + branches);
        System.out.println("Color: " + color);
        System.out.println("Vitality: " + vitality);
    }

} // Tree class end