package com.hxj0x.sqlx.core.rs;

import com.hxj0x.sqlx.core.column.FragmentAndParameters;

/**
 * 标记接口，sql语句必须实现此接口
 *
 * @author huangxj
 * @since 2024/6/21
 */
public interface Statement {
    FragmentAndParameters getFragmentAndParameters();
}
