/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1043.service;

import com.kuis.kuis_1043.entity.ipk_1043;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kuis.kuis_1043.repo.ipk_1043Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("ipk_1043Service")
@Transactional
public class ipk_1043Service {

    @Autowired
    private ipk_1043Repo repo;

    public ipk_1043 insert(ipk_1043 ipk_1043) {
        return repo.save(ipk_1043);
    }
    
    public ipk_1043 update(ipk_1043 ipk_1043) {
        return repo.save(ipk_1043);
    }
    
    public boolean delete(Long id_ipk){
        repo.delete(id_ipk);
        return true;
    }
    
    public ipk_1043 getById(Long id_ipk){
        return repo.findOne(id_ipk);
    }
    
    public List<ipk_1043> getAll(){
        return repo.findAllipk_1043();
    }
}
