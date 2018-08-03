package com.yanghui.controller;

import com.yanghui.model.Area;
import com.yanghui.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

@RestController
//@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    //  http://localhost:8083/boot/get?areaId=1
    /*@RequestMapping(value = "/get", produces = {"application/json;charset=UTF-8"})
    public Map<String,Object> getArea(@PathParam("areaId") Integer areaId){
        Map<String,Object> modelMap= new HashMap<String,Object>() ;
        modelMap.put("area",areaService.getArea(areaId));
        return modelMap;
    }*/

    // http://localhost:8083/boot/get/1
    /*@RequestMapping(value = "/get/{areaId}", produces = {"application/json;charset=UTF-8"})
    public Map<String,Object> getAreaApi(@PathVariable Integer areaId){
        Map<String,Object> modelMap= new HashMap<String,Object>() ;
        modelMap.put("area",areaService.getArea(areaId));
        return modelMap;
    }*/

    // http://localhost:8083/boot/get/1
    @RequestMapping(value = "/get/{Id}", produces = {"application/json;charset=UTF-8"})
    public Map<String,Object> getAreaApi(@PathVariable("Id") Integer areaId){
        Map<String,Object> modelMap= new HashMap<String,Object>() ;
        modelMap.put("area",areaService.getArea(areaId));
        return modelMap;
    }






    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public Map<String,Object> addArea(Area area){
        Map<String,Object> modelMap= new HashMap<String,Object>() ;
        modelMap.put("success",areaService.addArea(area));
        return modelMap;
    }
    @RequestMapping(value = "/edit", produces = {"application/json;charset=UTF-8"})
    public Map<String,Object> editArea(Area area){
        Map<String,Object> modelMap= new HashMap<String,Object>() ;
        modelMap.put("success",areaService.addArea(area));
        return modelMap;
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllArea(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return areaService.findAllArea(pageNum,pageSize);
    }
    @GetMapping(value="/del")
    public Map<String,Object> deleteArea(@PathParam("areaId") Integer areaId){
        Map<String,Object> modelMap= new HashMap<String,Object>() ;
        modelMap.put("success",areaService.deleteArea(areaId));
        return modelMap;
    }
    @GetMapping("/test")
    public String Test(){
        return "test";
    }
}