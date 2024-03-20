import java.util.Arrays;
import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < size; i++){
            System.out.println(a[i]);
        }
        System.out.println(a[0]);
        System.out.println(a[size-1]);
    }
}
