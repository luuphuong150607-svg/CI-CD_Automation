package org.example;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class BankAccount {
    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
        logger.info("Tai khoan duoc tao voi so du ban dau: {}", balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            logger.info("Nap tien thanh cong: {}. So du hien tai: {}", amount, balance);
        } else {
            logger.warn("Nap so tien khong hop le: {}", amount);
            throw new IllegalArgumentException("So tien nap phai lon hon 0");
        }
    }

    public double getBalance() {
        return balance;
    }
}
