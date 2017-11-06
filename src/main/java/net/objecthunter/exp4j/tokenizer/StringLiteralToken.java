package net.objecthunter.exp4j.tokenizer;

/**
 * Created by wangdongxu on 11/7/17.
 */
public class StringLiteralToken extends Token {
    private String value;

    public StringLiteralToken(String value) {
        super(TOKEN_STRING);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
