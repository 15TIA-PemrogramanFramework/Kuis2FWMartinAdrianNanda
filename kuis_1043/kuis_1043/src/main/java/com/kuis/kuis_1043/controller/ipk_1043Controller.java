/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1043.controller;

import com.kuis.kuis_1043.entity.ipk_1043;
import com.kuis.kuis_1043.service.ipk_1043Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/ipk_1043")
public class ipk_1043Controller {

    @Autowired
    private ipk_1043Service ipk_1043Service;

    @RequestMapping(method = RequestMethod.POST)
    public ipk_1043 insert(@RequestBody ipk_1043 ipk_1043) {
        return ipk_1043Service.insert(ipk_1043);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ipk_1043 update(@RequestBody ipk_1043 ipk_1043) {
        return ipk_1043Service.update(ipk_1043);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_ipk}")
    public boolean delete(@PathVariable("id_ipk") Long id_ipk) {
        return ipk_1043Service.delete(id_ipk);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_ipk}")
    public ipk_1043 getById(@PathVariable("id_ipk") Long id_ipk){
        return ipk_1043Service.getById(id_ipk);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<ipk_1043> getAll(){
        return ipk_1043Service.getAll();
    }
}
