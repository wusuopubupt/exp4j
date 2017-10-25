package net.objecthunter.exp4j.ast;

import net.objecthunter.exp4j.tokenizer.Token;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 叶子节点, 无孩子节点
 */
public class ASTLeaf extends ASTree {

    private static ArrayList<ASTree> empty = new ArrayList<ASTree>();

    private Token token;

    public ASTLeaf(Token t) {
        token = t;
    }

    public ASTree child(int i) {
        throw new IndexOutOfBoundsException();
    }

    public int numChildren() {
        return 0;
    }

    public Iterator<ASTree> children() {
        return empty.iterator();
    }

    public Object evaluate() {
        return null;
    }

    public Token token() {
        return token;
    }
}
