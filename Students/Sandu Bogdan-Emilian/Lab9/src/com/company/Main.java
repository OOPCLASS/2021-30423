package com.company;

import com.company.models.Document;
import com.company.models.OutOfPaperException;
import com.company.models.PrintingService;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Create the following classes:
 * --------------------
 * PrintingService
 * --------------------
 * - inkAmount: Double
 * - paperAmount: Integer
 * --------------------
 * + print(document: Document)
 * --------------------
 * <p>
 * --------------------
 * Document
 * --------------------
 * - text: String
 * - numberOfPages: Integer
 * --------------------
 * --------------------
 * <p>
 * Create 2 exceptions: OutOfInkException (unchecked) and OutOfPaperException (checked)
 * - print method consumes 0.001 * document.text.length * numberOfPages ink for each
 * document that's being printed
 * - print method consumes numberOfPages for each document that's being printed
 * - throw one of the exceptions depending on the situation
 */
public class Main {
    public static void main(String[] args) throws OutOfPaperException {

        Document document = new Document("Imi place sa mananc aicea" +
                "Imi place sa mananc aicea" +
                "Imi place sa mananc aicea" +
                "Imi place sa mananc aicea" +
                "Imi place sa mananc aicea" +
                "Imi place sa mananc aicea" +
                "Imi place sa mananc aicea" +
                "Imi place sa mananc aicea" +
                "Imi place sa mananc aicea" +
                "Imi place sa mananc aicea" +
                "Imi place sa mananc aicea" +
                "Imi place sa mananc aicea" +
                "Imi place sa mananc aicea", 10);
        PrintingService printer = new PrintingService(10.0, 50);
        printer.print(document);
        printer.print(document);
        printer.print(document);
        printer.print(document);
    }
}