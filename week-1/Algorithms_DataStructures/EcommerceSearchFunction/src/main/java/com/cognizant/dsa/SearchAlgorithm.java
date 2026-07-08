package com.cognizant.dsa;

public class SearchAlgorithm {
    public static product LinearSearch(product[] products,String productName){
        for(product Product:products){
            if(Product.getProductName().equalsIgnoreCase(productName)){
                return Product;
            }
        }
        return null;

    }
    public static product BinarySearch(product[] products,String productName){
        int left=0;
        int right= products.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            int compare=products[mid].getProductName().compareToIgnoreCase(productName);

            if(compare==0){
                return products[mid];
            }
            else if(compare  < 0){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return null;
    }
}
