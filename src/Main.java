import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        System.out.println("Введите количество строк массива:");
        row = scanner.nextInt();
        System.out.println("Введите количество столбцов массива:");
        col = scanner.nextInt();
        String[][] arr = new String[row][col];
        newArray(arr, scanner, row, col);
    }

    static void newArray (String[][] arr, Scanner scanner, int row, int col) {
        int sum = 0;
        int[][] arrInt = new int[row][col];
        if (row != 4 || col != 4) throw new MyArraySizeException(row, col);
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.println("Введите ячейку " + i + ":" + j);
                arr[i][j] = scanner.next();
                try{
                    arrInt[i][j] = Integer.parseInt(arr[i][j]);
                    sum+=arrInt[i][j];
                } catch (Exception e) {
                    throw new MyArrayDataException(i, j);
                } finally {
                    System.out.println("Сумма ячеек = " + sum);
                }
            }
        }
    }
}
