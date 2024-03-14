package com.kpit.demo19.Layer3;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kpit.demo19.Layer2.Mobile;


@Repository
public interface MobileRepository extends CrudRepository<Mobile,Integer> {
    Mobile findById(int id);
    List<Mobile> findAll();
}
