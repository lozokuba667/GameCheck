import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Iterator;
import java.util.Vector;

public class My_Played_Page extends JFrame {
    private JPanel panel_play;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JComboBox comboBox1;
    private JRadioButton fightingRadioButton;
    private JRadioButton metroidvaniaRadioButton;
    private JRadioButton MOBARadioButton;
    private JRadioButton platformerRadioButton;
    private JRadioButton puzzleRadioButton;
    private JRadioButton rougelikeRadioButton;
    private JRadioButton RTSRadioButton;
    private JRadioButton sandboxRPGRadioButton;
    private JRadioButton shooterRadioButton;
    private JRadioButton sportRadioButton;
    private JRadioButton steathRadioButton;
    private JRadioButton survivalRadioButton;
    private JRadioButton survivalHorrorRadioButton;
    private JRadioButton tactical_RPGRadioButton;
    private JLabel error_title;
    private JLabel error_ser;
    private JLabel error_type;
    private JButton dodajButton;
    private JButton wyczyśćButton;
    private JButton zapiszButton;
    private JButton odczytZPlikuTODOButton;
    private JButton aktualizujButton;
    private JTable table1;
    private JLabel counter_label;
    private JLabel error_val;
    private JLabel error_cre;
    private JLabel error_act;
    private JLabel error_range;
    private JRadioButton action_RPGRadioButton;
    private JRadioButton adventureRadioButton;
    private ButtonGroup group = new ButtonGroup();
    private JFileChooser fileChooser = new JFileChooser(new File("."));



    enum FieldType {
        title,serious,value,creator
    }

    private void saveTable() {
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            savetable(fileChooser.getSelectedFile());
        }
    }

    private void savetable( File file) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            DefaultTableModel model = (DefaultTableModel)table1.getModel();
            out.writeObject(model.getDataVector());
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadTable() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            loadtable(fileChooser.getSelectedFile());
        }
    }

    private void loadtable(File file) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            DefaultTableModel model = (DefaultTableModel)table1.getModel();
            Vector rowData = (Vector) in.readObject();
            Iterator itr = rowData.iterator();
            while(itr.hasNext()) {
                model.addRow((Vector) itr.next());
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    public My_Played_Page() {
        table1.setModel(new DefaultTableModel(null, new String[] {"Tytuł", "Seria", "Gatunek/Podgatunek", "Ocena", "PEGI", "Twórca"}));
        add_to_combo();
        pimp_my_buttons();
        JFrame frame = new JFrame("Moje gry");
        frame.setMinimumSize(new Dimension(1000,500));
        frame.add(panel_play);
        frame.setVisible(true);
        dodajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = textField1.getText();
                String serious = textField2.getText();
                String value = textField3.getText();
                String creator = textField4.getText();
                String type = check_my_Buttons();
                String PEGI = (String) comboBox1.getSelectedItem();

                try {
                    validateTextFields(title,FieldType.title);
                    validateTextFields(serious,FieldType.serious);
                    validateTextFields(value, FieldType.value);
                    validateTextFields(creator, FieldType.creator);
                    validateRange(value);
                    check_this_button();
                    fill_that_table(new Single_Title(title,serious,type,Integer.valueOf(value), Integer.valueOf(PEGI), creator));
                    update_that_date();
                    clean_me();
                } catch (Game_Check_Exception.EmptyTitleException exception) {
                    error_title.setVisible(true);
                    error_title.setText(exception.toString());
                } catch (Game_Check_Exception.EmptySerException exception) {
                    error_ser.setVisible(true);
                    error_ser.setText(exception.toString());
                } catch (Game_Check_Exception.EmptyValException exception) {
                    error_val.setVisible(true);
                    error_val.setText(exception.toString());
                } catch (Game_Check_Exception.EmptyCreException exception) {
                    error_cre.setVisible(true);
                    error_cre.setText(exception.toString());
                } catch (Game_Check_Exception.NoPickedTypeException exception) {
                    error_type.setVisible(true);
                    error_type.setText(exception.toString());
                } catch (Game_Check_Exception.InvalidValueException exception) {
                    error_val.setVisible(true);
                    error_val.setText(exception.toString());
                }
            }
        });
        wyczyśćButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                table1.setModel(new DefaultTableModel(null, new String[] {"Tytuł", "Seria", "Gatunek/Podgatunek", "Ocena", "PEGI", "Twórca"}));
                counter_label.setText("Zero gier");
            }
        });
        aktualizujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = textField1.getText();
                String serious = textField2.getText();
                String value = textField3.getText();
                String creator = textField4.getText();
                String type = check_my_Buttons();
                String PEGI = (String) comboBox1.getSelectedItem();

                try {
                    validateTextFields(title,FieldType.title);
                    validateTextFields(serious,FieldType.serious);
                    validateTextFields(value, FieldType.value);
                    validateTextFields(creator, FieldType.creator);
                    validateRange(value);
                    check_this_button();
                    Update_me(new Single_Title(title,serious,type,Integer.valueOf(value),Integer.valueOf(PEGI),creator));
                    clean_me();
                } catch (Game_Check_Exception.EmptyTitleException exception) {
                    error_title.setVisible(true);
                    error_title.setText(exception.toString());
                } catch (Game_Check_Exception.EmptySerException exception) {
                    error_ser.setVisible(true);
                    error_ser.setText(exception.toString());
                } catch (Game_Check_Exception.EmptyValException exception) {
                    error_val.setVisible(true);
                    error_val.setText(exception.toString());
                } catch (Game_Check_Exception.EmptyCreException exception) {
                    error_cre.setVisible(true);
                    error_cre.setText(exception.toString());
                } catch (Game_Check_Exception.NoPickedTypeException exception) {
                    error_type.setVisible(true);
                    error_type.setText(exception.toString());
                } catch (Game_Check_Exception.NoActualizationPossible exception) {
                    error_act.setVisible(true);
                    error_act.setText(exception.toString());
                } catch (Game_Check_Exception.InvalidValueException exception) {
                    error_range.setVisible(true);
                    error_range.setText(exception.toString());
                }
            }
        });
        zapiszButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveTable();
            }
        });
        odczytZPlikuTODOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadTable();
                update_that_date();
            }
        });
    }

    private void validateRange(String value) {
        try {
            Integer range = Integer.valueOf(value);
            if (!(range >= 0 && range <= 100)) {
                throw new Game_Check_Exception.InvalidValueException();
            }
        } catch (NumberFormatException exception) {
            throw new Game_Check_Exception.InvalidValueException();
        }
    }
    private void validateTextFields (String hm, FieldType check) {
        if (hm.isEmpty()) {
            switch (check) {
                case title-> throw new Game_Check_Exception.EmptyTitleException();
                case serious -> throw new Game_Check_Exception.EmptySerException();
                case value -> throw new Game_Check_Exception.EmptyValException();
                case creator -> throw new Game_Check_Exception.EmptyCreException();
            }
        }
    }

    private void check_this_button() {
        if (!fightingRadioButton.isSelected() && !metroidvaniaRadioButton.isSelected() && !MOBARadioButton.isSelected() && !platformerRadioButton.isSelected() && !puzzleRadioButton.isSelected() && !rougelikeRadioButton.isSelected() && !RTSRadioButton.isSelected() && !sandboxRPGRadioButton.isSelected() && !shooterRadioButton.isSelected() && !sportRadioButton.isSelected() && !steathRadioButton.isSelected() && !survivalRadioButton.isSelected() && !survivalHorrorRadioButton.isSelected() && !tactical_RPGRadioButton.isSelected() && !action_RPGRadioButton.isSelected() && !adventureRadioButton.isSelected()) {
            throw new Game_Check_Exception.NoPickedTypeException();
        }
    }

    private void fill_that_table (Single_Title xxx) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.addRow(xxx.toArray());
    }

    private void add_to_combo() {
        comboBox1.addItem("3");
        comboBox1.addItem("7");
        comboBox1.addItem("12");
        comboBox1.addItem("16");
        comboBox1.addItem("18");

        comboBox1.setSelectedIndex(0);
    }

    private void update_that_date() {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        int amount = model.getRowCount();
        counter_label.setText("Ilość pozycji: " + String.valueOf(amount));
        counter_label.setVisible(true);
    }

    private void clean_me() {
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        error_cre.setVisible(false);
        error_ser.setVisible(false);
        error_title.setVisible(false);
        error_type.setVisible(false);
        error_val.setVisible(false);
        error_act.setVisible(false);
        group.clearSelection();
    }

    private void Update_me(Single_Title title_up) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        int rows = model.getRowCount();

        for (int i=0; i<rows; i++) {
            if (model.getValueAt(i,0).equals(title_up.title)) {
                model.setValueAt(title_up.serious,i,1);
                model.setValueAt(title_up.type,i,2);
                model.setValueAt(title_up.value,i,3);
                model.setValueAt(title_up.PEGI,i,4);
                model.setValueAt(title_up.creator,i,5);
                return;
            }
        }

        throw new Game_Check_Exception.NoActualizationPossible();
    }

    private void pimp_my_buttons() {
        group.add(fightingRadioButton);
        group.add(metroidvaniaRadioButton);
        group.add(MOBARadioButton);
        group.add(platformerRadioButton);
        group.add(puzzleRadioButton);
        group.add(rougelikeRadioButton);
        group.add(RTSRadioButton);
        group.add(sandboxRPGRadioButton);
        group.add(shooterRadioButton);
        group.add(sportRadioButton);
        group.add(steathRadioButton);
        group.add(survivalRadioButton);
        group.add(survivalHorrorRadioButton);
        group.add(tactical_RPGRadioButton);
        group.add(adventureRadioButton);
        group.add(action_RPGRadioButton);
    }

    private String check_my_Buttons() {
        String whaaat = new String();
        if (fightingRadioButton.isSelected()) {
            whaaat = "Fighting";
        } else if (metroidvaniaRadioButton.isSelected()) {
            whaaat = "Metroidvania";
        } else if (MOBARadioButton.isSelected()) {
            whaaat = "MOBA";
        } else if (platformerRadioButton.isSelected()) {
            whaaat = "Platforming";
        } else if (puzzleRadioButton.isSelected()) {
            whaaat = "Puzzle";
        } else if (rougelikeRadioButton.isSelected()) {
            whaaat = "RougeLike";
        } else if (RTSRadioButton.isSelected()) {
            whaaat = "RTS";
        } else if (sandboxRPGRadioButton.isSelected()) {
            whaaat = "Sandbox RPG";
        } else if (shooterRadioButton.isSelected()) {
            whaaat = "Shooter";
        } else if (sportRadioButton.isSelected()) {
            whaaat = "Sport";
        } else if (steathRadioButton.isSelected()) {
            whaaat = "Stealth";
        } else if (survivalRadioButton.isSelected()) {
            whaaat = "Survival";
        } else if (survivalHorrorRadioButton.isSelected()) {
            whaaat = "Survival Horror";
        } else if (tactical_RPGRadioButton.isSelected()) {
            whaaat = "Tactical RPG";
        } else if (adventureRadioButton.isSelected()) {
            whaaat = "Adventure";
        } else if (action_RPGRadioButton.isSelected()) {
            whaaat = "Action RPG";
        }
        return whaaat;
    }


}
