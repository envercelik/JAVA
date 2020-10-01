package B05InterfaceAndAbstractClass.P4Examples.Example1;

public class Main {
    public static void main(String[] args) {

        //BaseDatabaseManager databaseManager = new OracleDatabaseManager();
        BaseDatabaseManager databaseManager = new MysqlDatabaseManager();
        databaseManager.getData();


    }
}
