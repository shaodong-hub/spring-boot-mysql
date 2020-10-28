package com.github.mysql.repository;


import com.github.mysql.pojo.orm.EmpInfoDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * <p>
 * 创建时间为 15:54 2019-07-03
 * 项目名称 spring-boot-mysql
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IEmpInfoRepository extends JpaSpecificationExecutor<EmpInfoDO>, JpaRepository<EmpInfoDO, Integer> {

}


