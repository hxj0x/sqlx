package com.hxj0x.sqlx.core;

import net.sf.jsqlparser.JSQLParserException;

import java.util.function.UnaryOperator;

// import static com.hxj0x.sqlx.core.SqlxMain.MyUnaryOperator.max;

public class SqlxMain {

    public static class SqlX {
        public static FormX select(MyUnaryOperator<SelectX> s) {
            return new FormX();
        }

        public static SelectX select() {
            return new SelectX();
        }
    }


    public static class SelectX {
        public SelectX raw(String raw) {
            return this;
        }
    }

    public static class FormX {
        public void form(UnaryOperator<FormX> f) {

        }

        public FormX raw(String raw) {
            return this;
        }
    }

    public static void main(String[] args) throws JSQLParserException {
        // SqlX.select(s -> s
        //                 .raw(MyUnaryOperator.max("id"))
        //                 .raw("name")
        //                 .raw("age"))
        //         .form(f -> f
        //                 .raw("user"));
        //
        // SqlX.select(s -> s.raw("distinct id")).form(f -> f.raw("user"));
        SqlX.select()
                .raw("id")
                .raw("id")
                .raw("id");

        SqlX.select(s -> s
                        .raw(MyUnaryOperator.max("id"))
                        .raw("name")
                        .raw("age"))
                .form(f -> f
                        .raw("user"));
    }
}
