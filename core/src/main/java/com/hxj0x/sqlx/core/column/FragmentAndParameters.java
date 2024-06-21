package com.hxj0x.sqlx.core.column;

import java.util.HashMap;
import java.util.Map;

public class FragmentAndParameters {

    private String fragment;
    private Map<String, Object> parameters = new HashMap<>();

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }
}
