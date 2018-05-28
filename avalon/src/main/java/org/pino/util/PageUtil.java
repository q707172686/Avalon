package org.pino.util;

import java.util.List;

/**
 * @Author: Pino
 * @Description: 用来分页用的PageUtil类, T是页码中需要展示的封装对象
 * @Date: 下午8:57 18-5-28
 * @Modified:
 */
public class PageUtil<T> {

    /**
     * 每页展示的数量
     */
    private Integer pageSize;

    /**
     * 总页数，从缓存中拿
     */
    private Integer totalPage;

    /**
     * 当前页码
     */
    private Integer currentPage;

    /**
     * 下一页页码
     */
    private Integer nextPage;

    /**
     * 前一页页码
     */
    private Integer prePage;

    /**
     * 本页展示的所有对象
     */
    private List<T> values;

    /**
     * 初始化各个参数
     *
     * @param totalPage   总的页码
     * @param currentPage 当前页码
     * @param pageSize    一页的容量
     * @param values      一页的展示数据
     */
    PageUtil(Integer totalPage, Integer currentPage, Integer pageSize, List<T> values) {
        this.totalPage = totalPage;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.values = values;
        this.nextPage = currentPage + 1 > totalPage ? 1 : currentPage + 1;
        this.prePage = currentPage - 1 < 1 ? totalPage : currentPage - 1;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public Integer getPrePage() {
        return prePage;
    }

    public List<T> getValues() {
        return values;
    }
}
