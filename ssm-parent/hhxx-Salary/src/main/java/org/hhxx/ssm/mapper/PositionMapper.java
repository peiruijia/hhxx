package org.hhxx.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hhxx.ssm.entity.Position;

@Mapper
public interface PositionMapper {

	List<Position> findByDeptId(@Param("deptId") Integer deptId);
	
}
