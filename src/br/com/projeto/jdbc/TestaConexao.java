/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.jdbc;

import javax.swing.JOptionPane;

/**
 *
 * @author Charlie
 */
public class TestaConexao {
    public static void main(String[] args) {
        try {
            new ConexaoBanco().conecta();
            JOptionPane.showMessageDialog(null, "conectado com sucesso! ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"um erro aconteceu ao conectar ao banco de dados!"+ e);
        }
    }
 
}
