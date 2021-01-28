package com.example.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yaojun
 * @create 2021-01-28 22:32
 */
@AllArgsConstructor
@Data
public class Info {
    private int id;
    private String name;
    private int pwd;
}
