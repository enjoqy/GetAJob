package org.junhi.client;

import org.springframework.stereotype.Component;

/**
 * @author junhi
 * @date 2019/7/19 15:00
 */
@Component
public class UserClientFallback implements UserClient {

    @Override
    public String queryUserById(Integer id) {
        return "服务器正忙，请稍后再试！";
    }
}
