package OOPS1;
import java.util.Scanner;
public class complexnumber {
    int real;
    int imaginary;
    int a;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        complexnumber c1 = new complexnumber(real1, imaginary1);
        complexnumber c2 = new complexnumber(real2, imaginary2);

        int choice = s.nextInt();

        if(choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        }
        else if(choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        }
        else {
            return;
        }
    }

    public complexnumber(int real1,int imaginary1){
        this.real=real1;
        this.imaginary=imaginary1;

    }
    public void plus(complexnumber c2)
    {
        this.real=this.real+c2.real;
        this.imaginary=this.imaginary+c2.imaginary;
    }
    public void multiply(complexnumber c2)
    {
        this.real=this.real*c2.real-this.imaginary*c2.imaginary;
        this.imaginary=this.real*c2.imaginary-c2.real*this.imaginary;
    }
    public void print()
    {
        System.out.print(real+"+1"+"i"+imaginary);
    }


}
