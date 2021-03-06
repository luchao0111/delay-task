package com.caisl.dt.system.util;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * UniqueIdUtil
 *
 * @author caisl
 * @since 2019-05-07
 */
public class UniqueIdUtil {

    private static  AtomicInteger integer = new AtomicInteger(0);
    /**
     * 生成ID
     *
     * @return
     */
    public static Long nextId() {
        //TODO 这里是为了偷懒，使用时间戳作为主键ID，实际过程中推荐使用分布式环境生成唯一ID的策略
       return System.currentTimeMillis() +integer.incrementAndGet();
    }


}
