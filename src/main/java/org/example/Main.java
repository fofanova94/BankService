package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankRepository bankRepository = new BankRepository();
        BankService bankService = new BankService();
        bankService.setBankRepository(bankRepository);
        String name = scanner.nextLine();
        BankCardsInformation user = bankRepository.findUserByLogin(name);

        double ammount = scanner.nextDouble();

        System.out.println(bankRepository.findAll());

        bankService.payToCinema(user, ammount);
        System.out.println(bankRepository.findAll());



    }
}
