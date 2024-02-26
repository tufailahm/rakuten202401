package com;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
       Class.forName("com.mongodb.jdbc.MongoDriver");
       System.out.println("Driver loaded");
    }
}
