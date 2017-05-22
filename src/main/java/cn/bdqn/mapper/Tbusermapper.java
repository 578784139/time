package cn.bdqn.mapper;

import cn.bdqn.entity.Tbuser;

/**
 * Created by AW on 2017/5/18.
 */
public interface Tbusermapper {
    public Tbuser login(Tbuser users);
    public int add(Tbuser users);
}
