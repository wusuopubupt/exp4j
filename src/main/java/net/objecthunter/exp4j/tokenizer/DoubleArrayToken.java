package net.objecthunter.exp4j.tokenizer;

/**
 * Created by wangdongxu on 11/7/17.
 */
public class DoubleArrayToken extends Token {
    private double[] value;

    public DoubleArrayToken(double[] value) {
        super(TOKEN_DOUBLE_ARRAY);
        this.value = value;
    }

    public double[] getValue() {
        return value;
    }
}
