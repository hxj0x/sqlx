package com.hxj0x.sqlx.core.context.examples;

/**
 * @author huangxj
 * @since 2024/6/25
 */
public abstract class WithCtx {
    public static final String userName = "";
    public static final String password = "";

    public void select(String... columns) {

    }

    public void select2(Column2... columns) {

    }

    public static class Column2 {
        private String name;
        private String alias;

        public Column2(String name, String alias) {
            this.name = name;
            this.alias = alias;
        }
    }

    public static Column2 name = new Column2("name", "n");
    public static Column2 age = new Column2("age", "a");
}
