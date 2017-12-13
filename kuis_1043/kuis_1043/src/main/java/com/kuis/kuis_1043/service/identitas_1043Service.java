/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1043.service;

import com.kuis.kuis_1043.entity.identitas_1043;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kuis.kuis_1043.repo.identitas_1043Repo;


/**
 *
 * @author Hendro Steven
 */
@Service("identitas_1043Service")
@Transactional
public class identitas_1043Service {

    @Autowired
    private identitas_1043Repo repo;

    public identitas_1043 insert(identitas_1043 identitas_1043) {
        return repo.save(identitas_1043);
    }
    
    public identitas_1043 update(identitas_1043 identitas_1043) {
        return repo.save(identitas_1043);
    }
    
    public boolean delete(Long nim){
        repo.delete(nim);
        return true;
    }
    
    public identitas_1043 getById(Long nim){
        return repo.findOne(nim);
    }
    
     public List<identitas_1043> findByid_ipk(Long id_ipk) {
        return repo.findByid_ipk(id_ipk);
    }

    public List<identitas_1043> findByNama(String nama) {
        return repo.findByNama("%" + nama + "%");
    }
    
    public List<identitas_1043> getAll(){
        return repo.findAllidentitas_1043();
    }
}
