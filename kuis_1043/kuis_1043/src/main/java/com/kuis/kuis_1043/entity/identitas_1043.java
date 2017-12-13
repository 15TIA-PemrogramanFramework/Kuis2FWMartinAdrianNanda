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
import javax.persistence.ManyToOne;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "identitas_1043")
public class identitas_1043 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nim;
    @Column(length = 100, nullable = true)
    private String nama;
    @Column(length = 255, nullable = true)
    private String kelas;
    
     @ManyToOne
   private ipk_1043 id_ipk;

    public Long getnim() {
        return nim;
    }

    public void setnim(Long nim) {
        this.nim = nim;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getkelas() {
        return kelas;
    }

  
    public void setkelas(String kelas) {
        this.kelas = kelas;
    }

    
    public ipk_1043 getid_ipk() {
        return id_ipk;
    }

    public void setid_ipk(ipk_1043 id_ipk) {
        this.id_ipk = id_ipk;
    }
    /**
     * @return the pelajaran
     */
    
}
