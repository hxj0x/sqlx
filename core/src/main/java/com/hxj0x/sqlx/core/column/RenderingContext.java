package com.hxj0x.sqlx.core.column;

import java.util.function.UnaryOperator;

/**
 * @author huangxj
 * @since 2024/6/20
 */
public class RenderingContext {

    private UnaryOperator<String> columnFormat = UnaryOperator.identity();

    private boolean isAliasWithAs = true;

    public boolean isAliasWithAs() {
        return isAliasWithAs;
    }

    public void setAliasWithAs(boolean aliasWithAs) {
        isAliasWithAs = aliasWithAs;
    }

    public void setColumnFormat(UnaryOperator<String> columnFormat) {
        this.columnFormat = columnFormat;
    }

    public UnaryOperator<String> getColumnFormat() {
        return columnFormat;
    }
}
