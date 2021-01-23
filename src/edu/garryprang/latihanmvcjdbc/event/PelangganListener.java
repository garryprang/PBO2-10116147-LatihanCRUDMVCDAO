/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.garryprang.latihanmvcjdbc.event;

import edu.garryprang.latihanmvcjdbc.entity.Pelanggan;
import edu.garryprang.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author
 * NIM   : 10116147
 * NAMA  : Garry Prang
 * KELAS : PBO-2
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);
}
