package org.junhi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.junhi.pojo.User;

/**
 * @author junhi
 * @date 2019/7/17 19:52
 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
}
