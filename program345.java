/*Display Pattern 
Input: 78956
OutPut: 
7 8 9 5 6
7 8 9 5 
7 8 9 
7 8 
7 

*/
import java.lang.*;
import java.util.*;

class program345
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number");
        //int no = sobj.nextInt();

        //String str = Integer.toString(no);
        char Arr[] = (Integer.toString(sobj.nextInt())).toCharArray();
       
        for(int i=Arr.length-1;i >=0;i--)
        {
            for(int j=0; j <= i;j++)
            {
                System.out.print(Arr[j]+" ");
            }
            System.out.println();
        }
    }
}
