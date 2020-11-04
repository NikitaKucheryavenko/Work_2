import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Сколько столбцов будет в матрице? ");
        int a = s.nextInt();
        System.out.println("Сколько строк будет в матрице? ");
        int b = s.nextInt();
        System.out.println("Значения матрицы(через Enter): ");
        int number;
        int [][]matrix = new int[a][b];
        int [][]output_matrix = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("Число для умножения: ");
        number = s.nextInt();
        System.out.println("Матрица умноженная на число равна: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" | " + matrix[i][j] + " | ");
            }
            System.out.println(" ");
        }
        System.out.println(" * " + number);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                output_matrix[i][j] = matrix[i][j] * number;
                System.out.print(" | " + output_matrix[i][j] + " | ");
            }
            System.out.println(" ");
        }
    }
}