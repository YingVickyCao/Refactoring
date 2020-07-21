package com.hades.example.java.refactoring.after._c1.movie.v6;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void statement() {
        {
            Customer customer = new Customer("Vicky1");
            String title = "Titanic";
            int priceCode = 0;
            int _daysRented = 1;

            Movie movie = new Movie(title, priceCode);
            Rental rental = new Rental(movie, _daysRented);
            customer.addRental(rental);
            String result = customer.statement();
//            System.out.println(result);
            String dest = "Rental Record for Vicky1\n" +
                    "\tTitanic\t2.0\n" +
                    "Amount owed is 2.0\n" +
                    "You earned 1 frequent renter points";
            Assert.assertEquals(dest, result);
        }

        {
            Customer customer = new Customer("Vicky2");
            String title = "Titanic";
            int priceCode = 0;
            int _daysRented = 7;

            Movie movie = new Movie(title, priceCode);
            Rental rental = new Rental(movie, _daysRented);
            customer.addRental(rental);
            String result = customer.statement();
//            System.out.println(result);
            String dest = "Rental Record for Vicky2\n" +
                    "\tTitanic\t9.5\n" +
                    "Amount owed is 9.5\n" +
                    "You earned 1 frequent renter points";
            Assert.assertEquals(dest, dest);
        }

        {
            Customer customer = new Customer("Vicky3");
            String title = "Titanic";
            int priceCode = 1;
            int _daysRented = 7;

            Movie movie = new Movie(title, priceCode);
            Rental rental = new Rental(movie, _daysRented);
            customer.addRental(rental);
            String result = customer.statement();
//            System.out.println(result);
            String dest = "Rental Record for Vicky3\n" +
                    "\tTitanic\t21.0\n" +
                    "Amount owed is 21.0\n" +
                    "You earned 2 frequent renter points";
            Assert.assertEquals(dest, dest);
        }

        {
            Customer customer = new Customer("Vicky4");
            String title = "Titanic";
            int priceCode = 2;
            int _daysRented = 7;

            Movie movie = new Movie(title, priceCode);
            Rental rental = new Rental(movie, _daysRented);
            customer.addRental(rental);
            String result = customer.statement();
//            System.out.println(result);
            String dest = "Rental Record for Vicky4\n" +
                    "\tTitanic\t7.5\n" +
                    "Amount owed is 7.5\n" +
                    "You earned 1 frequent renter points";
            Assert.assertEquals(dest, dest);
        }

        {
            Customer customer = new Customer("Vicky5");
            String title = "Titanic";
            int priceCode = 2;
            int _daysRented = 2;

            Movie movie = new Movie(title, priceCode);
            Rental rental = new Rental(movie, _daysRented);
            customer.addRental(rental);
            String result = customer.statement();
//            System.out.println(result);
            String dest = "Rental Record for Vicky5\n" +
                    "\tTitanic\t1.5\n" +
                    "Amount owed is 1.5\n" +
                    "You earned 1 frequent renter points";
            Assert.assertEquals(dest, dest);
        }
    }
}