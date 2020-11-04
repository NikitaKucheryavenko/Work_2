import java.util.Scanner;
public class Fourth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество столбцов матрицы: ");
        int a = s.nextInt();
        System.out.println("Введите количество строк для матрицы: ");
        int b = s.nextInt();
        int [][]matrix = new int[a][b];
        int [][]trans_matrix = new int[Math.max(a, b)][Math.max(a, b)];
        System.out.println("Введите значения матрциы: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("изначальная матрица :");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Транспонированная матрица:");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                trans_matrix[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(trans_matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
