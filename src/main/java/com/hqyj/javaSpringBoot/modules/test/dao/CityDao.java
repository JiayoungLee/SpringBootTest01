package com.hqyj.javaSpringBoot.modules.test.dao;

import com.hqyj.javaSpringBoot.modules.test.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * author  Jayoung
 * createDate  2020/8/11 0011 16:34
 * version 1.0
 */
@Repository
@Mapper
public interface CityDao {


    @Select("select * from m_city where country_id=#{countryId}")
    List<City> getCountryByCountryId(int countryId);
}
