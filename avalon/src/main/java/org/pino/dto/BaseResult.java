package org.pino.dto;

import java.io.Serializable;

/**
 * @Author: Pino
 * @Description: AJAX请求返回类型的封装JSON结果
 * @Date: 下午3:27 18-5-29
 * @Modified:
 */
public final class BaseResult<T> implements Serializable {
    /**
     * 序列号
     */
    private static final long serialVersionUID = -4185151304730685014L;

    /**
     * 是否响应成功
     */
    private Boolean success;

    /**
     * 需要返回的数据
     */
    private T data;

    /**
     * 失败返回的信息
     */
    private String error;

    /**
     * 响应成功的构造器
     *
     * @param success 是否响应成功
     * @param data    返回的data
     */
    public BaseResult(Boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    /**
     * 响应失败的构造器
     *
     * @param success 是否响应成功
     * @param error   失败的信息
     */
    public BaseResult(Boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    /**
     * 重写toString()方法，方便测试
     * @return 一个包含了类字段内容的字符串
     */
    @Override
    public String toString() {
        return "BaseResult{" +
                "success=" + success +
                ", data=" + data +
                ", error='" + error + '\'' +
                '}';
    }
}
