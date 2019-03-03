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
        newArray(arr, row, col);
    }

    static void newArray (String[][] arr, int row, int col) {
        if (row != 4 || col != 4) throw new MyArraySizeException(row, col);
    }
}
