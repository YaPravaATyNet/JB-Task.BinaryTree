package com.company;

import java.util.ArrayList;

public class Parser {
    public Node root;
    public String prevLine;
    public ArrayList<Node> prevNodesList;

    public Node curNode;
    public ArrayList<Node> curNodesList;

    Parser(String firstLine) {
        String value = firstLine.trim();
        this.root = new Node(new StringBuilder(value));

        this.prevLine = firstLine;

        this.prevNodesList = new ArrayList<>();
        for (int i = 0; i < firstLine.length(); i++) {
            if (firstLine.charAt(i) == ' ') {
                this.prevNodesList.add(null);
            } else {
                this.prevNodesList.add(root);
            }
        }
    }

    public void parseLine(String line) {
        curNodesList = new ArrayList<>(line.length());
        curNode = null;
        for (int j = 0; j < line.length(); j++) {
            if (line.charAt(j) == ' ') {
                addSpace();
                continue;
            }
            if (line.charAt(j) == '/') {
                addEdge(j, 1);
                continue;
            }
            if (line.charAt(j) == '\\') {
                addEdge(j, -1);
                continue;
            }
            addChar(line, j);
        }
        prevNodesList = curNodesList;
        prevLine = line;
    }

    private void addSpace() {
        if (curNode != null) {
            curNode = null;
        }
        curNodesList.add(null);
    }

    private void addEdge(int index, int offset) {
        if (index < prevNodesList.size() && prevNodesList.get(index) != null) {
            curNodesList.add(prevNodesList.get(index));
        } else {
            curNodesList.add(prevNodesList.get(index + offset));
        }
    }

    private void addChar(String line, int index) {
        if (curNode == null) {
            curNode = new Node(new StringBuilder(String.valueOf(line.charAt(index))));
        } else {
            curNode.value.append(line.charAt(index));
        }
        for (int diff = index - 1; diff <= index + 1; diff++) {
            if (diff >= prevLine.length() || diff < 0)
                continue;
            if ( prevLine.charAt(diff) == '/' && diff != index - 1) {
                prevNodesList.get(diff).left = curNode;
                break;
            }
            if (prevLine.charAt(diff) == '\\' && diff != index + 1) {
                prevNodesList.get(diff).right = curNode;
                break;
            }
        }
        curNodesList.add(curNode);
    }
}
