package com.hxj0x.sqlx.core.context;

import com.hxj0x.sqlx.core.context.examples.WithCtx;
import org.apache.ibatis.jdbc.SQL;

import static com.hxj0x.sqlx.core.context.examples.WithCtx.age;

/**
 * 少打几个字，补全友好的写法
 * @author huangxj
 * @since 2024/6/25
 */
public class CustomExample {

    interface UserMapper {
        void query(WithCtx ctx);

    }


    public static void main(String[] args) {
        // 使用匿名内部类，这样可以获取上下文，补全更加容易
        new WithCtx() {{
            select(password, userName);
            select(password, userName);
            select2(age);
        }};

        new WithCtx() {
        }.select2(age);

        UserMapper userMapper = new UserMapper() {
            @Override
            public void query(WithCtx ctx) {

            }
        };

        userMapper.query(new WithCtx() {
            {
                select(password, userName);
            }
        });

        new SQL() {{
            SELECT("");
        }};
    }
}
