package com.mapper;

import com.domain.UserHandQuestionAnswerVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserHandQuestionAnswerMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(UserHandQuestionAnswerVo record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(UserHandQuestionAnswerVo record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    UserHandQuestionAnswerVo selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UserHandQuestionAnswerVo record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UserHandQuestionAnswerVo record);

    List<UserHandQuestionAnswerVo> selectByUserid(@Param("userid") Long userid);
}