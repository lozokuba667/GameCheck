import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Encylopedia_Page {
    private JPanel panel_en;
    private JComboBox comboBox1;
    private JTextArea textArea1;
    private Stealth a1 = new Stealth();
    private Fighting a2 = new Fighting();
    private Shooter a3 = new Shooter();
    private Platformer a4 = new Platformer();
    private Survival a5 = new Survival();
    private Survival_horror ad1 = new Survival_horror();
    private Metroidvania ad2 = new Metroidvania();
    private Adventure_type av1 = new Adventure_type();
    private Action_RPG rp1 = new Action_RPG();
    private Rougelike rp2 = new Rougelike();
    private Tactical_RPG rp3 = new Tactical_RPG();
    private Sandbox_RPG rp4 = new Sandbox_RPG();
    private RTS s1 = new RTS();
    private MOBA s2 = new MOBA();
    private TBS s3 = new TBS();
    private Sports_type spo = new Sports_type();
    private Puzzle_type puz = new Puzzle_type();

    private void add_to_combo() {
        comboBox1.addItem("Puste");
        comboBox1.addItem("Platformer");
        comboBox1.addItem("Shooter");
        comboBox1.addItem("Survival");
        comboBox1.addItem("Stealth");
        comboBox1.addItem("Fighting");
        comboBox1.addItem("Survival Horror");
        comboBox1.addItem("Metroidvania");
        comboBox1.addItem("Przygodowe gry");
        comboBox1.addItem("Action RPG");
        comboBox1.addItem("Rougelike");
        comboBox1.addItem("Tactical RPG");
        comboBox1.addItem("Sandbox RPG");
        comboBox1.addItem("RTS");
        comboBox1.addItem("MOBA");
        comboBox1.addItem("TBS");
        comboBox1.addItem("Sports");
        comboBox1.addItem("Logiczne");
        comboBox1.setSelectedIndex(0);
    }

    private void im_bored() {
        a1.setDes("Gry skradanki kładą nacisk na spryt i precyzję w rozwiązywaniu wyzwań w grze,\n a podczas gdy inne działania lub walka mogą pomóc graczom osiągnąć cel,\n tak jak w Dishonored, gry skradanki zwykle zachęcają graczy do potajemnego angażowania\n się w akcję. Metal Gear zbudował nazwę franczyzy\n w tej podkategorii.");
        a2.setDes("Gry walki, takie jak Mortal Kombat i Street Fighter II, \n skupiają akcję na walce, a w większości przypadków na walce wręcz.\n Większość gier walki zawiera stabilną liczbę grywalnych postaci, z których każda specjalizuje się we własnych \n unikalnych umiejętnościach lub stylu walki.\n W większości tradycyjnych bijatyk gracze walczą na sam szczyt,\n w miarę postępów mierząc się z coraz trudniejszymi przeciwnikami");
        a3.setDes("Strzelanki pozwalają graczom używać broni do angażowania się w akcję,\n a ich celem jest zwykle wyeliminowanie wrogów lub przeciwnych graczy.\n" +
                "\n" +
                "Strzelanki podzielono na kategorie według perspektywy gracza:\n" +
                "\n" +
                "Strzelanki FPS (FPS) rozgrywane są z punktu widzenia głównego bohatera;\n Call of Duty, Half-Life i Halo to dobre przykłady.\n" +
                "\n" +
                "W strzelankach z perspektywy trzeciej osoby,\n takich jak Fortnite i Splatoon, akcja toczy się z punktu widzenia, \n z którego gracz może zobaczyć głównego bohatera, zwykle nieco z góry i z tyłu.");
        a4.setDes("Gry platformowe zawdzięczają swoją nazwę temu, że postać w grze wchodzi \n w interakcje z platformami (zwykle biega, skacze lub spada) w trakcie rozgrywki. \n Istnieje wiele rodzajów gier platformowych; Super Mario Bros. jest prawdopodobnie najbardziej znany, \n a Donkey Kong był jednym z pierwszych.");
        a5.setDes("Nowoczesne gry survivalowe, takie jak Fortnite,\n rozgrywają się w otwartym świecie i dają graczom dostęp do zasobów,\n do tworzenia narzędzi, broni i schronienia, \naby przetrwać jako tak długo, jak to możliwe.");
        ad1.setDes("Gry typu survival horror, takie jak Resident Evil, \n  wykorzystują dojrzałe motywy i tematykę, \n aby przedstawiać makabryczne i makabryczne otoczenie \n (wiele z tych gier wykorzystuje krew i krew i jest przeznaczone tylko dla dojrzałych odbiorców). \n Takie tytuły dostarczają niesamowitych emocji, wzmocnionych kluczową mechaniką gry: \n ograniczonymi zasobami, takimi jak amunicja czy broń skończona.");
        ad2.setDes("Gatunek gier, którego nazwa opiera się na grach, które go zainspirowały, Metroid i Castlevania. \n Gry typu Metroidvania są jak podstawowe przygodowe gry akcji,\n ale nie są liniowe i często wymagają od gracza cofnięcia się lub zatrzymania postępu,\n dopóki nie znajdzie określonego przedmiotu lub specjalnego narzędzia. ");
        av1.setDes("W grach przygodowych gracze zazwyczaj wchodzą w interakcję \n ze swoim otoczeniem i innymi postaciami, aby rozwiązywać zagadki ze wskazówkami, \n które pomogą rozwinąć fabułę lub rozgrywkę. Poza okazjonalną mini-grą, \n gry przygodowe rzadko zawierają elementy tradycyjnej gry wideo.");
        rp1.setDes("Gry akcji RPG zawierają elementy zarówno gier akcji, \n jak i przygodowych gier akcji. Cechą charakterystyczną gier \n RPG akcji jest to, że walka odbywa się w czasie rzeczywistym \n i zależy od szybkości i dokładności gracza w stosunku \n do najlepszych wrogów, w przeciwieństwie do wysokich atrybutów postaci, \n takich jak charyzma i zręczność.");
        rp2.setDes("Jedyny inny gatunek gier oparty na nazwie gry \n, który ją zainspirował, Rogue był grą komputerową 2D i dungeon crawlerem z 1980 roku. \n Gra zawierała interfejs tekstowy i losowe generowanie poziomów. \n Gracze pokonywali wrogów i przeszkody, aby zwiększyć swoje statystyki gracza.");
        rp3.setDes("Taktyczne gry fabularne przypominają bardziej tradycyjne gry planszowe, \n w których akcja turowa rozgrywa się na siatce izometrycznej. \n Gracze wykorzystują niemal szachową strategię i skończoną liczbę zasobów (armie, broń itp.)\n, aby podbijać bitwy i wrogów.");
        rp4.setDes("Sandbox, czyli gry fabularne z otwartym światem, \n pozwalają graczom swobodnie wędrować po środowisku gry \n w poszukiwaniu przygód.");
        s1.setDes("Gry strategiczne w czasie rzeczywistym (Real Time Strategy) \n wymagają od gracza gromadzenia \n i utrzymywania zasobów, takich jak bazy, przy jednoczesnym postępie \n i rozwoju zarówno zasobów, jak i jednostek bojowych.");
        s2.setDes("W tym podgatunku gier strategicznych gracze zazwyczaj nie budują zasobów, \n takich jak bazy czy jednostki bojowe. Zamiast tego gracze kontrolują jedną postać \n w jednej z dwóch drużyn, współpracując ze sobą, aby spróbować zniszczyć bazę \n drugiej drużyny");
        s3.setDes("Ta kategoria służy do odróżnienia strategii turowych od strategii czasu rzeczywistego. \n Turowa gra strategiczna daje graczom pewien czas (lub turę) na podjęcie działań.");
        spo.setDes("Gry sportowe symulują sporty takie jak \n golf, piłka nożna, koszykówka, baseball i piłka nożna.\n Mogą również obejmować sporty olimpijskie,  takie jak narciarstwo, \n a nawet sporty pubowe, takie jak rzutki i bilard. \n Przeciwnicy w tych grach są często kontrolowani przez komputer, ale mogą również przybierać postać żywych przeciwników.");
        puz.setDes("Gry logiczne lub logiczne zwykle odbywają się na jednym ekranie \n lub na polu gry i wymagają od gracza rozwiązania problemu, aby przyspieszyć akcję.");
    }

    private void show() {
        if (comboBox1.getSelectedIndex() == 1) {
            textArea1.setText(a4.getDes());
            textArea1.setVisible(true);
        } else if (comboBox1.getSelectedIndex()==2) {
            textArea1.setText(a3.getDes());
            textArea1.setVisible(true);
        } else if(comboBox1.getSelectedIndex() == 3) {
            textArea1.setText(a5.getDes());
            textArea1.setVisible(true);
        } else if (comboBox1.getSelectedIndex() ==4 ) {
            textArea1.setText(a1.getDes());
            textArea1.setVisible(true);
        } else if (comboBox1.getSelectedIndex()==5) {
            textArea1.setText(a2.getDes());
            textArea1.setVisible(true);
        } else if (comboBox1.getSelectedIndex()==6) {
            textArea1.setText(ad1.getDes());
            textArea1.setVisible(true);
        } else if (comboBox1.getSelectedIndex()==7) {
            textArea1.setText(ad2.getDes());
            textArea1.setVisible(true);
        } else if (comboBox1.getSelectedIndex()==8) {
            textArea1.setText(av1.getDes());
            textArea1.setVisible(true);
        } else if (comboBox1.getSelectedIndex()==9) {
            textArea1.setText(rp1.getDes());
            textArea1.setVisible(true);
        } else if (comboBox1.getSelectedIndex()==10) {
            textArea1.setText(rp2.getDes());
            textArea1.setVisible(true);
        } else if (comboBox1.getSelectedIndex()==11) {
            textArea1.setText(rp3.getDes());
            textArea1.setVisible(true);
        } else if (comboBox1.getSelectedIndex()==12) {
            textArea1.setText(rp4.getDes());
            textArea1.setVisible(true);
        } else if(comboBox1.getSelectedIndex()==13) {
            textArea1.setText(s1.getDes());
            textArea1.setVisible(true);
        } else if (comboBox1.getSelectedIndex()==14) {
            textArea1.setText(s2.getDes());
            textArea1.setVisible(true);
        } else if (comboBox1.getSelectedIndex()==15) {
            textArea1.setText(s3.getDes());
            textArea1.setVisible(true);
        } else if (comboBox1.getSelectedIndex()==16) {
            textArea1.setText(spo.getDes());
            textArea1.setVisible(true);
        } else if (comboBox1.getSelectedIndex()==17) {
            textArea1.setText(puz.getDes());
            textArea1.setVisible(true);
        }
    }

    public Encylopedia_Page() {
        JFrame frame = new JFrame("Encyklopedia");
        add_to_combo();
        im_bored();
        frame.setMinimumSize(new Dimension(650,250));
        frame.add(panel_en);
        frame.setVisible(true);
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                show();
            }
        });
    }
}
