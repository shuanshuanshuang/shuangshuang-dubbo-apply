package com.atguigu.demo.service;

import com.atguigu.demo.dto.UserDTO;

public interface UserService {

    UserDTO findUserById(Long id);
}
