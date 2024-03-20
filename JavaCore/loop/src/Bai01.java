import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int a = sc.nextInt();
        int dem = 0;
        for (int i = 2; i <= a - 1; i++){
            if(a%i == 0){
                dem++;
            }
        }

        if (dem != 0) {
            System.out.println("This is not prime number");
        }else {
            System.out.println("This is prime number");
        }
    }
}
