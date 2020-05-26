package com.company;

import com.company.z1.Figures;
import com.company.z2.Z2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {

        //zadanie1
        System.out.print("Zadanie 1: \n");
        Figures f1 = new Figures();

        //zadanie2
        System.out.print("Zadanie 2: \n");
        Z2 z2 = new Z2();
        z2.getPositiveElements();

        //zadanie3
        System.out.print("Zadanie 3: \n");
        System.out.println("\"\".isBlank() - " + "".isBlank());
        System.out.println("\"\".isEmpty() - " + "".isEmpty());
        System.out.println("\"AB\\nAB\\nAB\".lines() - ");
        "AB\nAB\nAB".lines().forEach(System.out::println);
        System.out.println("\" DB \".strip() -" + " DB ".strip());
        System.out.println("\" DB \".stripLeading() -" + " DB ".stripLeading());
        System.out.println("\" DB \".stripTrailing() -" + " DB ".stripTrailing());
        System.out.println("\"==\".repeat(5) - " + "==".repeat(5));

        //zadanie4
        System.out.print("Zadanie 4: \n");
        Path p1 = Path.of("src/com/company/p1.txt");
        Path p1Copy = Path.of("src/com/company/p1Copy.txt");
        Path p2 = Path.of("src/com/company/p2.txt");
        System.out.println("Takie same pliki - " + Files.mismatch(p1, p1Copy));
        System.out.println("Różne pliki - " + Files.mismatch(p1, p2));
        System.out.println("p1.txt -" + Files.readString(p1));
        System.out.println("p1Copy.txt -" + Files.readString(p1Copy));
        System.out.println("p2.txt -" + Files.readString(p2));



    }
}
