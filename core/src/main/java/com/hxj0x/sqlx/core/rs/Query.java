package com.hxj0x.sqlx.core.rs;


import com.hxj0x.sqlx.core.column.FragmentAndParameters;

import java.util.List;

/**
 * 查询语句
 *
 * @author huangxj
 * @since 2024/6/21
 */
public class Query implements Statement {
    private List<SelectItem> projection;


    @Override
    public FragmentAndParameters getFragmentAndParameters() {
        return null;
    }
}
