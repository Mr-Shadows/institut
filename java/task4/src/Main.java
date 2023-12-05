import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LabExample extends JFrame
{
    JButton buttonDinamo = new JButton("Dinamo!");
    JButton buttonPariNN = new JButton("Pari NN");
    JButton theEnd = new JButton("The End!");
    JLabel textResult = new JLabel("Result: " );
    JLabel textResultDinamo = new JLabel("0");
    JLabel textResultPariNN = new JLabel("  :  0");
    JLabel textLastScore = new JLabel("Last Score: ");
    Label textWiner = new Label("winer: ");

    public LabExample() {
        //создание окна
        super("Dinamo is winer!");
        setLayout(new FlowLayout());
        setSize(720, 480);
        setVisible(true);

        //переменные

        int pointPariNN = 0;

        //работа с интерфейсом
        setLayout(null);
        // x - позиция по горизонтали
        // y - позиция по вертикали
        // width - размер по горизонтали
        // heigth - размер по вертикали
        buttonDinamo.setBounds(180, 10, 100, 20);
        buttonPariNN.setBounds(540, 10, 100, 20);


        textResult.setBounds(360, 50, 100, 20);
        textLastScore.setBounds(360, 100, 100, 20);
        textResultDinamo.setBounds(405, 50, 100, 20);
        textResultPariNN.setBounds(415, 50, 100, 20);
        textWiner.setBounds(360, 200, 300, 60);
        theEnd.setBounds(360, 150, 100, 20);

        add(buttonDinamo);
        add(buttonPariNN);
        add(textLastScore);
        add(textResult);
        add(textResultDinamo);
        add(textResultPariNN);
        add(textWiner);
        add(theEnd);


        buttonDinamo.addActionListener(new ActionListener() {
            int pointDinamo = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {
                pointDinamo += 1;
                textResultDinamo.setText("" + pointDinamo + " ");
                textLastScore.setText("Dinamo");
            }
        });

        buttonPariNN.addActionListener((new ActionListener() {
            int pointPariNN = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                pointPariNN += 1;
                textResultPariNN.setText("  :  " + pointPariNN);
                textLastScore.setText("Pari NN");
            }
        }));

        theEnd.addActionListener((new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textWiner.setText("Dynamo always wins!");
            }
        }));

    }

    public static void main(String[]args)
    {
        new LabExample();
    }

}