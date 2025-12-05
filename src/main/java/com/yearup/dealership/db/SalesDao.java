package com.yearup.dealership.db;

import com.yearup.dealership.models.SalesContract;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalesDao {
    private DataSource dataSource;

    public SalesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void addSalesContract(SalesContract salesContract) {
        String sql = "INSERT INTO sales_contracts (vin, sale_date, price) VALUES (?, ?, ?)";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setString(1, salesContract.getVin());
            statement.setDate(2, Date.valueOf(salesContract.getSaleDate()));
            statement.setDouble(3, salesContract.getPrice());

            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error adding sales contract");
            e.printStackTrace();
        }
    }
}
