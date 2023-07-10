package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TaTeTi extends JFrame {
    public JPanel panel1;
    public JPanel panel2;
    private int turno;
    String ganador;

    public TaTeTi() {
        setSize(450,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ta te ti");
        setLocationRelativeTo(null);
        componentes();
        this.setVisible(true);
    }

    private void componentes(){
        paneles();
        labels();
    }

    private void paneles(){
        panel1 = new JPanel();
        panel1.setBackground(Color.white);;
        panel1.setLayout(null);
        add(panel1);

        panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);;

        panel2.setSize(300,350);
        panel2.setOpaque(true);
        panel2.setLayout(null);
        panel2.setLocation(70,70);
        panel1.add(panel2);

    }

    private void labels(){
        JLabel c1 = new JLabel();
        c1.setOpaque(true);
        c1.setBounds(0,0,90,110);
        c1.setBackground(Color.white);
        c1.setHorizontalAlignment(0);
        Font fuente = new Font("times new roman", Font.BOLD,55);
        c1.setFont(fuente);
        panel2.add(c1);
        JLabel c2 = new JLabel();
        c2.setOpaque(true);
        c2.setBounds(0,125,90,110);
        c2.setBackground(Color.white);
        c2.setHorizontalAlignment(0);
        c2.setFont(fuente);
        panel2.add(c2);
        JLabel c3 = new JLabel();
        c3.setOpaque(true);
        c3.setBounds(0,250,90,110);
        c3.setBackground(Color.white);
        c3.setHorizontalAlignment(0);
        c3.setFont(fuente);
        panel2.add(c3);
        JLabel c4 = new JLabel();
        c4.setOpaque(true);
        c4.setBounds(105,0,90,110);
        c4.setBackground(Color.white);
        c4.setHorizontalAlignment(0);
        c4.setFont(fuente);
        panel2.add(c4);
        JLabel c5 = new JLabel();
        c5.setOpaque(true);
        c5.setBounds(105,125,90,110);
        c5.setBackground(Color.white);
        c5.setHorizontalAlignment(0);
        c5.setFont(fuente);
        panel2.add(c5);
        JLabel c6 = new JLabel();
        c6.setOpaque(true);
        c6.setBounds(105,250,90,110);
        c6.setBackground(Color.white);
        c6.setHorizontalAlignment(0);
        c6.setFont(fuente);
        panel2.add(c6);
        JLabel c7 = new JLabel();
        c7.setOpaque(true);
        c7.setBounds(210,0,90,110);
        c7.setBackground(Color.white);
        c7.setHorizontalAlignment(0);
        c7.setFont(fuente);
        panel2.add(c7);
        JLabel c8 = new JLabel();
        c8.setOpaque(true);
        c8.setBounds(210,125,90,110);
        c8.setBackground(Color.white);
        c8.setHorizontalAlignment(0);
        c8.setFont(fuente);
        panel2.add(c8);
        JLabel c9 = new JLabel();
        c9.setOpaque(true);
        c9.setBounds(210,250,90,110);
        c9.setBackground(Color.white);
        c9.setHorizontalAlignment(0);
        c9.setFont(fuente);
        panel2.add(c9);
        turno = 0;
        JLabel[][] ganadores = {{c1,c2,c3},{c1,c4,c7},{c1,c5,c9},{c2,c5,c8},{c3,c5,c7},{c3,c6,c9},{c4,c5,c6},{c7,c8,c9}};
        JButton reiniciar = new JButton("Reiniciar");
        reiniciar.setBounds(300,20,85,25);
        panel1.add(reiniciar);
        JLabel quienGana = new JLabel();
        quienGana.setBounds(100,20,150,25);
        panel1.add(quienGana);

        reiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ganador = null;
                quienGana.setText("");

                for(int i=0;i<ganadores.length;i++) {
                    for (int j = 0; j < ganadores[i].length; j++) {
                    ganadores[i][j].setBackground(Color.white);
                    ganadores[i][j].setText("");
            }
        }}});

        c1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                if (turno == 0 & c1.getText().isEmpty() & ganador == null ){
                    c1.setText("X");
                    turno  = 1;
                } else if (turno == 1 & c1.getText().isEmpty() & ganador == null) {
                    c1.setText("O");
                    turno = 0;
                }

                for(int i=0;i<ganadores.length;i++) {
                    int cont1 = 0;
                    int cont2 = 0;
                    for (int j = 0; j < ganadores[i].length; j++) {
                        if (ganadores[i][j].getText().equals("X")) {
                            cont1 = cont1 + 1;
                        } else if (ganadores[i][j].getText().equals("O")) {
                            cont2 = cont2 + 1;
                        }
                        if (cont1 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "X";
                            quienGana.setText("el ganador es jugador 1");

                        } else if (cont2 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "O";
                            quienGana.setText("el ganador es jugador 2");
                        }
                    }
                }
            }
        });
        c2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                if (turno == 0 & c2.getText().isEmpty()  & ganador == null){
                    c2.setText("X");
                    turno  = 1;
                } else if (turno == 1 & c2.getText().isEmpty()  & ganador == null) {
                    c2.setText("O");
                    turno = 0;
                }
                for(int i=0;i<ganadores.length;i++) {
                    int cont1 = 0;
                    int cont2 = 0;
                    for (int j = 0; j < ganadores[i].length; j++) {
                        if (ganadores[i][j].getText().equals("X")) {
                            cont1 = cont1 + 1;
                        } else if (ganadores[i][j].getText().equals("O")) {
                            cont2 = cont2 + 1;
                        }
                        if (cont1 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "X";
                            quienGana.setText("el ganador es jugador 1");

                        } else if (cont2 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "O";
                            quienGana.setText("el ganador es jugador 2");
                        }

                    }
                }
            }
        });
        c3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                if (turno == 0 & c3.getText().isEmpty() & ganador == null){
                    c3.setText("X");
                    turno  = 1;
                } else if (turno == 1 & c3.getText().isEmpty()& ganador == null) {
                    c3.setText("O");
                    turno = 0;
                }
                for(int i=0;i<ganadores.length;i++) {
                    int cont1 = 0;
                    int cont2 = 0;
                    for (int j = 0; j < ganadores[i].length; j++) {
                        if (ganadores[i][j].getText().equals("X")) {
                            cont1 = cont1 + 1;
                        } else if (ganadores[i][j].getText().equals("O")) {
                            cont2 = cont2 + 1;
                        }
                        if (cont1 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "X";
                            quienGana.setText("el ganador es jugador 1");

                        } else if (cont2 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "O";
                            quienGana.setText("el ganador es jugador 2");
                        }
                    }
                }
            }
        });
        c4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                if (turno == 0 & c4.getText().isEmpty()& ganador == null ){
                    c4.setText("X");
                    turno  = 1;
                } else if (turno == 1 & c4.getText().isEmpty()& ganador == null) {
                    c4.setText("O");
                    turno = 0;
                }
                for(int i=0;i<ganadores.length;i++) {
                    int cont1 = 0;
                    int cont2 = 0;
                    for (int j = 0; j < ganadores[i].length; j++) {
                        if (ganadores[i][j].getText().equals("X")) {
                            cont1 = cont1 + 1;
                        } else if (ganadores[i][j].getText().equals("O")) {
                            cont2 = cont2 + 1;
                        }
                        if (cont1 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "X";
                            quienGana.setText("el ganador es jugador 1");

                        } else if (cont2 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "O";
                            quienGana.setText("el ganador es jugador 2");
                        }
                    }
                }
            }
        });
        c5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                if (turno == 0 & c5.getText().isEmpty() & ganador == null){
                    c5.setText("X");
                    turno  = 1;
                } else if (turno == 1 & c5.getText().isEmpty() & ganador == null) {
                    c5.setText("O");
                    turno = 0;
                }
                for(int i=0;i<ganadores.length;i++) {
                    int cont1 = 0;
                    int cont2 = 0;
                    for (int j = 0; j < ganadores[i].length; j++) {
                        if (ganadores[i][j].getText().equals("X")) {
                            cont1 = cont1 + 1;
                        } else if (ganadores[i][j].getText().equals("O")) {
                            cont2 = cont2 + 1;
                        }
                        if (cont1 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "X";
                            quienGana.setText("el ganador es jugador 1");

                        } else if (cont2 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "O";
                            quienGana.setText("el ganador es jugador 2");
                        }

                    }
                }
            }
        });
        c6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                if (turno == 0 & c6.getText().isEmpty() & ganador == null){
                    c6.setText("X");
                    turno  = 1;
                } else if (turno == 1 & c6.getText().isEmpty() & ganador == null) {
                    c6.setText("O");
                    turno = 0;
                }
                for(int i=0;i<ganadores.length;i++) {
                    int cont1 = 0;
                    int cont2 = 0;
                    for (int j = 0; j < ganadores[i].length; j++) {
                        if (ganadores[i][j].getText().equals("X")) {
                            cont1 = cont1 + 1;
                        } else if (ganadores[i][j].getText().equals("O")) {
                            cont2 = cont2 + 1;
                        }
                        if (cont1 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "X";
                            quienGana.setText("el ganador es jugador 1");

                        } else if (cont2 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "O";
                            quienGana.setText("el ganador es jugador 2");
                        }

                    }
                }
            }
        });
        c7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                if (turno == 0 & c7.getText().isEmpty() & ganador == null){
                    c7.setText("X");
                    turno  = 1;
                } else if (turno == 1 & c7.getText().isEmpty() & ganador == null) {
                    c7.setText("O");
                    turno = 0;
                }
                for(int i=0;i<ganadores.length;i++) {
                    int cont1 = 0;
                    int cont2 = 0;
                    for (int j = 0; j < ganadores[i].length; j++) {
                        if (ganadores[i][j].getText().equals("X")) {
                            cont1 = cont1 + 1;
                        } else if (ganadores[i][j].getText().equals("O")) {
                            cont2 = cont2 + 1;
                        }
                        if (cont1 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "X";
                            quienGana.setText("el ganador es jugador 1");

                        } else if (cont2 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "O";
                            quienGana.setText("el ganador es jugador 2");
                        }

                    }
                }
            }
        });
        c8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                if (turno == 0 & c8.getText().isEmpty() & ganador == null){
                    c8.setText("X");
                    turno  = 1;
                } else if (turno == 1 & c8.getText().isEmpty() & ganador == null) {
                    c8.setText("O");
                    turno = 0;
                }
                for(int i=0;i<ganadores.length;i++) {
                    int cont1 = 0;
                    int cont2 = 0;
                    for (int j = 0; j < ganadores[i].length; j++) {
                        if (ganadores[i][j].getText().equals("X")) {
                            cont1 = cont1 + 1;
                        } else if (ganadores[i][j].getText().equals("O")) {
                            cont2 = cont2 + 1;
                        }
                        if (cont1 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "X";
                            quienGana.setText("el ganador es jugador 1");

                        } else if (cont2 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "O";
                            quienGana.setText("el ganador es jugador 2");
                        }

                    }
                }
            }
        });
        c9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                if (turno == 0 & c9.getText().isEmpty() & ganador == null){
                    c9.setText("X");
                    turno  = 1;
                } else if (turno == 1 & c9.getText().isEmpty() & ganador == null) {
                    c9.setText("O");
                    turno = 0;
                }
                for(int i=0;i<ganadores.length;i++) {
                    int cont1 = 0;
                    int cont2 = 0;
                    for (int j = 0; j < ganadores[i].length; j++) {
                        if (ganadores[i][j].getText().equals("X")) {
                            cont1 = cont1 + 1;
                        } else if (ganadores[i][j].getText().equals("O")) {
                            cont2 = cont2 + 1;
                        }
                        if (cont1 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "X";
                            quienGana.setText("el ganador es jugador 1");

                        } else if (cont2 == 3) {
                            ganadores[i][0].setBackground(Color.green);
                            ganadores[i][1].setBackground(Color.green);
                            ganadores[i][2].setBackground(Color.green);
                            ganador = "O";
                            quienGana.setText("el ganador es jugador 2");
                        }

                    }
                }
            }
        });
    }
}
