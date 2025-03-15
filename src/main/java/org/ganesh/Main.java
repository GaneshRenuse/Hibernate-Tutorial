package org.ganesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Create SessionFactory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        // Create Session
        Session session = factory.getCurrentSession();

        try {
            // Create Student object
            Student student = new Student("John Doe", 22);

            // Start a transaction
            session.beginTransaction();

            // Save the student
            session.persist(student);

            // Commit the transaction
            session.getTransaction().commit();

            System.out.println("Student saved successfully!");

        } finally {
            factory.close();
        }
    }
}