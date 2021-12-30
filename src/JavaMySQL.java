public class JavaMySQL implements DBConnect{
    @Override
    public void getConnection(String url, String user, String pwd) {
        System.out.println("MySQL DataBase connection was successful.");
    }
}
