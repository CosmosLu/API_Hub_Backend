package com.lukai.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lukai.project.model.InterfaceInfo;
import com.lukai.project.service.InterfaceInfoService;
import com.lukai.project.mapper.InterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author LU KAI
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-07-19 10:58:08
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{

}




