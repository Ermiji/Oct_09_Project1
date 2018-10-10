package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> movielist = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String response = "n";


        do {

            System.out.println("Enter a movie name: ");
            String movie = sc.next();
            movielist.add(movie);

            System.out.println("Do you want to enter another movie? ");
             response = sc.next();


        } while (response.equalsIgnoreCase("y"));
        System.out.print("{");
        for (int i = 0; i < movielist.size(); i++) {
            System.out.print(movielist.get(i));
            if(i!=movielist.size()-1)
            {
                System.out.print(", ");
            }
        }

        System.out.print("}");
    }
}


