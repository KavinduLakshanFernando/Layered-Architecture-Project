package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDetailsImpl implements OrderDetailsIDao{
  /*  public boolean saveorderDetail() throws SQLException, ClassNotFoundException {
        PreparedStatement stm = connection.prepareStatement("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)");

        for (OrderDetailDTO detail : orderDetails) {
            stm.setString(1, orderId);
            stm.setString(2, detail.getItemCode());
            stm.setBigDecimal(3, detail.getUnitPrice());
            stm.setInt(4, detail.getQty());

            if (stm.executeUpdate() != 1) {
                connection.rollback();
                connection.setAutoCommit(true);
                return false;
            }
            ItemDaoImpl itemDAO = new ItemDaoImpl();
            boolean isitemupdate = itemDAO.updatedata(connection, orderDetails);
            if (!isitemupdate) {
                return false;
            }
        }
        return true;
    }*/
}
