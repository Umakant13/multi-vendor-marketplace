package com.zosh.mapper;

import com.zosh.dto.OrderDto;
import com.zosh.dto.OrderItemDto;
import com.zosh.dto.UserDto;
import com.zosh.model.Order;
import com.zosh.model.OrderItem;
import com.zosh.model.User;

public class UserMapper {

    public static UserDto toUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFullName(user.getFullName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

}
