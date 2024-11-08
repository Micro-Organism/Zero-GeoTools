package com.zero.geotools.service;


import com.zero.geotools.common.geotools.ShpTools;
import com.zero.geotools.common.pojos.ShpDatas;
import com.zero.geotools.common.pojos.ShpInfo;
import com.zero.geotools.common.result.ResponseMessage;
import com.zero.geotools.common.result.ResponseResult;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;


@Service
public class ShpService {

    public ResponseResult getShpDatas(String shpPath, Integer limit) throws Exception {
        ShpDatas shpDatas = ShpTools.readShpByPath(shpPath, limit);
        return new ResponseResult(ResponseMessage.OK, shpDatas);
    }

    public void showShp(String shpPath, String imagePath, String color, HttpServletResponse response) throws Exception {
        ShpTools.shp2Image(shpPath, imagePath, color, response);
    }

    public ResponseResult writeShp(ShpInfo shpInfo) throws Exception {
        return ShpTools.writeShpByGeom(shpInfo);
    }
}
