import java.util.Scanner;
public class Matrix1 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Сколько столбцов будет в первой матрице? ");
        a = s.nextInt();
        System.out.println("Сколько строк будет в первой матрице? ");
        b = s.nextInt();
        System.out.println("Сколько столбцов будет во второй матрице? ");
        c = s.nextInt();
        System.out.println("Сколько строк будет во второй матрице? ");
        d = s.nextInt();
        if (a == c && b == d) {
            int[][] first_matrix = new int[a][b];
            int[][] second_matrix = new int[c][d];
            int[][] output_matrix = new int[a][d];
            System.out.println("Значения первой матрицы(через Enter): ");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    first_matrix[i][j] = s.nextInt();
                }
            }
            System.out.println("Значения второй матрицы(через Enter): ");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    second_matrix[i][j] = s.nextInt();
                }
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    output_matrix[i][j] = first_matrix[i][j] + second_matrix[i][j];
                }
            }
            System.out.println("Первая матрица: ");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {

                    System.out.print(" | " + first_matrix[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.println("Вторая матрица: ");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {

                    System.out.print(" | " + second_matrix[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.println("Сумма матриц равна: ");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {

                    System.out.print(" | " + output_matrix[i][j] + " | ");
                }
                System.out.println();
            }
        } else
            System.out.println("Сложение невозможно!");
    }
}
