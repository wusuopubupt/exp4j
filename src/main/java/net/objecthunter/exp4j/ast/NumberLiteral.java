package net.objecthunter.exp4j.ast;

import net.objecthunter.exp4j.tokenizer.NumberToken;

public class NumberLiteral extends ASTLeaf {

    private double value;

    public NumberLiteral(NumberToken t) {
        super(t);
        value = t.getValue();
    }

    public Object evaluate() {
        return value;
    }
}
