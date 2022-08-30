import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnect {
    public static void main(String[] args) {
        Connection connect =null;   //java'nın içinde sql sınıfı var.
        String url="jdbc:postgresql://localhost/Universite?user=postgres&password=esen";
        //bu baştaki yapı sabit sadece bağlanacağın db ismini değiş /Bağlanacağın db(bizim universite) sonra
        // devam eden yapıdaki gibi user ve password bilgilerini gir
        try{
            connect = DriverManager.getConnection(url);                                  //buna bağlanabilmemiz için başta bir url oluşturmamızı istiyor.

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
