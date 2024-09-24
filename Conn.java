import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public  class Conn{

     Connection connection;
     Statement statement;

     Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","Shasvat@27");
            statement=connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

