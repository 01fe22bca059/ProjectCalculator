import java.util.Scanner;
class calculator
{
    float addition( float n1, float n2)
    {
        return n1 +n2;
    }
    float subtraction(float n1, float n2)
    {
        return n1-n2;
    }
    float multiplication(float n1, float n2)
    {
        return n1*n2;
    }
    float division(float n1,float n2)
    {
          return n1/n2;
    }


public static void main(String args[])
{
calculator c=new calculator();
float n1=12.6;
float n2=7.9;
System.out.println("Addition:" + c.addition(n1,n2));
System.out.println("Subtraction:" + c.subtraction(n1,n2));
System.out.println("Multiplication:" + c.multiplication(n1,n2));
System.out.println("Division:" + c.division(n1,n2));
}

}
