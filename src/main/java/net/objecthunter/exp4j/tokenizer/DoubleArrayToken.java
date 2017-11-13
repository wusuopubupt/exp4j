package net.objecthunter.exp4j.tokenizer;

/**
 * Created by wangdongxu on 11/7/17.
 */
public class DoubleArrayToken extends Token {
    private Double[] value;

    public DoubleArrayToken(Double[] value) {
        super(TOKEN_DOUBLE_ARRAY);
        this.value = value;
    }

    public Double[] getValue() {
        return value;
    }
}
