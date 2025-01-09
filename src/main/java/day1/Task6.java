package day1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for (int i=1;i<10;i++){
            int result = i*k;
            System.out.printf("%d X %d = %d\n",i,k,result);
        }
    }
}
