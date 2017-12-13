/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1043.repo;

import com.kuis.kuis_1043.entity.identitas_1043;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Hendro Steven
 */
public interface identitas_1043Repo extends CrudRepository<identitas_1043, Long> {


    
    
     @Query("select p from identitas_1043 p")
    public List<identitas_1043> findAllidentitas_1043();
    
    @Query("select p from identitas_1043 p where p.id_ipk.id_ipk= :id_ipk")
    public List<identitas_1043> findByid_ipk(@Param("id_ipk") Long id_ipk);
    
    @Query("select p from identitas_1043 p where LOWER(p.nama) LIKE LOWER(:nama)")
    public List<identitas_1043> findByNama(@Param("nama") String nama);
}
