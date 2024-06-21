package com.hxj0x.sqlx.core.column;


import lombok.Getter;
import lombok.Setter;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

@Getter
@Setter
public class SelectColumn {
    private String name; // 重复调用以最后一次调用为准，应该是表达式不是name，参考SQL parser
    private String alias; // 重复调用以最后一次调用为准
    private List<SqlFunction> fns = new ArrayList<>(); // 函数：聚合函数、非聚合函数、操作符
    // private String castType;// cast只能生效一次，重复调用以最后一次调用为准
    private RenderingContext renderingContext = new RenderingContext();
    private FragmentAndParameters otherFragmentAndParameters;
    private FragmentAndParameters selfFragmentAndParameters = new FragmentAndParameters();


    public SelectColumn name(String name) {
        UnaryOperator<String> columnFormat = renderingContext.getColumnFormat();
        this.name = columnFormat.apply(name);
        return this;
    }

    public SelectColumn alias(String alias) {
        this.alias = alias;
        return this;
    }

    public SelectColumn cast(String castType) {
        // this.castType = castType;
        return this;
    }

    public void render() {
        for (SqlFunction fn : fns) {
            fn.render(this);
        }
        String fragment = selfFragmentAndParameters.getFragment() + (alias == null ? "" : " as " + alias);
        selfFragmentAndParameters.setFragment(fragment);
    }


    private SelectColumn toBase64() {
        this.fns.add(new Base64());
        return this;
    }

    public static void main(String[] args) throws JSQLParserException {
        // SelectColumn selectColumn = new SelectColumn();
        // selectColumn
        //         .name("id")
        //         .toBase64()
        //         .cast("varchar")
        //         .alias("uId")
        //         .render();
        // System.out.println(
        //         selectColumn.getSelfFragmentAndParameters().getFragment()
        // );

        Statement statement = CCJSqlParserUtil.parse("select cast(to_base64(id) as unsigned) as uId");
        System.out.println("statement = " + statement);
        System.out.println("statement = " + statement);
    }


}
