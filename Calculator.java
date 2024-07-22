import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        int num ;
        do{
            System.out.println("welcome to the Calculator");
            System.out.println("choose 1 for sum \n 2 for subtract \n 3 for multiply \n 4 for division ");
            num = sc.nextInt();
            if(num==1)
            {
                System.out.println("Give two num");
                int n= sc.nextInt() , m=sc.nextInt();
                System.out.println("sum = "+ (n+m));
            }
               else if(num==2)
            {
                System.out.println("Give two num");
                int n= sc.nextInt() , m=sc.nextInt();
                System.out.println("sub = "+ (n-m));
            }
           else if(num==3)
            {
                System.out.println("Give two num");
                int n= sc.nextInt() , m=sc.nextInt();
                System.out.println("multi = "+ (n*m));
            }
           else if(num==4)
            {
                System.out.println("Give two num");
                int n= sc.nextInt() , m=sc.nextInt();
                System.out.println("div = "+ (n/m));
            }
           else {
                System.out.println(" wrong number ");
                num= sc.nextInt();
            }

        }
        while (num == 1);
    }
}
