package B16Databases.P1Database.P01Database;

import java.sql.*;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) throws SQLException {

        selectFields();
        insertField();
        updateField();
        deleteField();

    }


    public static void selectFields() throws SQLException {

        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;

        try {

            connection = helper.getConnection();
            System.out.println("Connection is successfully");

            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from country");

            ArrayList<Country> countries = new ArrayList<>();


            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size());
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }

    }

    public static void insertField() throws SQLException {

        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;


        try {

            connection = helper.getConnection();
            System.out.println("Connection is successfully");

            String sql = "insert into city (Name,CountryCode,District ,Population) values (?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Deneme");
            statement.setString(2,"TUR");
            statement.setString(3,"ddd");
            statement.setInt(4,5000);
            statement.executeUpdate();
            System.out.println("field added");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }

    }

    public static void updateField() throws SQLException {

        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;


        try {

            connection = helper.getConnection();
            System.out.println("Connection is successfully");

            String sql = "update city set population=2200000 where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,1000);
            statement.executeUpdate();
            System.out.println("field updated");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }

    }

    public static void deleteField() throws SQLException {

        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;


        try {

            connection = helper.getConnection();
            System.out.println("Connection is successfully");

            String sql = "delete from city where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,1000);
            statement.executeUpdate();
            System.out.println("field deleted");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }

    }

}

/*
Java uygulaması ile veritabanını bağlamak için jdbc paketinden faydalanabiliriz.

Bir çok veri tabanı olduğundan jdbc ile veritabanı arasında veritabanı türüne göre driver bulunur.

Mysql server : mysql veritabanı motorudur.










 */