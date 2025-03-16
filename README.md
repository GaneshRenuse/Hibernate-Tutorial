# 📌 Hibernate Tutorials

Welcome to the **Hibernate Tutorials** repository! 🚀 This repository contains **comprehensive learning resources**, **code snippets**, **example projects**, and **documentation** that I used while learning Hibernate.

Whether you are a **beginner** or an **experienced developer**, this repository will help you understand **Hibernate ORM**, its features, and how to integrate it into Java applications.

---

## 📖 Table of Contents

- [Introduction to Hibernate](#introduction-to-hibernate)
- [Installation & Setup](#installation--setup)
- [Hibernate Core Concepts](#hibernate-core-concepts)
- [Mapping in Hibernate](#mapping-in-hibernate)
- [Working with Hibernate Annotations](#working-with-hibernate-annotations)
- [Hibernate Query Language (HQL)](#hibernate-query-language-hql)
- [Integrating Hibernate with Spring Boot](#integrating-hibernate-with-spring-boot)
- [Performance Optimization & Caching](#performance-optimization--caching)
- [Error Handling & Debugging](#error-handling--debugging)
- [Resources & References](#resources--references)

---

## 📌 Introduction to Hibernate

**Hibernate** is an **ORM (Object-Relational Mapping)** framework for Java that simplifies database interactions by mapping Java objects to database tables. It eliminates the need for complex SQL queries and provides a high-level abstraction for database operations.

### ✨ Features of Hibernate:
✔ **Lightweight & Open-source**  
✔ **Automatic ORM Mapping** (No need for manual SQL queries)  
✔ **Supports Caching** (First-Level & Second-Level Caching)  
✔ **Database Independence** (Supports multiple databases)  
✔ **Annotations & XML-based Configurations**  
✔ **Integrates with Spring & JPA**  

---

## 🛠 Installation & Setup

### 🔹 Prerequisites:
- **Java 8+** installed
- **Maven** or **Gradle** for dependency management
- **MySQL/PostgreSQL** or any relational database

### 🔹 Add Hibernate Dependencies (Maven)

```xml
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>6.x.x</version>
</dependency>
```

For **Gradle**, use:

```gradle
dependencies {
    implementation 'org.hibernate:hibernate-core:6.x.x'
}
```

---

## 📌 Hibernate Core Concepts

- **Session & SessionFactory**
- **Transaction Management**
- **Persistence Context**
- **Configuration (XML vs Annotations)**

---

## 📌 Mapping in Hibernate

- **One-to-One Mapping**
- **One-to-Many Mapping**
- **Many-to-Many Mapping**
- **Cascade Operations**

```java
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Course> courses;
}
```

---

## 📌 Working with Hibernate Annotations

- **@Entity, @Table, @Id, @GeneratedValue**
- **@OneToOne, @OneToMany, @ManyToMany**
- **@Column, @Transient, @Enumerated**

Example:

```java
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_name")
    private String name;

    @Column(unique = true, nullable = false)
    private String email;
}
```

---

## 📌 Hibernate Query Language (HQL)

- **Basic Queries** (`SELECT, UPDATE, DELETE`)
- **Named Queries**
- **Pagination & Sorting**

```java
String hql = "FROM Employee WHERE salary > :salary";
Query query = session.createQuery(hql);
query.setParameter("salary", 50000);
List<Employee> employees = query.list();
```

---

## 📌 Integrating Hibernate with Spring Boot

- **Spring Boot + Hibernate Configuration**
- **Using Spring Data JPA with Hibernate**
- **Transaction Management with @Transactional**

```properties
# application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 📌 Performance Optimization & Caching

- **First-Level & Second-Level Caching**
- **Batch Processing & Fetch Strategies**
- **Lazy vs Eager Loading**

Example of **Caching Configuration**:

```java
@Cacheable
@Entity
public class Product {
    @Id
    private Long id;
    private String name;
}
```

---

## 📌 Error Handling & Debugging

- **Common Hibernate Exceptions & Solutions**
- **Enabling Hibernate Logging**
- **SQL Injection Prevention**

```properties
# Enable Hibernate SQL Logging
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type.descriptor.sql=TRACE
```

---

## 📌 Resources & References.
- [Hibernate Official Documentation](https://hibernate.org/)
- [Spring Boot + Hibernate Guide](https://spring.io/projects/spring-boot)
- [JPA & Hibernate Best Practices](https://vladmihalcea.com/)
- [Hibernate GitHub Repository](https://github.com/hibernate/)
- [Hibernate Tutorial Video by Telusko](https://youtu.be/qF20cAHKrXA?si=aM0bJPTM56Sf90ks)

---

## 📢 Contributing

Want to contribute? Feel free to submit a **Pull Request** with new tutorials, improvements, or additional examples!

---

## 📧 Contact

If you have any queries, feel free to reach out:  
📩 **Email:** ganesh21renuse3@gmail.com  
🌐 **GitHub:** [GaneshRenuse](https://github.com/GaneshRenuse)

---

## ⭐ Don't Forget to Star the Repo!  
If you find this repository helpful, please **star** ⭐ it to show support! 🚀  
