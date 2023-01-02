

public class MyPolynomial {
    double[] coeffs;
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree() {
        return coeffs.length-1;
    }
    public String toString() {
        String string = "";
        for(int i=getDegree();i>=0;i--) {
            if(coeffs[i]==0) continue;
            if(i != getDegree())
                string += (coeffs[i] > 0 ? " + ":" ");
            string += coeffs[i];
            if(i==1) string += "x";
            else if(i>=2) string += "x^" + i;
        }
        return string;
    }
    public double evaluate(double x) {
        double sum = 0;
        for(int i = 0; i < coeffs.length; i++) {
            sum += Math.pow((coeffs[i]*x), i);
        }
        return sum;
    }
    public MyPolynomial add(MyPolynomial right) {
        int size =  coeffs.length > right.getDegree()+1 ? coeffs.length : right.getDegree()+1;
        double[] sum = new double[size];
        for(int i=0;i<sum.length;i++) {
            double add = 0;
            if(i <= this.getDegree()) add += coeffs[i];
            if(i <= right.getDegree()) add += right.coeffs[i];
            sum[i] = add;
        }
        return new MyPolynomial(sum);
    }
    public MyPolynomial multiply(MyPolynomial right) {
        int size = getDegree() + right.getDegree() + 1;
        double[] sum = new double[size];
        for(int i = 0; i < coeffs.length; i++) {
            for(int j = 0; j < right.coeffs.length; j++) {
                double num = coeffs[i] * right.coeffs[j];
                sum[i+j] += num;
            }
        }
        return new MyPolynomial(sum);
    }
}