import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDao {

    public static ArrayList<Person> listAllPerson() {
        ArrayList<Person> listPerson = new ArrayList<Person>();

        String sql = "select * from personinfo.info";

        Connection connection = DbConnector.getDbConnection();
        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id_person");
                String first = resultSet.getString("first");
                String second = resultSet.getString("second");
                String third = resultSet.getString("third");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");


                Person person = new Person(id, first, second, third, email, phone);
                listPerson.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listPerson;
    }

    public static void registerPerson() {
        String sql = "insert into info(first,second,third,email,phone) " +
                "values('example','example','example','example','example') ";

        Connection connection = DbConnector.getDbConnection();
        Statement statement;

        try {
            statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
