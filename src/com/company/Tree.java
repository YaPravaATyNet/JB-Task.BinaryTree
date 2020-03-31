package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tree {
    public Node root;

    Tree(Node root) {
        this.root = root;
    }

    public static Tree readString(String data) {
        String[] lines = data.split("\n");
        Parser parser = new Parser(lines[0]);
        for (int i = 1; i < lines.length; i++) {
            parser.parseLine(lines[i]);
        }
        return new Tree(parser.root);
    }

    public static Tree readFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        Parser parser = new Parser(scanner.nextLine());
        while(scanner.hasNextLine()) {
            parser.parseLine(scanner.nextLine());
        }
        scanner.close();
        return new Tree(parser.root);
    }

    @Override
    public String toString() {
        return root.toString();
    }

}
