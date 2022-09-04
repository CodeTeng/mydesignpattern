package com.lt.designpattern.responsibilitychain;

import lombok.Data;

/**
 * @description: 解决问题的抽象类
 * @author: ~Teng~
 * @date: 2022/9/4 12:34
 */
@Data
public abstract class Support {
    /**
     * 解决问题的实例的名字
     */
    private String name;

    /**
     * 推卸给的对象
     */
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    /**
     * 解决问题的步骤
     */
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            // 推卸责任
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + "问题已被解决" + this);
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + "问题不能被解决" + this);
    }

}
