import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Iterator;
import java.util.Vector;

public class Followed_page extends JFrame{
    private JButton wyczyśćListęButton;
    private JButton zapiszButton;
    private JButton odczytButton;
    private JTable table1;
    private JPanel panel_followed;
    private JLabel empty_label;
    private JFileChooser fileChooser = new JFileChooser(new File("."));

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

    public void set_Column() {
        TableColumnModel model_t = table1.getColumnModel();
        model_t.getColumn(0).setPreferredWidth(200);
        model_t.getColumn(1).setPreferredWidth(85);
        model_t.getColumn(2).setPreferredWidth(85);
        model_t.getColumn(3).setPreferredWidth(85);
        model_t.getColumn(4).setPreferredWidth(85);
    }

   public Followed_page(Object[][] data) {
        table1.setModel(new DefaultTableModel(data, new String[] {"Tytuł", "Seria", "Gatunek/Podgatunek", "Ocena", "PEGI", "Twórca"}));
        set_Column();
        JFrame frame = new JFrame("Followed");
        frame.setMinimumSize(new Dimension(700,400));
        frame.add(panel_followed);
        frame.setVisible(true);
        wyczyśćListęButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                table1.setModel(new DefaultTableModel(null, new String[] {"Tytuł", "Seria", "Gatunek/Podgatunek", "Ocena", "PEGI", "Twórca"}));
                empty_label.setText("Nic nie obserwujesz");
                empty_label.setVisible(true);
            }
        });
        zapiszButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveTable();
            }
        });
        odczytButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadTable();
            }
        });
    }
}
