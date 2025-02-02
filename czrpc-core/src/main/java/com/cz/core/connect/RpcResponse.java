package com.cz.core.connect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * rpc - 返回信息包装
 *
 * @author Zjianru
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RpcResponse<T> implements Serializable {
    boolean status;
    T data;
    Exception exception;
}
