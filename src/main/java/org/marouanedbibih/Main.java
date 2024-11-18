package org.marouanedbibih;

import org.marouanedbibih.dao.UserDao;
import org.marouanedbibih.model.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hibernate TP");
        UserDao userDao = new UserDao();

        // Créer un nouvel utilisateur
        User newUser = new User();
        newUser.setName("John Doe");
        newUser.setEmail("marouane.dbibih@gmail.com");

        if (userDao.create(newUser)) {
            System.out.println("User created successfully");
        } else {
            System.out.println("Failed to create user");
        }

        // Trouver un utilisateur par ID
        User user = userDao.findById(1L);
        if (user != null) {
            System.out.println("User found: " + user.getName());
        } else {
            System.out.println("User not found");
        }

        // Mettre à jour l’utilisateur
        if (user != null) {
            user.setName("Jane Doe");
            user.setEmail("marouane.dbibih@gmail.com");
            if (userDao.update(user)) {
                System.out.println("User updated successfully");
            } else {
                System.out.println("Failed to update user");
            }

            // Supprimer l’utilisateur
            if (userDao.delete(user)) {
                System.out.println("User deleted successfully");
            } else {
                System.out.println("Failed to delete user");
            }
        }

        // Afficher tous les utilisateurs
        System.out.println("All Users: " + userDao.findAll());
    }
}
