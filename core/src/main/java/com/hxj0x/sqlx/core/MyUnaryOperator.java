package com.hxj0x.sqlx.core;

import java.util.function.UnaryOperator;

interface MyUnaryOperator<T> extends UnaryOperator<T> {
        static String max(String s) {
            return s;
        }
    }