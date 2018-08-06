package com.example.demo4.service;

import com.example.demo4.bean.Area;


import java.util.List;


public interface AreaService {
    List<Area> getAreaList();
    Area getAreaById(int areaId);
    boolean addArea(Area area);
    boolean modifyArea(Area area);
    boolean deleteArea(int areaId);
}
