package com.dcy.nettytest.repository;

import java.util.List;

/**
 * @author A
 */
public interface UserGroupRepository {

    List<Integer> findGroupIdByUserId(Integer userId);

}
