package classes0515;

public class ConnectionData {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB = "catalog4";
    public static final String URL = "jdbc:mysql://localhost:3306/" + DB;
    public static final String USER = "sinol";
    public static final String PASSWORD = "sinol1978IT";

    //for HA
  /*  public static final String DRIVER = "org.h2.Driver";
    public static final String DB = "test";
    public static final String URL = "jdbc:h2:tcp://localhost/~/" + DB;
    public static final String USER = "sa";
    public static final String PASSWORD = "";*/
}
