package com.hxj0x.sqlx.core.column;

/**
 * @author huangxj
 * @since 2024/6/20
 */
public class Base64 extends SqlFunction {

    private RenderingContext renderingContext = new RenderingContext();

    @Override
    public void render(SelectColumn column) {
        String format = String.format("to_base64(%s)", column.getName());
        column.getSelfFragmentAndParameters().setFragment(format);
    }
}
