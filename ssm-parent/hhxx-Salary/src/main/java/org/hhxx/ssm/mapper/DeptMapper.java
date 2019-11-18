package org.hhxx.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.hhxx.ssm.entity.Dept;

@Mapper
public interface DeptMapper {

	List<Dept> findAll();

}
