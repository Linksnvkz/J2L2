public class MyArrayDataException extends RuntimeException {
    int row, col;

    public MyArrayDataException(int row, int col){
        super("Невозможно преобразовать в int в ячейке " + row + ":" + col);
        this.row = row;
        this.col = col;
    }
}
