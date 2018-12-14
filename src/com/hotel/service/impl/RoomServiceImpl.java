package com.hotel.service.impl;

import java.util.List;
import java.util.Map;

import com.hotel.dao.RoomMapper;
import com.hotel.entity.Room;
import com.hotel.service.RoomService;

public class RoomServiceImpl implements RoomService {

	private RoomMapper roommapper;
	
	public RoomMapper getRoommapper() {
		return roommapper;
	}

	public void setRoommapper(RoomMapper roommapper) {
		this.roommapper = roommapper;
	}

	@Override
	public int deleteByPrimaryKey(String roomnum) {
		int res = roommapper.deleteByPrimaryKey(roomnum);
		return res;
	}

	@Override
	public int insert(Room record) {
		int res = roommapper.insert(record);
		return res;
	}

	@Override
	public int insertSelective(Room record) {
		int res = roommapper.insertSelective(record);
		return res;
	}

	@Override
	public Room selectByPrimaryKey(String roomnum) {
		Room res = roommapper.selectByPrimaryKey(roomnum);
		return res;
	}

	@Override
	public int updateByPrimaryKeySelective(Room record) {
		int res = roommapper.updateByPrimaryKeySelective(record);
		return res;
	}

	@Override
	public int updateByPrimaryKey(Room record) {
		int res = roommapper.updateByPrimaryKey(record);
		return res;
	}
	
	public  List<Room> selectRoomsByNeedDate(Map<String, Object> map)
	{
		List<Room> res = roommapper.selectRoomsByNeedDate(map);
		return res;
	}

}
