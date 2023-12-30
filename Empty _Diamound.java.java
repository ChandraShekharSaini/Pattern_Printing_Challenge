import java.util.*;
public class Q19{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size:");
        int n=sc.nextInt();

        int row=1;
        int star= n;
        int space=0;

        while(row<=2*n-1){

            //star
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }

            //space
            int j=1;
            while(j<space){
                System.out.print("  ");
                j++;
            }

             //star
            int k=1;
            if(row==1 || row==2*n-1)
            {
                k=2;
            }
            while(k<=star){
                System.out.print("* ");
                k++;
            }

            //mirror
            if(row<n){
            space+=2;
            star--;
            }else{
            space-=2;
            star++;
            }

            //next row            
            row++;
            System.out.println();
        }
    }
}