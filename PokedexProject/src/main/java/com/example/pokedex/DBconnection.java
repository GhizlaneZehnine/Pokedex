package com.example.pokedex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection implements DBconnectionInterface {
    private String url;

    public DBconnection(String url) {
        this.url = "jdbc:sqlite:"+url;
    }

    /**
     * Establish the connection to DB
     */
    public Connection establish() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(this.url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return  conn;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
