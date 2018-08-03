package com.yanghui.service;

import com.yanghui.model.Area;

import java.util.List;


public interface AreaService {
    int addArea(Area area);
    int editArea(Area area);
    List<Area> findAllArea(int pageNum, int pageSize);
    int deleteArea(Integer areaId);
    Area getArea(Integer areaId);
}
