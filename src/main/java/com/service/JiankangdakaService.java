package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangdakaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangdakaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangdakaView;


/**
 * 健康打卡
 *
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public interface JiankangdakaService extends IService<JiankangdakaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangdakaVO> selectListVO(Wrapper<JiankangdakaEntity> wrapper);
   	
   	JiankangdakaVO selectVO(@Param("ew") Wrapper<JiankangdakaEntity> wrapper);
   	
   	List<JiankangdakaView> selectListView(Wrapper<JiankangdakaEntity> wrapper);
   	
   	JiankangdakaView selectView(@Param("ew") Wrapper<JiankangdakaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangdakaEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiankangdakaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiankangdakaEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiankangdakaEntity> wrapper);
}
