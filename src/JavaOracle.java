public class JavaOracle implements DBConnect {
    @Override
    public void getConnection(String url, String user, String pwd) {
        System.out.println("Oracle DataBase connection was successful.");
    }
}
