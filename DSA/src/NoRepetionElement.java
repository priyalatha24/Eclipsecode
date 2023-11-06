import java.util.Scanner;

public class NoRepetionElement {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, flag = 0, count = 0;
        n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println("The elements are: ");

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {  // You had a mistake in this loop condition
                if (arr[i] == arr[j] && i != j) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.print(arr[i] + " ");
                flag = 1;
            }
        }

        if (flag == 0)
            System.out.println("All elements are repeated.");

        s.close();
    }
}

