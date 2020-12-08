package cn.codingjc.vhr2020.model;

import java.util.List;

public class RespPageBean {

    private long total;
    private List<?> data;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public RespPageBean(long total, List<?> data) {
        this.total = total;
        this.data = data;
    }
}
