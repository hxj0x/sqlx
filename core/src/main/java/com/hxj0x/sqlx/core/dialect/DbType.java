package com.hxj0x.sqlx.core.dialect;

/**
 * @author huangxj
 * @since 2024/6/20
 */
public enum DbType {
    /**
     * MYSQL
     */
    MYSQL("mysql", "MySql 数据库");

    /**
     * 数据库名称
     */
    private final String name;

    /**
     * 描述
     */
    private final String remarks;


    DbType(String name, String remarks) {
        this.name = name;
        this.remarks = remarks;
    }

    public String getName() {
        return name;
    }

    public String getRemarks() {
        return remarks;
    }
}
