package org.appgrafica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.border.EmptyBorder;


public class Ventana extends JFrame {
	
	private JPanel contentPane = new JPanel();
	
	
	private JButton botonAcep = new JButton("Acceptar");
	private JButton botonNeteja = new JButton("Netejar");
	private JButton botonSalir = new JButton("Sortir");
	
	private JCheckBox JCB_estudiant = new JCheckBox("Estudiant");
	private JCheckBox JCB_atur = new JCheckBox("Està en el atur");
	private JCheckBox JCB_treballador = new JCheckBox("Treballador");
	private JCheckBox JCB_sexe = new JCheckBox("Sexe");
	private JComboBox<String> JC_sexe = new JComboBox<String>();
	
	
	
	
	
	
	
	
	
	
	
	
	public Ventana() {
		try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
		
		
		
		
		
	}

	
	
	private void jbInit() throws Exception {
		this.setDefaultCloseOperation( Ventana.EXIT_ON_CLOSE );
		 //this.getContentPane().add( new Ventana(),BorderLayout.CENTER );
		 //this.setSize( 1000,1000 );
		this.setVisible(true);
		this.setResizable(false);
		 
		this.setBounds(100, 100, 320, 350);
		 
		 
		
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			
		contentPane.setLayout(null);
		this.setContentPane(contentPane);
		 
		
		
		
		JCB_estudiant.setBounds(11, 40, 97, 29);
		this.getContentPane().add(JCB_estudiant);
		
		 
		
		JCB_atur.setBounds(11, 90, 126, 45);
		this.getContentPane().add(JCB_atur);
		
		
		
		 
		 
		 
		
		JCB_treballador.setBounds(11, 150, 97, 29);
		this.getContentPane().add(JCB_treballador);
		
		
		
		
		
		JCB_sexe.setBounds(11, 210, 97, 29);
		this.getContentPane().add(JCB_sexe);
		
		
		JC_sexe.setBounds(110, 210, 97, 29);
		this.getContentPane().add(JC_sexe);
		JC_sexe.setModel(new DefaultComboBoxModel(new String[]{"Home","Dona"}));
		JC_sexe.setVisible(false);
		
		
		
		
		
		//botones
		
		botonAcep.setBounds(11, 280, 90, 20);
		this.getContentPane().add(botonAcep);
		
		
		
		
		botonNeteja.setBounds(110, 280, 90, 20);
		this.getContentPane().add(botonNeteja);
		
		
		
		botonSalir.setBounds(210, 280, 90, 20);
		this.getContentPane().add(botonSalir);
		
		
		
		
		
		
		
		
		//Eventos

		
		
		JCB_estudiant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JCB_atur.setSelected(false);
				JCB_treballador.setSelected(false);
            }
        });
		
		
		JCB_atur.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JCB_estudiant.setSelected(false);
				JCB_treballador.setSelected(false);
            }
        });
		
		JCB_treballador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JCB_atur.setSelected(false);
				JCB_estudiant.setSelected(false);
            }
        });
		 
		
		
		JCB_sexe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(JCB_sexe.isSelected()){
            		JC_sexe.setVisible(true);
            	}
            	else{
            		JC_sexe.setVisible(false);
            	}
            }
        });
		
		
		
		
		
		
		
		botonNeteja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JCB_atur.setSelected(false);
				JCB_estudiant.setSelected(false);
				JCB_treballador.setSelected(false);
				JCB_sexe.setSelected(false);
            	JC_sexe.setVisible(false);
            }
        });
		
		
		
		
		
		
		botonSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
