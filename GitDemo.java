/*****
 * Kegan Goo CSE 360
 ******/
public class GitDemo {
    
    private double previousNumber;
v2_branch2

    private double reverseNum;
main
    
    public GitDemo() {
        previousNumber = 1;
    }
    
    /*****
     * This function should add 'num' to 'previousNumber' and return the sum.
    *****/
    public double addNumber(double num) {
        System.out.print("Add num to previousNumber");
v2_branch2

        previousNumber += num;
main
        return 0;
    }
    
    /*****
     * This function should calculate the factorial of 'num' and return the resulting value.
     * i.e. if num = 4,
     *  the function will return the value of (1 * 2 * 3 * 4)
     *****/
    public double findFactorial(int num) {
 v2_branch2
        
        double factorialNumber = 1;
        
        for(int i = 1; i <= num; ++i){
            factorialNumber = factorialNumber * i;

        double factorialNumber = 0;
        
        while( num != 0 ) {
            double temp = num % 10;
            factorialNumber = factorialNumber * 10 + temp;
            num /= 10;
main
        }
        
        return factorialNumber;
    }
    
    /*****
     * This function should reverse 'num' and return the resulting value.
     * i.e. if num = 1234
     *  the function will return 4321
     *****/
    public double reverseNumber(int num){
        
 v2_branch2
        double newNumber = 0;
        
        while( num != 0 ) {
            double temp = num % 10;
            newNumber = newNumber * 10 + temp;
            num /= 10;

        double newNumber = 1;
        reverseNum = newNumber;
        
        for(int i = 1; i <= num; ++i){
            newNumber = newNumber * i;
 main
        }
        
        return newNumber;
    }
    
}
