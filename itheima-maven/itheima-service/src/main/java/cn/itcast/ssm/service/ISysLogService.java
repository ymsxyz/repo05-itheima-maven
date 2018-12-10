package cn.itcast.ssm.service;

import cn.itcast.ssm.domain.SysLog;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ISysLogService {

    void save(SysLog sysLog) throws Exception;

    //查询所有日志记录
    @Select("select * from syslog")
    List<SysLog> findAll() throws Exception;
}
