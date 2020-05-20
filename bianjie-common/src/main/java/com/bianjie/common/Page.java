package com.bianjie.common;

public class Page {

    protected int pageSize = 15; // 每页显示记录数

    protected long totalPage = 1; // 总页数

    protected long totalResult = 0; // 总记录数

    protected int currentPage = 1; // 当前页

    public Page() {
    }

    public Page(Page page) {
        if (page != null){
            this.pageSize = page.pageSize;
            this.totalPage = page.totalResult/page.pageSize+(page.totalResult%page.pageSize>0?1:0);
            this.totalResult = page.totalResult;
            this.currentPage = page.currentPage;
        }
    }

    public Page(int pageSize, int totalPage, long totalResult, int currentPage) {
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.totalResult = totalResult;
        this.currentPage = currentPage;
    }


    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(long totalResult) {
        this.totalResult = totalResult;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
