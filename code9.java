import java.util.Scanner;
public class code9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0]; 
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
        }
        System.out.println("The largest element in the array is: " + max); 
        sc.close();
    }
}