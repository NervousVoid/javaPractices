package Math;

public class MathFunc implements MathCalculable{
    public double power(double a, double n){
        return Math.pow(a, n);
    }

    public double complexModule(double a, double b){
        return power(a*a + b*b, 0.5);
    }
}
