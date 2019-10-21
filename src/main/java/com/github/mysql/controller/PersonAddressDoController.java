package com.github.mysql.controller;

import com.github.mysql.pojo.PersonAddressDO;
import com.github.mysql.repository.IPersonAddressDoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 21:40 2019-07-03
 * 项目名称 spring-boot-mysql
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@RestController
public class PersonAddressDoController {

    @Resource
    private IPersonAddressDoRepository repository;

    @GetMapping("/address/{id}")
    public PersonAddressDO getAddress(@PathVariable Integer id) {
        return repository.findById(id).orElseGet(PersonAddressDO::new);
    }

    @PostMapping("/address")
    public PersonAddressDO save(@RequestBody PersonAddressDO personAddressDO) {
        return repository.save(personAddressDO);
    }

}
