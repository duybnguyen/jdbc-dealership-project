package com.yearup.dealership.db;

import com.yearup.dealership.models.LeaseContract;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LeaseDao {
    private DataSource dataSource;

    public LeaseDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void addLeaseContract(LeaseContract leaseContract) {
        String sql = "INSERT INTO lease_contracts (vin, lease_start, lease_end, monthly_payment) VALUES (?, ?, ?, ?)";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setString(1, leaseContract.getVin());
            statement.setDate(2, Date.valueOf(leaseContract.getLeaseStart()));
            statement.setDate(3, Date.valueOf(leaseContract.getLeaseEnd()));
            statement.setDouble(4, leaseContract.getMonthlyPayment());

            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error adding lease contract");
            e.printStackTrace();
        }
    }

}
