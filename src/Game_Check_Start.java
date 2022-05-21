import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game_Check_Start {
    private JPanel panel_start;
    private JComboBox comboBox1;
    private JTable table1;
    private JButton mojeOgrywaneButton;
    private JButton obserwujButton;
    private JButton encyklopediaButton;
    private JLabel Follow_inf;
    private JTextArea Instruction_area;
    private JLabel error_follow;
    private JButton dziśPolecamyButton;
    private JLabel lab1;
    private JLabel lab2;
    private JLabel lab3;
    private JLabel lab4;
    private JLabel lab5;
    private JLabel lab6;
    private JScrollPane scroll;
    private JLabel sort_lab;
    private JButton wyszukajInformacjeButton;
    private JTextField textField1;
    private JLabel error_se;
    public String[] titles = new String[100];

    enum FieldType {
        search_that
    }

    private String[] get_titles(String[] xd) {
        DefaultTableModel model_t =  (DefaultTableModel)table1.getModel();
        int row = model_t.getRowCount();
        for (int i=0; i<row; i++) {
            xd[i] = (String) model_t.getValueAt(i,0);
        }
        return xd;
    }

    private void validate_search(String teste, FieldType check) {
        if (teste.isEmpty()) {
            if (check == FieldType.search_that) {
                throw new Game_Check_Exception.EmptySearchException();
            }
        }
    }

    private void validate_field(String testx) {
        DefaultTableModel model_s = (DefaultTableModel) table1.getModel();
        int rows_s = model_s.getRowCount();
        for (int i=0; i < rows_s; i++) {
            if (testx.equals(titles[i])) {
                return;
            }
        }
        throw new Game_Check_Exception.NoSearchPossibleException();
    }

    private Object[][] get_my_table() {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        int RowsFollow = model.getRowCount();
        Object[][] data_follow = new Object[15][15];

        for (int i=0; i<RowsFollow; i++) {
            if (model.getValueAt(i,6).equals(true)) {
                data_follow[i][0] = model.getValueAt(i,0);
                data_follow[i][1]= model.getValueAt(i,1);
                data_follow[i][2] = model.getValueAt(i,2);
                data_follow[i][3] = model.getValueAt(i,3);
                data_follow[i][4] = model.getValueAt(i,4);
                data_follow[i][5] = model.getValueAt(i,5);

            }
        }
        return data_follow;
    }

    private void validate_follow() {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        int RowsFollow = model.getRowCount();

        for (int i=0; i<RowsFollow; i++) {
            if (model.getValueAt(i,6).equals(true)) {
                return;
            }
        }
        throw new Game_Check_Exception.NoFollowedException();
    }

    private void Combo_box_add () {
        comboBox1.addItem("Instrukcja");
        comboBox1.addItem("Przegląd gier");
        comboBox1.setSelectedIndex(0);
    }

    private void set_Columnt() {
        TableColumnModel model_c = table1.getColumnModel();
        model_c.getColumn(0).setPreferredWidth(200);
        model_c.getColumn(1).setPreferredWidth(85);
        model_c.getColumn(2).setPreferredWidth(85);
        model_c.getColumn(3).setPreferredWidth(85);
        model_c.getColumn(4).setPreferredWidth(85);
    }

    private void today_I_reccomend() {
        DefaultTableModel modelx = (DefaultTableModel)table1.getModel();
        int rows = modelx.getRowCount();
        Random rn = new Random();
        int pick = rn.nextInt(rows+1);
        lab1.setText((String) modelx.getValueAt(pick,0));
        lab2.setText((String) modelx.getValueAt(pick,1));
        lab3.setText((String) modelx.getValueAt(pick,2));
        lab4.setText((String) modelx.getValueAt(pick,3));
        lab5.setText((String) modelx.getValueAt(pick,4));
        lab6.setText((String) modelx.getValueAt(pick,5));
        lab1.setVisible(true);
        lab2.setVisible(true);
        lab3.setVisible(true);
        lab4.setVisible(true);
        lab5.setVisible(true);
        lab6.setVisible(true);

    }

    public Game_Check_Start() {
        Instruction_area.setText("Aplikacja Game Check to rewolucyjna aplikacja od gracza dla graczy. \n Zachowaj swoje najlepsze gry razem ze sobą, dodając je do swojej listy. \n Zanurz się w naszej bazie tytułów i znajdź coś dla siebie! \n A jeśli nadal masz wątpliwości co do gatunku gry, zajrzyj do encklopedii. \n Game on and Game check B)");
        String[] columnNames = {"Tytuł", "Seria", "Gatunek/Podgatunek", "Ocena", "PEGI", "Twórca","Obserwuj"};
        Object[][] game_data = {
                {"Hollow Knight", "brak", "Metroidvania", "90", "7", "Team Cherry", false},
                {"Celeste", "brak", "Platforming", "92", "7", "Matt Makes Games Inc.", false},
                {"GTA V", "GTA", "Sandbox RPG", "94", "18", "Rockstar North", false},
                {"Dead Space 2", "Dead Space", "Survival_horror", "90", "18", "Visceral Games", false},
                {"Castlevania: Lords of Shadows", "Castlevania", "Action_RPG", "80", "16", "Mercury Steam", false},
                {"Ratchet & Clank: Rift Apart", "Ratchet&Clank", "Platformer", "89", "3", "Insomniac Games", false},
                {"The Last Of Us", "The Last Of Us", "Survival_horror", "95", "18", "Naughty Dog", false},
                {"Persona 4 Golden", "Persona", "Action RPG", "87", "16", "Atlus", false},
                {"Danganronpa V3", "Danganronpa", "Adventure", "82", "16", "Spike Chunsoft", false},
                {"Slay The Spire", "brak", "Rougelike", "89", "7", "Mega Crit Games", false},
                {"Sid Meier's Civilization V", "Civilization", "TBS", "90", "3", "Firaxis Games", false},
                {"Wiedźmin 3: Dziki Gon", "Wiedźmin", "Action_RPG", "93", "18", "CD Project RED", false},
                {"Unravel", "Unravel", "Adventure", "81", "3", "Coldwood Interactive", false},
                {"Minecraft", "brak", "Survival", "93", "7", "Mojanf AB", false},
                {"League Of Legends", "brak", "MOBA", "78", "12", "Riot Games", false},
                {"Mortal Kombat X", "Mortal Kombat", "Fighting", "76", "18", "High Voltage Software", false},
                {"Pillars Of Eternity", "Pillars Of Eternity", "Tactical_RPG", "89", "16", "Obsidian Entertainment", false},
                {"Warcraft III: Regin of Chaos", "Warcraft", "RTS", "92", "12", "Blizzard Entertainment", false},
                {"Dishonored 2", "Dishonored", "Stealth", "91", "18", "Arkane Studios", false},
                {"Battlefield 3", "BattleField", "Shooter", "82", "16", "EA DICE", false},
                {"The Witness", "brak", "Puzzle", "89", "7", "Thekla", false},
                {"Gothic", "Gothic", "Sandbox_RPG", "72", "16", "Piranha Bytes", false},
                {"FIFA 20", "FIFA", "Sports", "40", "7", "Electronic Arts",false}
        };
        DefaultTableModel model = new DefaultTableModel(game_data,columnNames) {
            private static final long serialVersionUID = 1L;
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return String.class;
                    default:
                        return Boolean.class;
                }
            }
        };
        table1.setModel(model);
        set_Columnt();
        table1.setAutoCreateRowSorter(true);
        Combo_box_add();
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedIndex() == 0) {
                    Instruction_area.setText("Aplikacja Game Check to rewolucyjna aplikacja od gracza dla graczy. \n Zachowaj swoje najlepsze gry, dodając je do swojej listy. \n Zanurz się w naszej bazie tytułów i znajdź coś dla siebie! \n A jeśli nadal masz wątpliwości co do gatunku gry, zajrzyj do encklopedii. \n Game on and Game check B) ");
                    Instruction_area.setVisible(true);
                    scroll.setVisible(false);
                    table1.setVisible(false);
                    Follow_inf.setVisible(false);
                    sort_lab.setVisible(false);
                    textField1.setVisible(false);
                    wyszukajInformacjeButton.setVisible(false);
                } else if (comboBox1.getSelectedIndex() == 1) {
                    Instruction_area.setVisible(false);
                    scroll.setVisible(true);
                    table1.setVisible(true);
                    sort_lab.setVisible(true);
                    Follow_inf.setVisible(true);
                    textField1.setVisible(true);
                    wyszukajInformacjeButton.setVisible(true);
                }
            }
        });


        obserwujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    validate_follow();
                    Followed_page page = new Followed_page(get_my_table());
                } catch (Game_Check_Exception.NoFollowedException exception) {
                    error_follow.setVisible(true);
                    error_follow.setText(exception.toString());
                }
            }
        });
        mojeOgrywaneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                My_Played_Page page_1 = new My_Played_Page();
            }
        });
        encyklopediaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Encylopedia_Page en_p = new Encylopedia_Page();
            }
        });
        dziśPolecamyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                today_I_reccomend();
            }
        });
        wyszukajInformacjeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String search_that = textField1.getText();
                titles = get_titles(titles);
                try {
                    validate_search(search_that, FieldType.search_that);
                    validate_field(search_that);
                    Search_Page page_s = new Search_Page(search_that);
                } catch (Game_Check_Exception.NoSearchPossibleException | Game_Check_Exception.EmptySearchException exception) {
                    error_se.setVisible(true);
                    error_se.setText(exception.toString());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Title Screen");
        frame.setMinimumSize(new Dimension(750,450));
        frame.setContentPane(new Game_Check_Start().panel_start);
        frame.setVisible(true);
    }
}
