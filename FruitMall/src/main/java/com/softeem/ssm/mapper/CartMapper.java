package com.softeem.ssm.mapper;

import com.softeem.ssm.pojo.Cart;
import com.softeem.ssm.pojo.CartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    int countByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    int deleteByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    int insert(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    int insertSelective(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    List<Cart> selectByExample(CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    Cart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    int updateByPrimaryKeySelective(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    int updateByPrimaryKey(Cart record);
}