/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1043.controller;

import com.kuis.kuis_1043.entity.identitas_1043;
import com.kuis.kuis_1043.service.identitas_1043Service;
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
@RequestMapping("/identitas_1043")
public class identitas_1043Controller {

    @Autowired
    private identitas_1043Service identitas_1043Service;

    @RequestMapping(method = RequestMethod.POST)
    public identitas_1043 insert(@RequestBody identitas_1043 identitas_1043) {
        return identitas_1043Service.insert(identitas_1043);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public identitas_1043 update(@RequestBody identitas_1043 identitas_1043) {
        return identitas_1043Service.update(identitas_1043);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{nim}")
    public boolean delete(@PathVariable("nim") Long nim) {
        return identitas_1043Service.delete(nim);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{nim}")
    public identitas_1043 getById(@PathVariable("nim") Long nim){
        return identitas_1043Service.getById(nim);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<identitas_1043> getAll(){
        return identitas_1043Service.getAll();
    }
}
