import java.util.Scanner;

public class SumColum {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner scanner = new Scanner(System.in);
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        int x;
        int sum = 0;
        System.out.print("nhap cot can tinh tong: ");
        x = scanner.nextInt();
        if (x>array[0].length){
            System.out.println("error");
        } else {
            for (int[] ints : array) {
                for (int j = 0; j < ints.length; j++) {
                    if (x == j) {
                        sum += ints[x];
                    }
                }
            }
            System.out.println("tong cac so trong cot " + x + " la : " + sum);
        }
    }
}
