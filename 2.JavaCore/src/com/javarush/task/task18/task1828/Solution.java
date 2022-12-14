package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    static class Item {
        String idLoc, productNameLoc, priceLoc, quantityLoc;

        public void setProductNameLoc(String productNameLoc) {
            this.productNameLoc = productNameLoc;
        }

        public String getIdLoc() {
            return idLoc;
        }

        public void setPriceLoc(String priceLoc) {
            this.priceLoc = priceLoc;
        }

        public void setQuantityLoc(String quantityLoc) {
            this.quantityLoc = quantityLoc;
        }

        public String getProductNameLoc() {
            return productNameLoc;
        }

        public String getPriceLoc() {
            return priceLoc;
        }

        public String getQuantityLoc() {
            return quantityLoc;
        }

        public Item(String idLoc, String productNameLoc, String priceLoc, String quantityLoc) {
            this.idLoc = idLoc;
            this.productNameLoc = productNameLoc;
            this.priceLoc = priceLoc;
            this.quantityLoc = quantityLoc;
        }
    }


    public static void main(String[] args) throws IOException {
    //-u id productName price quantity
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine(); // "c:\\1.txt"; //
        reader.close();
        ArrayList<Item> arr = parseDB(fileName);

//        for(Item temp : arr) {
//            System.out.println(temp.idLoc + " " + temp.productNameLoc + " " + temp.priceLoc + " " + temp.quantityLoc);
//        }

        if (args[0].equals("-u")) {
            //System.out.println("update");
            for(int i = 0; i < arr.size(); i++) {
                if (arr.get(i).idLoc.equals(args[1])) {
                    arr.get(i).setProductNameLoc(args[2]);
                    arr.get(i).setPriceLoc(args[3]);
                    arr.get(i).setQuantityLoc(args[4]);
                }
            }
            recordFile(fileName, arr);
        } else if (args[0].equals("-d")) {
            //System.out.println("delete");
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).idLoc.equals(args[1])) {
                    arr.remove(i);
                    i -= 1;
                }
            }
           recordFile(fileName, arr);
        }
//        for(Item temp : arr) {
//            System.out.println(temp.idLoc + " " + temp.productNameLoc + " " + temp.priceLoc + " " + temp.quantityLoc);
//        }
    }

    private static ArrayList<Item> parseDB(String path){
        ArrayList<Item> item = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String str;
            while ((str = reader.readLine()) != null) {
                item.add (new Item(
                        str.substring(0, 8).trim(),
                        str.substring(8, 38).trim(),
                        str.substring(38, 46).trim(),
                        str.substring(46, 50).trim()
                ));
            }
        } catch (IOException e) {
        }
        return item;
    }

    public static void recordFile(String path, ArrayList<Item> recArr) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
                for(int i = 0; i < recArr.size(); i++) {
                    String tmp, str = "";
                    tmp = recArr.get(i).getIdLoc();
                    while (tmp.length() < 8) {
                        tmp += " ";
                    }
                    str += tmp;
                    tmp = recArr.get(i).getProductNameLoc();
                    while (tmp.length() < 30) {
                        tmp += " ";
                    }
                    str += tmp;
                    tmp = recArr.get(i).getPriceLoc();
                    while (tmp.length() < 8) {
                        tmp += " ";
                    }
                    str += tmp;
                    tmp = recArr.get(i).getQuantityLoc();
                    while (tmp.length() < 4) {
                        tmp += " ";
                    }
                    str += tmp;
                    writer.append(str + "\n");
                    writer.flush();
                }
        } catch (IOException e) {
        }
    }
}
