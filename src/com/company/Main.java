package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String data =
                "            fooooo\n" +
                "           /    \\\n" +
                "          /      \\\n" +
                "         /        \\\n" +
                "        /          \\\n" +
                "       k           bar\n" +
                "      /            /  \\\n" +
                "     /           baz   w\n" +
                "    ab           / \\   /\\\n" +
                "   / \\          z   i m  abcde\n" +
                "  o   pam\n";
        Tree tree = Tree.readString(data);
        System.out.println(tree);
        try {
            tree = Tree.readFile(new File("input.txt"));
            System.out.println(tree);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}