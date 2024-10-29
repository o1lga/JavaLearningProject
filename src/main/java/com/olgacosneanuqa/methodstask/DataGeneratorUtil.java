package com.olgacosneanuqa.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {
// Definește două metode statice și publice care vor returna un o valoare int și vor purta numele de getRandomInt().
// Folosește parametri diferiți astfel încât să ai principiul de overloading.

    //Cu ajutorul unui obiect static de tipul Random, execută implementarea metodelor definite mai sus.
    private static final Random random = new Random();

    public static int getRandomInt(int startLimit, int endLimit) {
        if (startLimit >= endLimit) {
            System.out.println("Valoarea minima trebuie sa fie mai mica ca cea maxima");
            return 0;
        }
        int delta = endLimit - startLimit;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber;
        randomNumber = deltaRandomInt + startLimit;
        return randomNumber;
    }

    public static int getRandomInt(int limit) {
        return random.nextInt(limit);
    }
    //Definește o metodă care va genera un random double.
    public static double getRandomDouble(double limit) {
        if (limit <= 0) {
            System.out.println("Limita trebuie sa fie pozitiva");
            return 0;
        }
        return random.nextDouble() * limit;
    }
    //Definește o metodă care va genera un random boolean.
    public static boolean getRandomBoolean() {
        return random.nextBoolean();
    }

    //Definește o metodă statică, care va returna o valoare String ce reprezintă un email unic.
    public static String getRandomEmail(String emailDomain) {
        return UUID.randomUUID() + emailDomain;
    }

    public static String getRandomEmail(String prefix, String emailDomain) {
        return prefix + getRandomInt(99999999) + emailDomain;
    }

    //Definește o metodă care va genera un String random de o anumită lungime.
    public static String generateValidRandomString(int length) {
        String acceptedChars = "ABCDEFGHIJKLMNOPRSTQTUabcdefrtqswlejtms0123456789";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In iteratia: i = " + i + " caracterul alipit este " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
public static String generateInvalidRandomString(int length) {
        String acceptedChars = "~!@#$%^&*()_+}><,.";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In iteratia: i = " + i + " caracterul alipit este " + acceptedChars.charAt(randomIndex));

        }
        return stringBuilder.toString();
}

}


