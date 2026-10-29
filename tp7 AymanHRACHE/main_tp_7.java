class Database {
    private static Database instance;
    private String name;

    private Database(String name) {
        this.name = name;
    }

    public static Database getInstance(String name) {
        if (instance == null) {
            instance = new Database(name);
        }
        return instance;
    }
}

public class main_tp_7 {
    public static void main(String[] args) {
        Database db1 = Database.getInstance("Users");
        Database db2 = Database.getInstance("clients");
    
    if (Database.getInstance("Users") == Database.getInstance("clients")) {
        System.out.println("Same instance");
    } else {
        System.out.println("Different instances");
    }
    }
}