package com.example.fragmentapp.Data;

import com.example.fragmentapp.R;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private Integer image;
    private String name;


    static Integer[] images = {
            R.drawable.airpods,R.drawable.airpodsmax,R.drawable.airtag,R.drawable.ipad,
            R.drawable.iphone,R.drawable.macbook,R.drawable.pc,R.drawable.pencil,R.drawable.ps5,
            R.drawable.samsung,R.drawable.watch , R.drawable.xbox , R.drawable.zfold
    };

    static String[] names = {
            "AirPods", "AirPods Max", "Air Tag", "Ipad", "Iphone", "MacBook", "PC", "Apple Pencil",
            "PS5", "Samsung S24", "Apple Watch", "XBOX", "Samsung Zfold"
    };

    private static List<Products> ProductList = new ArrayList<>();

    // Static initializer block to populate the grocery list
    static {
        for (int i = 0; i < images.length; i++) {
            ProductList.add(new Products(images[i], names[i]));
        }
    }

    public Products(Integer image, String name) {
        this.image = image;
        this.name = name;
    }


    // Getter methods
    public Integer getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    // Method to get the static list of groceries
    public static List<Products> getProductList() {
        return ProductList;
    }

}
