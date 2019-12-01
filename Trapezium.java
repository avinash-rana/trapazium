import java.util.Scanner;

public class Trapezium{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of row for trapezium");
        n=sc.nextInt();
        int sum =0;
        
        int rterm= n*n+1;
        for (int i=1 ; i<=n;i++){
            for(int s = 1;s<i;s++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                sum += 1;
                System.out.print(sum);
                System.out.print(" ");
                
            }
            for(int k=i;k<=n;k++){
                System.out.print(rterm);
                System.out.print(" ");
                rterm += 1;
            }
            if(n%2==0){
                rterm = rterm-(n+1);
            }
            else{
                rterm = rterm - n;
            }
                System.out.println();
        }sc.close();

    }
} 