package com.github.mysql.repository;

import com.github.mysql.pojo.orm.GroupInfoDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.Stream;

/**
 * <p>
 * 创建时间为 下午8:44 2020/2/13
 * 项目名称 spring-boot-mysql
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IGroupInfoRepository extends JpaRepository<GroupInfoDO, Long> {

}