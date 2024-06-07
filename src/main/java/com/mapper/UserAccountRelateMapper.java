package com.mapper;

import com.domain.UserAccountRelate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAccountRelateMapper {
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
    int insert(UserAccountRelate record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(UserAccountRelate record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    UserAccountRelate selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UserAccountRelate record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UserAccountRelate record);

    /**
     * 通过绑定选择无crc
     *
     * @param bindNoCrc 绑定无crc
     * @return {@link List }<{@link UserAccountRelate }>
     */
    List<UserAccountRelate> selectByBindNoCrc(@Param("bindNoCrc") Long bindNoCrc);
}