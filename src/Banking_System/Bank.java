package Banking_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Bank {
	public static void createAccount(String type, String name, double balance, double extra) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO accounts (type, name, balance, extra) VALUES (?, ?, ?, ?)") ) {
            stmt.setString(1, type);
            stmt.setString(2, name);
            stmt.setDouble(3, balance);
            stmt.setDouble(4, extra);
            stmt.executeUpdate();
            System.out.println("Account Created Successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void checkBalance(int accountNumber) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT balance FROM accounts WHERE id = ?")) {
            stmt.setInt(1, accountNumber);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("Balance: " + rs.getDouble("balance"));
            } else {
                System.out.println("Account not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
