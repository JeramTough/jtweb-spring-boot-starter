package com.jeramtough.jtweb.model.params;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>
 * Created on 2021/8/25 上午1:32
 * by @author WeiBoWen
 * </pre>
 */
public class DeleteByIdsParams implements Serializable {

    private static final long serialVersionUID = 2487333482854664571L;

    private List<Serializable> ids;

    public List<Serializable> getIds() {
        return ids;
    }

    public void setIds(List<Serializable> ids) {
        this.ids = ids;
    }
}
