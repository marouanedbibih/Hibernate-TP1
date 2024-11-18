# Hibernate TP 1 - User Management with Hibernate and MySQL

## Description
This project demonstrates how to manage users using Hibernate ORM with a MySQL database. It covers basic CRUD (Create, Read, Update, Delete) operations on a `User` entity. Hibernate is used for ORM (Object Relational Mapping), enabling seamless interaction between Java objects and a relational database. This project aims to provide a foundational understanding of integrating Hibernate with MySQL for persistent storage.

## Requirements

To run this project, you need the following:

- **Java 8 or higher** (for running the Java application)
- **MySQL** (for the database)
- **Hibernate 5.x** (for ORM functionality)
- **Maven** (for dependency management and build)
- **IDE** (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code)
- **JDBC Driver** for MySQL (`mysql-connector-java`)

### Setup Instructions

1. **Install Java**:
   Ensure that Java is installed on your machine. You can check the installation by running the following command:

   ```bash
   java -version
   ```

2. **Install MySQL**:
   You need MySQL installed and running on your local machine or a remote MySQL server. You can download it from [MySQL official website](https://dev.mysql.com/downloads/).

3. **Create the MySQL Database**:
   Create a database to store the user data. You can do this via MySQL command line or MySQL Workbench.

   Example SQL command:

   ```sql
   CREATE DATABASE hibernate_tp;
   ```

4. **Configure Hibernate**:
   Ensure that your `hibernate.cfg.xml` is configured with the correct database connection settings. This file should include the MySQL connection URL, username, and password.

   Example `hibernate.cfg.xml`:

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <hibernate-configuration>
       <session-factory>
           <!-- JDBC Database connection settings -->
           <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
           <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/hibernate_tp</property>
           <property name="hibernate.connection.username">root</property>
           <property name="hibernate.connection.password">password</property>

           <!-- JDBC connection pool settings -->
           <property name="hibernate.c3p0.min_size">5</property>
           <property name="hibernate.c3p0.max_size">20</property>
           <property name="hibernate.c3p0.timeout">300</property>

           <!-- Specify dialect -->
           <property name="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</property>

           <!-- Enable Hibernate's automatic session context management -->
           <property name="hibernate.current_session_context_class">thread</property>

           <!-- Echo all executed SQL to stdout -->
           <property name="hibernate.show_sql">true</property>

           <!-- Drop and re-create the database schema on startup -->
           <property name="hibernate.hbm2ddl.auto">update</property>

           <!-- Disable the second-level cache -->
           <property name="hibernate.cache.use_second_level_cache">false</property>
       </session-factory>
   </hibernate-configuration>
   ```

5. **Run the Application**:
   Once everything is set up, run the `Main.java` class to test the CRUD operations. The project will insert, update, and delete a `User` entity in the MySQL database.

## Folder Structure

```bash
.
├── main
│   ├── java
│   │   └── org
│   │       └── marouanedbibih
│   │           ├── dao
│   │           │   ├── IDao.java
│   │           │   └── UserDao.java
│   │           ├── Main.java
│   │           └── model
│   │               └── User.java
│   └── resources
│       └── hibernate.cfg.xml
└── test
    └── java
```

- **`dao/IDao.java`**: Defines the generic interface for CRUD operations.
- **`dao/UserDao.java`**: Implements the CRUD operations for the `User` entity.
- **`model/User.java`**: The `User` entity class, representing a user in the system.
- **`Main.java`**: Entry point for the application, performing CRUD operations on the `User` entity.
- **`hibernate.cfg.xml`**: Hibernate configuration file for connecting to MySQL.

## Features

- **Create a User**: Add a new user to the MySQL database.
- **Read a User**: Find a user by ID.
- **Update a User**: Modify the details of an existing user.
- **Delete a User**: Remove a user from the database.
- **View all Users**: List all users stored in the database.

## Conclusion

This project provides a hands-on implementation of Hibernate ORM with MySQL. By managing users through basic CRUD operations, it helps you understand how to interact with databases using Hibernate, a powerful ORM tool for Java. 

This project can serve as a foundation for building more complex applications that require database management and persistence.

## Contact

For any questions or feedback, feel free to reach out to:

- **Name**: Marouane Dbibih
- **Email**: marouane.dbibih@gmail.com
- **GitHub**: [marouanedbibih](https://github.com/marouanedbibih)