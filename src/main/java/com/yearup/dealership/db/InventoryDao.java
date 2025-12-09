package com.yearup.dealership.db;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InventoryDao {
    private DataSource dataSource;

    public InventoryDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void addVehicleToInventory(String vin, int dealershipId) {
        String sql = "INSERT INTO inventory (vin, dealership_id) VALUES (?, ?)";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setString(1, vin);
            statement.setInt(2, dealershipId);

            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error adding vehicle to inventory");
            e.printStackTrace();
        }
    }

    public void removeVehicleFromInventory(String vin) {
        String sql = "DELETE FROM inventory WHERE vin = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setString(1, vin);

            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error removing vehicle from inventory");
            e.printStackTrace();
        }
    }
}
