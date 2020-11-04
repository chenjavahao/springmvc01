package com.kgc.entity;

public class GoodsType {
    private Integer id;

    private String typename;

    public GoodsType(Integer id, String typename) {
        this.id = id;
        this.typename = typename;
    }

    public GoodsType() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}