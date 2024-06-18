package com.hxj0x.sqlx.core;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class SqlxMain {

    public static class SqlX {
        public static FormX select(UnaryOperator<SelectX> s) {
            return new FormX();
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

    public static void main(String[] args) {
        SqlX.select(s -> s
                        .raw("id")
                        .raw("name")
                        .raw("age"))
                .form(f -> f
                        .raw("user"));

        SqlX.select(s -> s.raw("distinct id")).form(f -> f.raw("user"));
    }
}
