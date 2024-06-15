package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDao {
    public ArrayList<ItemDTO> loadAllItem() throws SQLException, ClassNotFoundException;

    public void deleteItem(String code) throws SQLException, ClassNotFoundException;

    public void SaveItem(ItemDTO Idto) throws SQLException, ClassNotFoundException;

    public void updateItem(ItemDTO I) throws SQLException, ClassNotFoundException;

    public boolean existItem (String code) throws SQLException, ClassNotFoundException;

    public String newId() throws SQLException, ClassNotFoundException;

    public ItemDTO getdetail(String newItemCode) throws SQLException, ClassNotFoundException;
}
