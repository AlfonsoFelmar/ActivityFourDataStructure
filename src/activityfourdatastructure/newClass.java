
package activityfourdatastructure;

public class newClass {

        
    
    public void printStars(int n) {
        
        if(n == 0){
            return;
        }
        
        System.out.println("*");
        printStars(n - 1);
        
        
    }
    
}
