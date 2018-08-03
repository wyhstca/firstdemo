package com.yanghui.mapper;

import com.yanghui.model.Area;

import java.util.List;

public interface AreaMapper {
    int deleteByPrimaryKey(Integer areaId);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer areaId);

    List<Area> selectAllArea();

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}