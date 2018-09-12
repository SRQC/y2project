package com.zb.dao;

import com.zb.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author SRQCDWB
 * @create 2018-09-12 14:49
 */
public interface UserDao {

    /**
     * 查询全部用户
     * @return
     */
    public List<User> findUsers(Map<String, Object> param);

    /**
     * 根据id查询对象
     * @param id
     * @return
     */
    public User findById(int id);
    /**
     * 新增
     * @param u
     * @return
     */
    public int seav(User u);

    /**
     * 删除
     * @param id
     * @return
     */
    public int del(int id);

    /**
     * 修改
     * @param u
     * @return
     */
    public int uodate(User u);

    /***
     * 查询总记录数
     * @return
     */
    public int findUserCount(Map<String, Object> param);

    /**
     * 修改当前用户密码
     * @param user
     * @return
     */
    public int updatePwd(User user);
}
