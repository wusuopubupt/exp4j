/* 
* Copyright 2014 Frank Asseg
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License. 
*/
package net.objecthunter.exp4j.function;

/**
 * Class representing the builtin functions available for use in expressions
 */
public class Functions {
    private static final int INDEX_SIN = 0;
    private static final int INDEX_COS = 1;
    private static final int INDEX_TAN = 2;
    private static final int INDEX_COT = 3;
    private static final int INDEX_LOG = 4;
    private static final int INDEX_LOG1P = 5;
    private static final int INDEX_ABS = 6;
    private static final int INDEX_ACOS = 7;
    private static final int INDEX_ASIN = 8;
    private static final int INDEX_ATAN = 9;
    private static final int INDEX_CBRT = 10;
    private static final int INDEX_CEIL = 11;
    private static final int INDEX_FLOOR = 12;
    private static final int INDEX_SINH = 13;
    private static final int INDEX_SQRT = 14;
    private static final int INDEX_TANH = 15;
    private static final int INDEX_COSH = 16;
    private static final int INDEX_POW = 17;
    private static final int INDEX_EXP = 18;
    private static final int INDEX_EXPM1 = 19;
    private static final int INDEX_LOG10 = 20;
    private static final int INDEX_LOG2 = 21;
    private static final int INDEX_SGN = 22;
    private static final int INDEX_MAX = 23;
    private static final int INDEX_MIN = 24;
    private static final int INDEX_CONDITION = 25;
    private static final int INDEX_LEN = 26;
    private static final int INDEX_ARRAY_SIZE = 27;
    private static final int INDEX_ARRAY_SUM = 28;
    private static final int INDEX_SPLIT_BY_KEY = 29;

    private static final Function[] builtinFunctions = new Function[30];

    static {
        builtinFunctions[INDEX_SIN] = new Function("sin") {
            @Override
            public Object apply(Object... args) {
                return Math.sin((double) args[0]);
            }
        };
        builtinFunctions[INDEX_COS] = new Function("cos") {
            @Override
            public Object apply(Object... args) {
                return Math.cos((double) args[0]);
            }
        };
        builtinFunctions[INDEX_TAN] = new Function("tan") {
            @Override
            public Object apply(Object... args) {
                return Math.tan((double) args[0]);
            }
        };
        builtinFunctions[INDEX_COT] = new Function("cot") {
            @Override
            public Object apply(Object... args) {
                double tan = Math.tan((double) args[0]);
                if (tan == 0d) {
                    throw new ArithmeticException("Division by zero in cotangent!");
                }
                return 1d / Math.tan((double) args[0]);
            }
        };
        builtinFunctions[INDEX_LOG] = new Function("log") {
            @Override
            public Object apply(Object... args) {
                return Math.log((double) args[0]);
            }
        };
        builtinFunctions[INDEX_LOG2] = new Function("log2") {
            @Override
            public Object apply(Object... args) {
                return Math.log((double) args[0]) / Math.log(2d);
            }
        };
        builtinFunctions[INDEX_LOG10] = new Function("log10") {
            @Override
            public Object apply(Object... args) {
                return Math.log10((double) args[0]);
            }
        };
        builtinFunctions[INDEX_LOG1P] = new Function("log1p") {
            @Override
            public Object apply(Object... args) {
                return Math.log1p((double) args[0]);
            }
        };
        builtinFunctions[INDEX_ABS] = new Function("abs") {
            @Override
            public Object apply(Object... args) {
                return Math.abs((double) args[0]);
            }
        };
        builtinFunctions[INDEX_ACOS] = new Function("acos") {
            @Override
            public Object apply(Object... args) {
                return Math.acos((double) args[0]);
            }
        };
        builtinFunctions[INDEX_ASIN] = new Function("asin") {
            @Override
            public Object apply(Object... args) {
                return Math.asin((double) args[0]);
            }
        };
        builtinFunctions[INDEX_ATAN] = new Function("atan") {
            @Override
            public Object apply(Object... args) {
                return Math.atan((double) args[0]);
            }
        };
        builtinFunctions[INDEX_CBRT] = new Function("cbrt") {
            @Override
            public Object apply(Object... args) {
                return Math.cbrt((double) args[0]);
            }
        };
        builtinFunctions[INDEX_FLOOR] = new Function("floor") {
            @Override
            public Object apply(Object... args) {
                return Math.floor((double) args[0]);
            }
        };
        builtinFunctions[INDEX_SINH] = new Function("sinh") {
            @Override
            public Object apply(Object... args) {
                return Math.sinh((double) args[0]);
            }
        };
        builtinFunctions[INDEX_SQRT] = new Function("sqrt") {
            @Override
            public Object apply(Object... args) {
                return Math.sqrt((double) args[0]);
            }
        };
        builtinFunctions[INDEX_TANH] = new Function("tanh") {
            @Override
            public Object apply(Object... args) {
                return Math.tanh((double) args[0]);
            }
        };
        builtinFunctions[INDEX_COSH] = new Function("cosh") {
            @Override
            public Object apply(Object... args) {
                return Math.cosh((double) args[0]);
            }
        };
        builtinFunctions[INDEX_CEIL] = new Function("ceil") {
            @Override
            public Object apply(Object... args) {
                return Math.ceil((double) args[0]);
            }
        };
        builtinFunctions[INDEX_POW] = new Function("pow", 2) {
            @Override
            public Object apply(Object... args) {
                return Math.pow((double) args[0], (double) args[1]);
            }
        };
        builtinFunctions[INDEX_EXP] = new Function("exp", 1) {
            @Override
            public Object apply(Object... args) {
                return Math.exp((double) args[0]);
            }
        };
        builtinFunctions[INDEX_EXPM1] = new Function("expm1", 1) {
            @Override
            public Object apply(Object... args) {
                return Math.expm1((double) args[0]);
            }
        };
        builtinFunctions[INDEX_SGN] = new Function("signum", 1) {
            @Override
            public Object apply(Object... args) {
                if ((double) args[0] > 0) {
                    return 1;
                } else if ((double) args[0] < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        builtinFunctions[INDEX_MAX] = new Function("max", 2) {
            @Override
            public Object apply(Object... args) {
                return Math.max((double) args[0], (double) args[1]);
            }
        };
        builtinFunctions[INDEX_MIN] = new Function("min", 2) {
            @Override
            public Object apply(Object... args) {
                return Math.min((double) args[0], (double) args[1]);
            }
        };
        builtinFunctions[INDEX_CONDITION] = new Function("condition", 3) {
            @Override
            public Object apply(Object... args) {
                if (1 == (double) args[0]) {
                    return (double) args[1];
                } else {
                    return (double) args[2];
                }
            }
        };
        builtinFunctions[INDEX_LEN] = new Function("len", 1) {
            @Override
            public Object apply(Object... args) {
                return ((String) args[0]).length();
            }
        };
        builtinFunctions[INDEX_ARRAY_SIZE] = new Function("array_size", 1) {
            @Override
            public Object apply(Object... args) {
                Object[] doubleArray = (Object[]) args[0];
                return (doubleArray.length);
            }
        };
        builtinFunctions[INDEX_ARRAY_SUM] = new Function("array_sum", 1) {
            @Override
            public Object apply(Object... args) {
                Double[] doubleArray = (Double[]) args[0];
                double sum = 0.0;
                for (Double d : doubleArray) {
                    sum += d;
                }
                return sum;
            }
        };
        builtinFunctions[INDEX_SPLIT_BY_KEY] = new Function("split_by_key", 2) {
            @Override
            public Object apply(Object... args) {
                String[] strTokens = ((String)args[0]).split((String)args[1]);
                return strTokens;
            }
        };
    }



    /**
     * Get the builtin function for a given name
     *
     * @param name te name of the function
     * @return a Function instance
     */
    public static Function getBuiltinFunction(final String name) {

        if (name.equals("sin")) {
            return builtinFunctions[INDEX_SIN];
        } else if (name.equals("cos")) {
            return builtinFunctions[INDEX_COS];
        } else if (name.equals("tan")) {
            return builtinFunctions[INDEX_TAN];
        } else if (name.equals("cot")) {
            return builtinFunctions[INDEX_COT];
        } else if (name.equals("asin")) {
            return builtinFunctions[INDEX_ASIN];
        } else if (name.equals("acos")) {
            return builtinFunctions[INDEX_ACOS];
        } else if (name.equals("atan")) {
            return builtinFunctions[INDEX_ATAN];
        } else if (name.equals("sinh")) {
            return builtinFunctions[INDEX_SINH];
        } else if (name.equals("cosh")) {
            return builtinFunctions[INDEX_COSH];
        } else if (name.equals("tanh")) {
            return builtinFunctions[INDEX_TANH];
        } else if (name.equals("abs")) {
            return builtinFunctions[INDEX_ABS];
        } else if (name.equals("log")) {
            return builtinFunctions[INDEX_LOG];
        } else if (name.equals("log10")) {
            return builtinFunctions[INDEX_LOG10];
        } else if (name.equals("log2")) {
            return builtinFunctions[INDEX_LOG2];
        } else if (name.equals("log1p")) {
            return builtinFunctions[INDEX_LOG1P];
        } else if (name.equals("ceil")) {
            return builtinFunctions[INDEX_CEIL];
        } else if (name.equals("floor")) {
            return builtinFunctions[INDEX_FLOOR];
        } else if (name.equals("sqrt")) {
            return builtinFunctions[INDEX_SQRT];
        } else if (name.equals("cbrt")) {
            return builtinFunctions[INDEX_CBRT];
        } else if (name.equals("pow")) {
            return builtinFunctions[INDEX_POW];
        } else if (name.equals("exp")) {
            return builtinFunctions[INDEX_EXP];
        } else if (name.equals("expm1")) {
            return builtinFunctions[INDEX_EXPM1];
        } else if (name.equals("signum")) {
            return builtinFunctions[INDEX_SGN];
        } else if (name.equals("max")) {
            return builtinFunctions[INDEX_MAX];
        } else if (name.equals("min")) {
            return builtinFunctions[INDEX_MIN];
        } else if (name.equals("condition")) {
            return builtinFunctions[INDEX_CONDITION];
        } else if (name.equals("len")) {
            return builtinFunctions[INDEX_LEN];
        } else if (name.equals("array_size")) {
            return builtinFunctions[INDEX_ARRAY_SIZE];
        } else if (name.equals("array_sum")) {
            return builtinFunctions[INDEX_ARRAY_SUM];
        } else if (name.equals("split_by_key")) {
            return builtinFunctions[INDEX_SPLIT_BY_KEY];
        }else {
            return null;
        }
    }

}
