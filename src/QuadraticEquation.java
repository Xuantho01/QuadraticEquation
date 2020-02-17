public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return b*b - 4*a*c;
    }
    public void giaiPT(){
        double r1,r2;
        if (getDiscriminant() < 0){
            System.out.println("Phuong trinh vo nghiem");
        }else if (getDiscriminant() == 0){
            r1 = r2 = -b/(2*a);
            System.out.println("phuong trinh co 1 nghiem: r1 = r1 = "+r1);
        }else{
            r1 = (-b + Math.sqrt(getDiscriminant()))/(2*a);
            r2 = (-b - Math.sqrt(getDiscriminant()))/(2*a);
            System.out.println("pt co hai nghiem: r1 = "+ r1 +"\n r2 = "+r2);
        }
    }
}
