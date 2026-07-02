package com.cognizant.singelton;

public class main {
    public static void main(String[] args) {
        logger log1=logger.getInstance();
        logger log2=logger.getInstance();

        log1.log("Application Started");
        log2.log("User Logged in");

        if(log1==log2){
            System.out.println("Only one logger Instance Exist ");
        }
    }
}
