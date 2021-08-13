package com.jeramtough.jtweb.component.bebezium.publisher;

import java.util.Objects;

/**
 * <pre>
 * Created on 2021/8/12 下午11:41
 * by @author WeiBoWen
 * </pre>
 */
public enum PublisherType {

    /**
     * EVENT BUS
     */
    EVENT_BUS(0),

    /**
     * redis
     */
    REDIS(1);


    private final int value;

    PublisherType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static PublisherType toPublisherType(int value) {
        PublisherType publisherType = null;
        for (PublisherType type : PublisherType.values()) {
            if (type.getValue() == value) {
                publisherType = type;
                break;
            }
        }
        Objects.requireNonNull(publisherType);
        return publisherType;
    }
}
