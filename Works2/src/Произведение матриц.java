import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Сколько столбцов будет в первой матрице? ");
        int a = s.nextInt();
        System.out.println("Сколько строк будет в первой матрице? ");
        int b = s.nextInt();
        System.out.println("Сколько столбцов будет во второй матрице? ");
        int c = s.nextInt();
        System.out.println("Сколько строк будет во второй матрице? ");
        int d = s.nextInt();

        if (b == c) {
            int[][] first_matrix = new int[a][b];
            int[][] second_matrix = new int[c][d];
            int[][] multiple_matrix = new int[a][d];
            System.out.println("Значения первой матрицы(через Enter): ");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    first_matrix[i][j] = s.nextInt();
                }
            }
            System.out.println("Значения второй матрицы(через Enter): ");
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < d; j++) {
                    second_matrix[i][j] = s.nextInt();
                }
            }
            int sum = 0;
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < d; j++) {
                    for (int k = 0; k < c; k++)
                        sum = sum + first_matrix[i][k] * second_matrix[k][j];
                    multiple_matrix[i][j] = sum;
                    sum = 0;
                }
            }
            System.out.println("Произведение двух матриц: ");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < d; j++) {
                    System.out.print(multiple_matrix[i][j] + " ");
                }
                System.out.println(" ");
            }
        } else
            System.out.println("Умножение невозможно");
    }
}
