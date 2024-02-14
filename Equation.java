/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author penelopecrux
 */
public class Equation {
    private double a;
    private double b;
    private double c;
    
    public Equation() {
        a = b= c = 0;
        
     }
    
    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        
    }
    
    public double getRoot1() {
        try {
            double root = -b + Math.sqrt(b*b-4*a*c);
            root /= 2*a;
            return root;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return Double.NaN;
    }
    
    public double getRoot2() {
        try {
            double root = -b - Math.sqrt(b*b-4*a*c);
            root /= 2*a;
            return root;
        }
        catch(Exception e) {
            e.printStackTrace();
            
        }
        return Double.NaN;
    }
    
    public boolean isValid() {
       if( (b*b-4*a*c) < 0 ) return false;
       if (a == 0) return false;
       return true;
    }
}
