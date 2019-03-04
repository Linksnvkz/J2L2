public class MyAutoCloseAble implements AutoCloseable {

    @Override
    public void close(){
        try {
            throw new Exception("Ошибка при закрытии");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
