package com.qianfeng.dao;

import com.qianfeng.po.Policy;
import com.qianfeng.po.PolicyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PolicyMapper {
    int countByExample(PolicyExample example);

    int deleteByExample(PolicyExample example);

    int deleteByPrimaryKey(Integer poId);

    int insert(Policy record);

    int insertSelective(Policy record);

    List<Policy> selectByExample(PolicyExample example);

    Policy selectByPrimaryKey(Integer poId);

    int updateByExampleSelective(@Param("record") Policy record, @Param("example") PolicyExample example);

    int updateByExample(@Param("record") Policy record, @Param("example") PolicyExample example);

    int updateByPrimaryKeySelective(Policy record);

    int updateByPrimaryKey(Policy record);
}