package org.ganesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Main {
    protected Alien a1;
    protected SessionFactory factory;
    protected Session session;

    Main(){
        // Create SessionFactory and Session
        this.a1 = new Alien();
        this.factory = new Configuration().addAnnotatedClass(org.ganesh.Alien.class).configure().buildSessionFactory();
        this.session = factory.openSession();
    }

    public void saveMethod(int id, String name, String tech) {
        // Setting values to Alien object
        a1.setAid(id);
        a1.setAname(name);
        a1.setTech(tech);

        // Begin transaction
        Transaction transaction = session.beginTransaction();
        // Persist the Alien object
        session.persist(a1);
        // Commit the transaction
        transaction.commit();

        System.out.println("Object saved successfully!!");
    }

    public void GetMethod() {
        // Retrieve the Alien object from the database
        Alien a2 = session.find(Alien.class, 101);
        // Print the retrieved object
        System.out.println(a2);
    }

    public void exitMethod() {
        // Close the session
        session.close();
        factory.close();
        System.out.println("Session closed successfully!!");
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Create an instance of Main
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID, Name and Tech:");
        int id = sc.nextInt();
        String name = sc.next();
        String tech = sc.next();

        // Call the saveMethod to save the object
        main.saveMethod(id, name, tech);
        // Call the GetMethod to retrieve the object
        main.GetMethod();
        // Call the exitMethod to close the session
        main.exitMethod();
    }
}