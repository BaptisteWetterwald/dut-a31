package TP_Note.v3.view;

import TD3.controller.Facade;
import TD3.model.BicolorStrategy;
import TD3.model.TrafficLight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CookieObserver extends JFrame implements IObserver
{
    private JLabel[] labels;

    public CookieObserver(CookieTemplate cookie)
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JButton buttonAddChocolate = new JButton("Add a chocolate cookie");
        JButton buttonAddLemon = new JButton("Add a lemon cookie");
        JButton buttonAddBlueberries = new JButton("Add a blueberries cookie");
        this.setTitle("Cookie App");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        buttonAddChocolate.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent actionEvent ) {
                addChocolateCookie();
            }
        } );
        buttonAddLemon.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent actionEvent ) {
                addLemonCookie();
            }
        } );
        buttonAddBlueberries.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent actionEvent ) {
                addBlueberriesCookie();
            }
        } );

        this.setVisible(true);
        this.update(cookie);
    }

    private void addChocolateCookie()
    {

    }

    @Override
    public void update(CookieObserver cookie) {

    }
}
