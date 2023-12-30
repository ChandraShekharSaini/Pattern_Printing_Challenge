import java.util.*;
public class Q18 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter size:");
        int n=sc.nextInt();

        int row = 1;
        int space = n/2;
        int star =1;

        while(row<=n){

            //Space
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }

            //Star
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }

            //mirror
            if(row<n/2){
            space--;
            star+=2;
            }else{
                space++;
                star-=2;
            }

            
            row++;
            System.out.println();

        }
    }
}
