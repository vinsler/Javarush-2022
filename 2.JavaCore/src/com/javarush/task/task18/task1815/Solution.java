package com.javarush.task.task18.task1815;

import java.util.List;
import java.util.Locale;

/* 
Таблица
*/

public class Solution {

    public class TableInterfaceWrapper implements TableInterface {
        private TableInterface copyTableInterface;

        public TableInterfaceWrapper(TableInterface localTableInterface) {
            this.copyTableInterface = localTableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            copyTableInterface.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return copyTableInterface.getHeaderText().toUpperCase(Locale.ROOT);
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            copyTableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);
        String getHeaderText();
        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}