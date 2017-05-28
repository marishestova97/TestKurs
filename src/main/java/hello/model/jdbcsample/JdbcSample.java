//package hello.model.jdbcsample;
//import java.sql.*;
///**
// * Created by USER on 17.05.2017.
// */
//public class JdbcSample {
//    static final String JDBC_DRIVER = "org.postgresql.Driver";
//    static final String DB_URL = "jdbc:postgresql://localhost:5432/BD";
//
//    //  Database credentials
//    static final String USER = "postgres";
//    static final String PASS = "gorumu06";
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        Connection conn = null;
//        Statement stmt = null;
//
//        try {
//            //STEP 2: Register JDBC driver
//            Class.forName(JDBC_DRIVER);
//
//            //STEP 3: Open a connection
//            System.out.println("Connecting to database...");
//            conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            //STEP 4: Execute a query
//            System.out.println("Creating statement...");
//            stmt = conn.createStatement();
//            String sql  = "select * from sklad";
//            ResultSet rs = stmt.executeQuery(sql);
//
//            //STEP 5: Extract data from result set
//            while (rs.next()) {
//                System.out.print(rs.getInt("n_igrushki")+ ",");
//                System.out.println(rs.getInt("n_sklada"));
////                //Retrieve by column name
////                int id = rs.getInt("id");
////                int age = rs.getInt("age");
////                String first = rs.getString("first");
////                String last = rs.getString("last");
////
////                //Display values
////                System.out.print("ID: " + id);
////                System.out.print(", Age: " + age);
////                System.out.print(", First: " + first);
////                System.out.println(", Last: " + last);
//            }
//            //STEP 6: Clean-up environment
//            rs.close();
//            stmt.close();
//            conn.close();
//        } catch (SQLException se) {
//            //Handle errors for JDBC
//            se.printStackTrace();
//        } catch (Exception e) {
//            //Handle errors for Class.forName
//            e.printStackTrace();
//        } finally {
//            //finally block used to close resources
//            try {
//                if (stmt != null) {
//                    stmt.close();
//                }
//            } catch (SQLException se2) {
//            }// nothing we can do
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException se) {
//                se.printStackTrace();
//            }//end finally try
//        }//end try
//        System.out.println("Goodbye!");
//    }
//
//}
//}
