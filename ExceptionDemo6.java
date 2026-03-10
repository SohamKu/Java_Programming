import java.util.*;

class ExceptionDemo6
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0;
        int iAns = 0;

        System.out.println("Enter the First Number :");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the Second Number :");
        iNo2 = sobj.nextInt();
        try
        {
            System.out.println("Inside Try Block.");   
            iAns = iNo1 / iNo2;                   
        }
        //Error Due to Catch Sequence
         catch(Exception eobj)
        {
            System.out.println("Inside Generic Catch.");    // Generic catch
        }
        catch (ArithmeticException aobj)               // Specific Catch
        {
            System.out.println("Inside Catch Block.");
            System.out.println(aobj);
        }
       

        System.out.println("The Division is : "+iAns);

    }   
}