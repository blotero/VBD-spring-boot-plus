package io.geekidea.boot.auth.event;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 管理后台用户下线事件
 **/
@Data
@AllArgsConstructor
public class LoginOfflineEvent {

    /**
     * 用户ID
     */
    private Long userId;

}
