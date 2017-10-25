package net.objecthunter.exp4j.ast;

import net.objecthunter.exp4j.tokenizer.VariableToken;

public class Variable extends ASTLeaf {

    private String name;

    public Variable(VariableToken t) {
        super(t);
        name = t.getName();
    }

    public Object evaluate() {
        return name;
    }

}
