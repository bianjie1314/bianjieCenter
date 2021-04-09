package com.dhd.third.jingdong.mapper;

import com.dhd.third.jingdong.pojo.DhdJdDownDirect;
import com.dhd.third.jingdong.pojo.DhdJdDownDirectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DhdJdDownDirectMapper {
    int countByExample(DhdJdDownDirectExample example);

    int deleteByExample(DhdJdDownDirectExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(DhdJdDownDirect record);

    int insertSelective(DhdJdDownDirect record);

    List<DhdJdDownDirect> selectByExample(DhdJdDownDirectExample example);

    DhdJdDownDirect selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") DhdJdDownDirect record, @Param("example") DhdJdDownDirectExample example);

    int updateByExample(@Param("record") DhdJdDownDirect record, @Param("example") DhdJdDownDirectExample example);

    int updateByPrimaryKeySelective(DhdJdDownDirect record);

    int updateByPrimaryKey(DhdJdDownDirect record);
}