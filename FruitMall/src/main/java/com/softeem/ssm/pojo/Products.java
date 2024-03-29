package com.softeem.ssm.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Products implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_products.id
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_products.img_path
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    private String imgPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_products.name
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_products.new_price
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    private BigDecimal newPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_products.old_price
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    private BigDecimal oldPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_products
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_products.id
     *
     * @return the value of t_products.id
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_products.id
     *
     * @param id the value for t_products.id
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_products.img_path
     *
     * @return the value of t_products.img_path
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_products.img_path
     *
     * @param imgPath the value for t_products.img_path
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_products.name
     *
     * @return the value of t_products.name
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_products.name
     *
     * @param name the value for t_products.name
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_products.new_price
     *
     * @return the value of t_products.new_price
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    public BigDecimal getNewPrice() {
        return newPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_products.new_price
     *
     * @param newPrice the value for t_products.new_price
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    public void setNewPrice(BigDecimal newPrice) {
        this.newPrice = newPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_products.old_price
     *
     * @return the value of t_products.old_price
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_products.old_price
     *
     * @param oldPrice the value for t_products.old_price
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_products
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Products other = (Products) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getImgPath() == null ? other.getImgPath() == null : this.getImgPath().equals(other.getImgPath()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNewPrice() == null ? other.getNewPrice() == null : this.getNewPrice().equals(other.getNewPrice()))
            && (this.getOldPrice() == null ? other.getOldPrice() == null : this.getOldPrice().equals(other.getOldPrice()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_products
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getImgPath() == null) ? 0 : getImgPath().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNewPrice() == null) ? 0 : getNewPrice().hashCode());
        result = prime * result + ((getOldPrice() == null) ? 0 : getOldPrice().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_products
     *
     * @mbggenerated Sun Oct 22 16:14:48 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", imgPath=").append(imgPath);
        sb.append(", name=").append(name);
        sb.append(", newPrice=").append(newPrice);
        sb.append(", oldPrice=").append(oldPrice);
        sb.append("]");
        return sb.toString();
    }
}