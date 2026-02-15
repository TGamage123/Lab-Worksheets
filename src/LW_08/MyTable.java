package LW_08;

import javax.swing.*;
import java.awt.*;

public class MyTable extends JTable {
    private static final String[][] data = {
            {"Thilini", "Female", "23"},
            {"Sakuni", "Female", "22"},
            {"Dilki", "Female", "23"},
            {"Chanika", "Female", "22"},
            {"Kasuni", "Female", "23"},
            {"Shalini", "Female", "22"},
            {"Thulani", "Female", "23"},
            {"Dasuni", "Female", "22"},
    };
    private static final String[] columnNames = {"Name", "Gender", "Age"};


    public MyTable() {
        super(data, columnNames);
        setSize(300, getPreferredSize().height);
    }
}