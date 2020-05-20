package com.bianjie.common;

/**
 * @author linmingxi
 * 2020/05/20
 **/
public class PageResult<T> extends Page {

    private T content;

    public PageResult(T content) {
        this.content = content;
    }

    public PageResult(T content,Page page) {
        super(page);
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
