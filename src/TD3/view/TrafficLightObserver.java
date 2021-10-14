package TD3.view;

import TD3.controller.Facade;
import TD3.model.BicolorStrategy;
import TD3.model.TrafficLight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightObserver extends JFrame implements IObserver
{
    private JLabel[] labels;

    public TrafficLightObserver(TrafficLight trafficLight, Facade facade)
    {
        JPanel columnPanel = new JPanel();
        int nbLabels = 3;
        if (trafficLight.getLightStrategy() instanceof BicolorStrategy)
            nbLabels = 2;
        labels = new JLabel[nbLabels];

        this.setTitle("TrafficLight (" + trafficLight.getLightStrategyName() + ")");
        this.setSize(400, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        columnPanel.setLayout(new GridLayout(0, 1));
        for (int i=0; i<labels.length; i++)
        {
            labels[i] = new JLabel("");
            labels[i].setOpaque(true);
            columnPanel.add(labels[i]);
        }

        JPanel linePanel = new JPanel();
        linePanel.setLayout(new GridLayout(1,0));
        JButton nextColorButton = new JButton("➼");
        nextColorButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent actionEvent ) {
                facade.changeColor();
            }
        } );
        JButton changeStateButton = new JButton("\uD83D\uDD06");
        changeStateButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent actionEvent ) {
                trafficLight.changeState();
            }
        } );

        linePanel.add(nextColorButton);
        linePanel.add(changeStateButton);

        columnPanel.add(linePanel);
        this.setContentPane(columnPanel);
        this.setVisible(true);
        this.update(trafficLight);
    }

    public void update(TrafficLight trafficLight)
    {
        Color color = Color.BLACK;
        int index = 0;

        if (trafficLight.isLit())
        {
            switch (trafficLight.getLightColor())
            {
                case GREEN:
                    color = new Color(127,255,0);
                    break;
                case ORANGE:
                    color = new Color(255,165,0);
                    index = 1;
                    break;
                case RED:
                    color = new Color(255,0,0);
                    index = 2;
                    if (trafficLight.getLightStrategy() instanceof BicolorStrategy)
                        index = 1;
                    break;
            }

            for (int i=0; i<labels.length; i++)
            {
                if (i == index)
                    labels[i].setBackground(color);
                else
                    labels[i].setBackground(Color.BLACK);
            }
        }
        else
        {
            for (int i=0; i<labels.length; i++)
            {
                labels[i].setBackground(Color.BLACK);
            }
        }
    }
}
