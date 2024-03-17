package org.example;

import org.example.expenses.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.println("""
                               
                Menu:
                            
                               
                1. Lista rachunków za dany miesiąc
                2. Utwórz nowy miesiąc
                
                """);

        int menu = scanner.nextInt();
        switch (menu) {
            case 1 -> account.showAccountInformation();
        }
    }
}