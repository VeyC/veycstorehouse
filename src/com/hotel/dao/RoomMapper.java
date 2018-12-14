package com.hotel.dao;

import java.util.List;
import java.util.Map;

import com.hotel.entity.Room;

public interface RoomMapper {
    int deleteByPrimaryKey(String roomnum);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(String roomnum);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
    
    List<Room> selectRoomsByNeedDate(Map<String, Object> map);
}