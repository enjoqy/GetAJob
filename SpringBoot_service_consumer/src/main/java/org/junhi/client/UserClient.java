package org.junhi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author junhi
 * @date 2019/7/19 14:44
 */
@FeignClient(value = "service-provider", fallback = UserClientFallback.class)  // 声明一个接口是feign接口，指定服务的id
public interface UserClient {

    @GetMapping("user/{id}")
     String queryUserById(@PathVariable("id")Integer id);

}
