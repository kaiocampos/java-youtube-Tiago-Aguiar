package com.kaiodev;

public class App {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User("Kaio", "Campos"),
                new User("Samara", "Ribeiro"),
                new User("Miguel", "Campos")

        };



        System.out.println(users[0].getFirstName());
        System.out.println(users[2].getLastName());
    }
}
