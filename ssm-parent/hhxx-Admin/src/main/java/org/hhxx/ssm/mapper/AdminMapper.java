package org.hhxx.ssm.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hhxx.ssm.entity.Admin;

@Mapper
public interface AdminMapper {
	
	Admin findByNameAndPassword(@Param("name") String name,@Param("password") String password);

}
