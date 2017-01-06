/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threefloatcompare;

/**
 *
 * @author patrickbenitez
 */
public class ThreeFloatCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        threeFloatCompare test = new threeFloatCompare();
        test.loadValues(3,6,10);
        test.returnLargest();
    }
    
    private static class threeFloatCompare {
        
        private threeFloatCompare () {
            a = 0;
            b = 0;
            c= 0;
        }
        
        private void loadValues (float x, float y, float z) {
            a = x;
            b = y; 
            c = z;
        }
        
        private void returnLargest() {
            
            if (a != b && a != c && b !=c) {
                if (a > b) {
                    if ( a > c) {
                        max = a;
                    }
                    else if (c > a && c > b) {
                        max = c;
                    }
                }
                else if (a < b) {
                    if (a < c && c < b) {
                        max = b;
                    }
                    else {
                        max = c;
                    }
                }
                else if (c > a) {
                    if (c > b) {
                        max = c;
                    }
                    else if (c < b && b > a){
                        max = b;
                    }
                }
            }
            
            else {
                System.out.println("There are two or more duplicate float values.");
                System.exit(0);
            }
            
            System.out.println("Max value is: " + max);
        }
        
        float a, b, c, max;
    }
}
