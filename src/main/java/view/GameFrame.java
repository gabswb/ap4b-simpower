package main.java.view;

import main.java.patterns.InformationObserver;

import javax.swing.*;
import java.awt.*;

/**
 * Classe qui permet d'afficher la fenêtre principale du jeu
 */
public class GameFrame extends JFrame {

    private MapPanel mapPanel;//< panel permettant d'afficher la Map
    private InformationPanel informationPanel;//< panel permettant d'afficher les données globales

    public GameFrame(MapViewable mapPanel, InformationObserver informationPanel) {
        super();
        this.setTitle("Simpower");
        this.mapPanel = (MapPanel) mapPanel;
        this.informationPanel = (InformationPanel) informationPanel;


        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.add(this.informationPanel, BorderLayout.NORTH);
        this.add(this.mapPanel, BorderLayout.SOUTH);
        this.pack();
    }
}