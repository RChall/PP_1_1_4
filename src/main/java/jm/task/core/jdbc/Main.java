package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDaoJDBCImpl;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoJDBCImpl userService = new UserDaoJDBCImpl();
        userService.createUsersTable();
        userService.saveUser("Вася", "Петров", (byte) 13);
        userService.saveUser("Петя", "Васечкин", (byte) 14);
        userService.saveUser("Дима", "Рогожин", (byte) 23);
        userService.saveUser("Валерий", "Котов", (byte) 72);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

