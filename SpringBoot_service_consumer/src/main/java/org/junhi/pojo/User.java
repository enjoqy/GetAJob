package org.junhi.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author junhi
 * @date 2019/7/18 12:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {

    private Integer id;
    private String username;
    private String password;
    private String phone;
    /**
     * 创建时间
     */
    private String created;
    /**
     * 密码加密的salt
     */
    private String salt;

}
