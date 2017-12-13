/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis.kuis_1043.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "ipk_1043")
public class ipk_1043 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ipk;
    @Column(length = 100, nullable = true)
    private String pelajaran;
    @Column(length = 255, nullable = true)
    private String nilai;
    
    
    @Column(length = 255, nullable = true)
   private String  dosen;

    public Long getid_ipk() {
        return id_ipk;
    }

    public void setid_ipk(Long id_ipk) {
        this.id_ipk = id_ipk;
    }

    public String getpelajaran() {
        return pelajaran;
    }

    public void setpelajaran(String pelajaran) {
        this.pelajaran = pelajaran;
    }

    public String getnilai() {
        return nilai;
    }

  
    public void setnilai(String nilai) {
        this.nilai = nilai;
    }

    
    public String getdosen() {
        return dosen;
    }

    public void setdosen(String dosen) {
        this.dosen = dosen;
    }
    /**
     * @return the nama
     */
    
}
