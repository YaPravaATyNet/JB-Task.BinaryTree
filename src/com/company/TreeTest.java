package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TreeTest {

    @Test
    void readString() {
        assertEquals(Tree.readString(
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
                "  o   pam\n").toString(), "fooooo k ab o pam bar baz z i w m abcde");

        assertEquals(Tree.readString(
                "a\n" +
                " \\\n" +
                "  b\n" +
                "   \\\n" +
                "    c\n" +
                "     \\\n" +
                "      d\n" +
                "       \\\n" +
                "        e\n" +
                "         \\\n" +
                "          f").toString(), "a b c d e f");

        assertEquals(Tree.readString(
                "          a\n" +
                "         /\n" +
                "        b\n" +
                "       /\n" +
                "      c\n" +
                "     /\n" +
                "    d\n" +
                "   /\n" +
                "  e\n" +
                " /\n" +
                "f").toString(), "a b c d e f");

        assertEquals(Tree.readString("").toString(), "");
        assertEquals(Tree.readString("a").toString(), "a");
        assertEquals(Tree.readString("    abcdef   ").toString(), "abcdef");

        assertEquals(Tree.readString(
                "a\n" +
                "\\\n" +
                "b\n" +
                "/\n" +
                "c\n" +
                "\\\n" +
                "d").toString(), "a b c d");
        assertEquals(Tree.readString(
                "a\n" +
                "/\n" +
                "b\n" +
                "/\n" +
                "c\n" +
                "/\n" +
                "d").toString(), "a b c d");
        assertEquals(Tree.readString(
                "a\n" +
                "\\\n" +
                "b\n" +
                "\\\n" +
                "c\n" +
                "\\\n" +
                "d").toString(), "a b c d");

        assertEquals(Tree.readString(
                "                       d\n" +
                "                       /\n" +
                "             aasdasdasdasdasdasdad\n" +
                "            /                     \\\n" +
                "        sdadddasd              asdasdsada\n" +
                "        /                               \\\n" +
                "        asdasd                           asdsadasdas\n" +
                "             /                           \\\n" +
                "   asdadasdsad                   asdsadasd\n" +
                "        \\                           /\n" +
                "         fghgfhgfh            wrewrt\n" +
                "            /                   \\\n" +
                "         hjhjhj               jhjhjh ").toString(),
                "d aasdasdasdasdasdasdad sdadddasd asdasd asdadasdsad fghgfhgfh hjhjhj asdasdsada asdsadasdas asdsadasd wrewrt jhjhjh");

        assertEquals(Tree.readString("            fooooo\n" +
                "           /    \\\n" +
                "    g     /      \\\n" +
                "         /        \\\n" +
                "        /  g       \\\n" +
                "       k           bar\n" +
                "      /            /  \\  g\n" +
                "     /   g       baz   w\n" +
                "    ab           / \\   /\\\n" +
                "   / \\      g   z   i m  abcde\n" +
                "  o   pam").toString(), "fooooo k ab o pam bar baz z i w m abcde");

        assertEquals(Tree.readString(
                "                        a\n" +
                "                        /\\\n" +
                "                        b c\n" +
                "                        /\\\\\n" +
                "                       d e f\n" +
                "                       / /\n" +
                "                       g h\n" +
                "                       //\n" +
                "                      i j").toString(), "a b d g i e h j c f");

        assertEquals(Tree.readString(
                "a\n" +
                " \\\n" +
                "  \\\n" +
                "   \\\n" +
                "    b\n" +
                "     \\\n" +
                "      \\\n" +
                "       \\\n" +
                "        c\n" +
                "         \\\n" +
                "          d\n" +
                "           \\\n" +
                "            \\\n" +
                "             e\n" +
                "              \\\n" +
                "               \\\n" +
                "                \\\n" +
                "                 f").toString(), "a b c d e f");
        assertEquals(Tree.readString(
                "                a\n" +
                "               /\n" +
                "              / \n" +
                "             b\n" +
                "            /\n" +
                "           /\n" +
                "          /\n" +
                "         c\n" +
                "        /\n" +
                "       d\n" +
                "      /\n" +
                "     /\n" +
                "    e\n" +
                "   /\n" +
                "  /\n" +
                " /\n" +
                "f").toString(), "a b c d e f");

        assertEquals(Tree.readString(
                "a\n" +
                "\\\n" +
                " \\\n" +
                "  \\\n" +
                "  b\n" +
                " /\n" +
                "/\n" +
                "c\n" +
                "\\\n" +
                "d").toString(), "a b c d");

        assertEquals(Tree.readString(
                "    foo\n" +
                "   /   \\\n" +
                "  a    b\n" +
                " /     \\\n" +
                "/       \\").toString(), "foo a b");

        assertEquals(Tree.readString(
                "       foo\n" +
                "        / \\\n" +
                "        a  \\\n" +
                "        /\\ c\n" +
                "       /  r \\\n" +
                "       q  /\\ t\n" +
                "       / w  o\\\n" +
                "      /  /  \\ \\\n" +
                "     /   gh  b \\\n" +
                "    qwe /       e\n" +
                "      //\n" +
                "     / jer\n" +
                "    errerrerr").toString(), "foo a q qwe errerrerr r w gh jer o b c t e");
    }
}