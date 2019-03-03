public class MyArraySizeException extends RuntimeException {

    int row, col;

    public MyArraySizeException(int row, int col){
        super("Проверьте размер массива! Он должен быть 4х4!");
        this.row = row;
        this.col = col;
    }
}
