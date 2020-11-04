import java.util.Scanner;
public class Fifth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество столбцов матрицы: ");
        int a = s.nextInt();
        System.out.println("Введите количество строк для матрицы: ");
        int b = s.nextInt();
        int[][] st_matrix = new int[a][b];
        int[][] out_matrix = new int[a][b];
        System.out.println("Введите значения матрциы: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                st_matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("Введите степень для возведения: ");
        int st = s.nextInt();
        int sum = 0;
        for (int y = 0; y < st - 1; y++) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    for (int k = 0; k < b; k++)
                        sum = sum + st_matrix[i][k] * st_matrix[k][j];
                    out_matrix[i][j] = sum;
                    sum = 0;

                }
            }
        }
        System.out.println("Матрица в степени равна: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(out_matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
