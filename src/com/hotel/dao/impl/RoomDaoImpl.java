package com.hotel.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.hotel.dao.RoomMapper;
import com.hotel.entity.Room;
import com.hotel.util.SessionFactory;

public class RoomDaoImpl extends SessionFactory implements RoomMapper {

	@Override
	public int deleteByPrimaryKey(String roomnum) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			RoomMapper roomapper = session.getMapper(RoomMapper.class);  
			roomapper.deleteByPrimaryKey(roomnum);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}

	@Override
	public int insert(Room record) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			RoomMapper roomapper = session.getMapper(RoomMapper.class);  
			roomapper.insert(record);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}

	@Override
	public int insertSelective(Room record) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			RoomMapper roomapper = session.getMapper(RoomMapper.class);  
			roomapper.insertSelective(record);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}

	@Override
	public Room selectByPrimaryKey(String roomnum) {
		SqlSession session = sqlSessionFactory.openSession();
		Room room = new Room();
		try {
			RoomMapper roomapper = session.getMapper(RoomMapper.class);  
			room = roomapper.selectByPrimaryKey(roomnum);
	        session.commit();
        } finally {
            session.close();
        }
		return room;
	}

	@Override
	public int updateByPrimaryKeySelective(Room record) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			RoomMapper roomapper = session.getMapper(RoomMapper.class);  
			roomapper.updateByPrimaryKeySelective(record);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Room record) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			RoomMapper roomapper = session.getMapper(RoomMapper.class);  
			roomapper.updateByPrimaryKey(record);
	        session.commit();
        } finally {
            session.close();
        }
		return 0;
	}
	
	public List<Room> selectRoomsByNeedDate(Map<String, Object> map)
	{
		SqlSession session = sqlSessionFactory.openSession();
		List<Room> rooms = new ArrayList<Room>();
		try {
			RoomMapper roomapper = session.getMapper(RoomMapper.class);  
			rooms = roomapper.selectRoomsByNeedDate(map);
	        session.commit();
        } finally {
            session.close();
        }
		return rooms;
	}

}
