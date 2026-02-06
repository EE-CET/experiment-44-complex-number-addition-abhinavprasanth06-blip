// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class Complex {
    int imaginary1;
    int real1;
     int imaginary2;
    int real2;
  Complex(int real1,int imaginary1,int real2,int imaginary2){
      this.real1 = real1;
      this.imaginary1 = imaginary1;
      this.imaginary2 = imaginary2;
      this.real2 =  real2;
  }
  void add(){
      int real = real1+ real2;
      int img = imaginary1 +imaginary2;
      System.out.println(real +"+"+img+"i");
  }
}
public class ComplexAddition{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int real1 = sc.nextInt();
            int img1 = sc.nextInt();
            int real2 = sc.nextInt();
            int img2 = sc.nextInt();
            Complex c1 = new Complex(real1,img1,real2,img2);
           //Complex c2 = new Complex(real2,img2);
           c1.add();
}
}
