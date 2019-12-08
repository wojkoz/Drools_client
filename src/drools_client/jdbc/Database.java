package drools_client.jdbc;

import drools_client.model.Client;
import drools_client.model.Employee;
import drools_client.model.Results;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



//insert into laboratorium.pacjent VALUES (DEFAULT,'Adam','Nowacki','20-05-1999','123456789','97042949384');
//insert into laboratorium.pracownik VALUES (DEFAULT,'Adam','Nowacki','20-05-1999','recepcjonista');
//insert into laboratorium.wyniki VALUES (DEFAULT,'',1,1)
public class Database {
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://195.150.230.210:5434/2019_koziol_wojciech";
    static final String USER = "2019_koziol_wojciech";
    static final String PASS = "wojtek9";
    
    
    
    public static Client getClient(String pesel) {

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Client client = new Client();        

        try {
            Class.forName(JDBC_DRIVER);

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

            String sql = "SELECT * from laboratorium.pacjent WHERE pesel like ?";
            pstmt = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.FETCH_REVERSE);
            pstmt.clearParameters();
            pstmt.setString(1, pesel);

            rs = pstmt.executeQuery();
            rs.beforeFirst();
            while (rs.next()) {
                client.setId(rs.getInt("id_pacjenta"));
                client.setData_urodzenia(rs.getDate("data_urodzenia"));
                client.setImie(rs.getString("imie"));
                client.setNazwisko(rs.getString("nazwisko"));
                client.setNumer_telefonu(rs.getString("nr_telefonu"));
                client.setPesel(pesel);
            } 
            
        } catch (SQLException e) {
            System.err.println("Error SQL. Exception: " + e);
        } catch (Exception e) {
            System.err.println("Error. Exception: " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Error. Closing rs & stmt & connection. Exception: " + e);
            }
        }
        return client;
    }
    
    public static void registerClient(Client client){
        Connection connection = null;
       PreparedStatement pstmt = null;
        try{

           Class.forName(JDBC_DRIVER);

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

           pstmt = connection.prepareStatement("insert into laboratorium.pacjent VALUES (DEFAULT,?,?,?,?,?)");
           pstmt.setString(1, client.getImie());
           pstmt.setString(2, client.getNazwisko());
           pstmt.setDate(3, client.getData_urodzenia());
           pstmt.setString(4, client.getNumer_telefonu());
           pstmt.setString(5, client.getPesel());

           pstmt.executeUpdate();
           

        }catch(SQLException se){
           //Handle errors for JDBC
           se.printStackTrace();
        }catch(Exception e){
           //Handle errors for Class.forName
           e.printStackTrace();
        }finally{
           //finally block used to close resources
           try{
              if(pstmt!=null)
                 connection.close();
           }catch(SQLException se){
           }// do nothing
           try{
              if(connection!=null)
                 connection.close();
           }catch(SQLException se){
              se.printStackTrace();
           }//end finally try
        }//end try
    }
    
    
    public static Employee getEmployee(int id) {

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Employee employee = new Employee();        

        try {
            Class.forName(JDBC_DRIVER);

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

            String sql = "SELECT * from laboratorium.pracownik WHERE id = ?";
            pstmt = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.FETCH_REVERSE);
            pstmt.clearParameters();
            pstmt.setInt(1, id);

            rs = pstmt.executeQuery();
            rs.beforeFirst();
            while (rs.next()) {
                employee.setId(rs.getInt("id_pracownika"));
                employee.setData_urodzenia(rs.getDate("data_urodzenia"));
                employee.setImie(rs.getString("imie"));
                employee.setNazwisko(rs.getString("nazwisko"));
                employee.setStanowisko(rs.getString("stanowisko"));
            } 
            
        } catch (SQLException e) {
            System.err.println("Error SQL. Exception: " + e);
        } catch (Exception e) {
            System.err.println("Error. Exception: " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Error. Closing rs & stmt & connection. Exception: " + e);
            }
        }
        return employee;
    }
    
    public static void registerEmplyee(Employee emplyee){
        Connection connection = null;
       PreparedStatement pstmt = null;
        try{

           Class.forName(JDBC_DRIVER);

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

           pstmt = connection.prepareStatement("insert into laboratorium.pracownik VALUES (DEFAULT,?,?,?,?);");
           pstmt.setString(1, emplyee.getImie());
           pstmt.setString(2, emplyee.getNazwisko());
           pstmt.setDate(3, emplyee.getData_urodzenia());
           pstmt.setString(5, emplyee.getStanowisko());

           pstmt.executeUpdate();
           

        }catch(SQLException se){
           //Handle errors for JDBC
           se.printStackTrace();
        }catch(Exception e){
           //Handle errors for Class.forName
           e.printStackTrace();
        }finally{
           //finally block used to close resources
           try{
              if(pstmt!=null)
                 connection.close();
           }catch(SQLException se){
           }// do nothing
           try{
              if(connection!=null)
                 connection.close();
           }catch(SQLException se){
              se.printStackTrace();
           }//end finally try
        }//end try
    }
    
    public static void registerResults(Results results, Client client, Employee employee){
        Connection connection = null;
       PreparedStatement pstmt = null;
        try{

           Class.forName(JDBC_DRIVER);

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

           pstmt = connection.prepareStatement("insert into laboratorium.wyniki VALUES (DEFAULT,?,?,?)");
           pstmt.setString(1, results.toString());
           pstmt.setInt(2, employee.getId());
           pstmt.setInt(3, client.getId());


           pstmt.executeUpdate();
           

        }catch(SQLException se){
           //Handle errors for JDBC
           se.printStackTrace();
        }catch(Exception e){
           //Handle errors for Class.forName
           e.printStackTrace();
        }finally{
           //finally block used to close resources
           try{
              if(pstmt!=null)
                 connection.close();
           }catch(SQLException se){
           }// do nothing
           try{
              if(connection!=null)
                 connection.close();
           }catch(SQLException se){
              se.printStackTrace();
           }//end finally try
        }//end try
    }
    
}
