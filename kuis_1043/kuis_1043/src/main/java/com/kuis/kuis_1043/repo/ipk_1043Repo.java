/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1043.repo;


import com.kuis.kuis_1043.entity.ipk_1043;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface ipk_1043Repo extends CrudRepository<ipk_1043, Long> {

    @Query("select i from ipk_1043 i")
    public List<ipk_1043> findAllipk_1043();
}
