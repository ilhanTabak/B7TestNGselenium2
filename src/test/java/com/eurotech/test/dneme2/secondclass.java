package com.eurotech.test.dneme2;

import com.github.javafaker.Faker;

public class secondclass {
    public static void main(String[] args) {


        Faker faker=new Faker();

        for (int i = 0; i <20 ; i++) {

            System.out.println(faker.backToTheFuture().character());
        }

    }
}
