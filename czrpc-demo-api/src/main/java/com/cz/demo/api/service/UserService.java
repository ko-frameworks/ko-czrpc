package com.cz.demo.api.service;

import com.cz.demo.api.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * demo - user interface
 *
 * @author Zjianru
 */
public interface UserService {

    User findById(int id);

    User findById(int id, String name);

    long getId(long id);

    long getId(User user);

    long getId(float id);

    String getName();

    String getName(int id);

    int[] getIds();

    long[] getLongIds();

    int[] getIds(int[] ids);

    List<User> getList(List<User> userList);

    Map<String, User> getMap(Map<String, User> userMap);

}
