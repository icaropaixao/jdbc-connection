package application;

import db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {

        // exemple
        Connection con = DB.getConnection();
        DB.closeConnection();
    }
}
