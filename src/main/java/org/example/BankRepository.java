package org.example;

import org.springframework.stereotype.Repository;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

@Repository
public class BankRepository {

    public void addUser(BankCardsInformation user) {
        String sql = "INSERT INTO users_account (Card_Number,CVV,Name,Data,Ammount, Login) VALUES (?,?,?,?,?,?)";
        try (
                Connection connection = ConnectionFactory.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setString(1, user.getCardNumber());
            preparedStatement.setInt(2, user.getCvv());
            preparedStatement.setString(3, user.getName());
            preparedStatement.setDate(4, Date.valueOf(user.getDate()));
            preparedStatement.setDouble(5, user.getBalance());
            preparedStatement.setString(6, user.getLogin());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public ArrayList<BankCardsInformation> findAll() {
        ArrayList<BankCardsInformation> users = new ArrayList<>();
        String sql = "SELECT * FROM users_account";
        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement();) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String cardNumber = resultSet.getString("Card_Number");
                int cvv = resultSet.getInt("CVV");
                String name = resultSet.getString("Name");
                LocalDate date = resultSet.getDate("Data").toLocalDate();
                double balance = resultSet.getDouble("Ammount");
                String login = resultSet.getString("Login");

                BankCardsInformation user = new BankCardsInformation(name, cvv, cardNumber, date, balance, login);
                users.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        return users;

    }


    public BankCardsInformation findUserByLogin(String login) {
        String sql = "SELECT * FROM users_account WHERE Login = " + "'" + login + "'";
        System.out.println(sql);
        BankCardsInformation user = null;
        try (Connection connection = ConnectionFactory.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql);
        ) {
            if (resultSet.next()) {
                String cardNumber = resultSet.getString("Card_Number");
                int cvv = resultSet.getInt("CVV");
                String name = resultSet.getString("Name");
                LocalDate date = resultSet.getDate("Data").toLocalDate();
                double balance = resultSet.getDouble("Ammount");

                user = new BankCardsInformation(cardNumber, cvv, name, date, balance, login);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    public void updateBalance(BankCardsInformation user) {
        String sql = "UPDATE users_account SET Ammount = ? WHERE Login = ?";
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
            double ammount = user.getBalance();
            String login = user.getLogin();
            preparedStatement.setDouble(1,ammount);
            preparedStatement.setString(2,login);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



}
