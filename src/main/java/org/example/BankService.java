package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BankService {
    @Autowired
    private BankRepository bankRepository;

    public void payToCinema(BankCardsInformation user, double balance) {
        BankCardsInformation admin = bankRepository.findUserByLogin("Admin_Cinema");
        if (user.getBalance() >= balance) {
            admin.setBalance(admin.getBalance() + balance);
            user.setBalance(user.getBalance() - balance);
            bankRepository.updateBalance(admin);
            bankRepository.updateBalance(user);
        } else {
            throw new ServiceException("Недостаточно средств");
        }

    }

    public void setBankRepository(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

}
