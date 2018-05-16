package com.hstd.exchange.entity.dao;

import com.hstd.exchange.entity.model.Associator;
import com.hstd.exchange.entity.model.AssociatorExample;
import com.hstd.exchange.entity.model.AssociatorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssociatorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PJ_ASSOCIATOR
     *
     * @mbggenerated
     */
    int countByExample(AssociatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PJ_ASSOCIATOR
     *
     * @mbggenerated
     */
    int deleteByExample(AssociatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PJ_ASSOCIATOR
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(AssociatorKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PJ_ASSOCIATOR
     *
     * @mbggenerated
     */
    int insert(Associator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PJ_ASSOCIATOR
     *
     * @mbggenerated
     */
    int insertSelective(Associator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PJ_ASSOCIATOR
     *
     * @mbggenerated
     */
    List<Associator> selectByExample(AssociatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PJ_ASSOCIATOR
     *
     * @mbggenerated
     */
    Associator selectByPrimaryKey(AssociatorKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PJ_ASSOCIATOR
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Associator record, @Param("example") AssociatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PJ_ASSOCIATOR
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Associator record, @Param("example") AssociatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PJ_ASSOCIATOR
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Associator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PJ_ASSOCIATOR
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Associator record);
}