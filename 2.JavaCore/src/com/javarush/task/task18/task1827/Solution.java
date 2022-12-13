package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine(); // "c:\\1.txt";//
        reader.close();
        try {
            if (args[0].equals("-c")) {
                reader = new BufferedReader(new FileReader(filename));
                String str, maxStr = "";
                int maxId = 0;
                while (null != (str = reader.readLine())) {
                    for (int i = 1; i < str.length(); i++) {
                        try {
                            Integer.parseInt(str.substring(0, i));
                        } catch (Exception e) {
                            int id = Integer.parseInt(str.substring(0, i - 1));
                            if (id > maxId) {
                                maxId = id + 1;
                            }
                            break;
                        }
                    }
                }
                reader.close();
                maxStr = String.valueOf(maxId);
                while (maxStr.length() < 8) {
                    maxStr = maxStr + " ";
                }
                String productName, price, quantity;
                productName = args[1];
                if (productName.length() > 30) {
                    productName = productName.substring(0, 30);
                }
                if (productName.length() < 30) {
                    productName = String.format("%-" + 30 + "s", productName);
                }
                price = args[2];
                if (price.length() > 8) {
                    price = price.substring(0, 8);
                }
                if (price.length() < 8) {
                    price = String.format("%-" + 8 + "s", price);
                }
                quantity = args[3];
                if (quantity.length() > 4) {
                    quantity = quantity.substring(0, 4);
                }
                if (quantity.length() < 4) {
                    quantity = String.format("%-" + 4 + "s", quantity);
                }
                str = maxStr + productName + price + quantity;
                FileWriter writer = new FileWriter(filename, true);
                writer.append("\n");
                writer.append(str);
                writer.flush();
                writer.close();
            }
        }catch (ArrayIndexOutOfBoundsException ae) {
            //System.err.println("Нет аргументов.");
        }
    }
}

