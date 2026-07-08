package com.cognizant.dsa;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        product[] Products={
                new product(101,"Laptop", "Electronics"),
                new product(102, "Mobile", "Electronics"),
                new product(103, "Shoes", "Fashion"),
                new product(104, "Watch", "Accessories"),
                new product(105, "Bag", "Fashion")
        };
        System.out.println("/////Linear Search////");
        product linearResult=SearchAlgorithm.LinearSearch(Products,"Shoes");

        if(linearResult!=null){
            System.out.println(linearResult);
        }else{
            System.out.println("Product not Found");
        }

        Arrays.sort(Products,Comparator.comparing(product::getProductName));

        System.out.println("//////Binary Search///////");
        product binaryResult=SearchAlgorithm.BinarySearch(Products,"Shoes");

        if(binaryResult!=null){
            System.out.println(binaryResult);
        }else{
            System.out.println("Product not found");
        }
    }
}
