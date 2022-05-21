import javax.swing.*;
import java.awt.*;

public class Search_Page {
    private JPanel panel1;
    private JLabel title;
    private JTextArea textArea1;
    private JLabel special_info;
    private Metroidvania hollow_knight = new Metroidvania();
    private Platformer celeste = new Platformer();
    private Sandbox_RPG GTAV = new Sandbox_RPG();
    private Survival_horror Dead_Space_2 = new Survival_horror();
    private Action_RPG castelvania = new Action_RPG();
    private Platformer ratchet = new Platformer();
    private Survival_horror tlou = new Survival_horror();
    private Action_RPG persona = new Action_RPG();
    private Adventure_type dangan = new Adventure_type();
    private Rougelike slay = new Rougelike();
    private Action_RPG witcher = new Action_RPG();
    private Adventure_type unravel = new Adventure_type();
    private TBS civ = new TBS();
    private Survival mine = new Survival();
    private MOBA league = new MOBA();
    private Fighting mortal = new Fighting();
    private Tactical_RPG pilary = new Tactical_RPG();
    private RTS warcraft = new RTS();
    private Stealth dish = new Stealth();
    private Shooter battle = new Shooter();
    private Puzzle_type wit = new Puzzle_type();
    private Sandbox_RPG gothic = new Sandbox_RPG();
    private Sports_type fifa = new Sports_type();

    private void set_my_objects() {
        hollow_knight.setDes("Należąca do gatunku metroidvanii dwuwymiarowa platformówka autorstwa niezależnego Team Cherry.\n Akcja Hollow Knight przenosi nas do fantastycznego świata:\n podziemi, jakie rozciągają się pod miasteczkiem Dirtmouth.");
        hollow_knight.setBacktrack(20);
        celeste.setDes("Opracowana przez Matt Makes Games gra platformowa, w której wcielamy się w rudowłosą Celeste. \n Bohaterka podejmuje się morderczego wyzwania, jakim jest wspinaczka na szczyt wysokiej góry,\n a my towarzyszymy jej w tej przygodzie, starając się pomóc w realizacji celu.");
        celeste.setJump_amount(12500);
        GTAV.setDes("GTA 5 to piąta pełnoprawna odsłona niezwykle popularnej serii gier akcji,\n nad której rozwojem pieczę sprawuje studio Rockstar North we współpracy z koncernem Take Two Interactive.\n Miejscem akcji Grand Theft Auto V jest fikcyjne miasto Los Santos wzorowane na Los Angeles.");
        GTAV.setWorld_large(75.22);
        Dead_Space_2.setDes("Sequel wydanego w 2008 roku survival horroru Dead Space.\n Produkcją gry zajęło się studio Visceral Games (dawne EA Redwood Shores)\n przy wsparciu wydawniczym koncernu Electronic Arts. \nFabuła Dead Space 2 kontynuuje wątek walki z pasożytniczą rasą nekromorfów.");
        Dead_Space_2.setIm_bored(250);
        castelvania.setDes("Kolejna pełnoprawna odsłona legendarnej serii gier akcji,\n opracowana przez hiszpańskie studio MercurySteam, we współpracy z firmą Konami,\n odpowiedzialną za wszystkie dotychczasowe części cyklu.");
        castelvania.setTime_to_end(3);
        ratchet.setDes("Ratchet & Clank: Rift Apart jest przygodową grą akcji TPP,\n która powstała z myślą o konsoli PlayStation 5.\n Produkcja stanowi kolejną odsłonę serii, której korzenie sięgają 2002 roku. \n Za jej opracowanie odpowiada studio Insomniac Games.");
        ratchet.setJump_amount(200);
        tlou.setDes("Przygodowa gra akcji w konwencji postapokaliptycznego survival horroru, \n stworzona przez studio deweloperskie Naughty Dog (znane przede wszystkim z serii Uncharted)\n przy wsparciu wydawniczym firmy Sony Computer Entertainment.");
        tlou.setIm_bored(42);
        persona.setDes("Odświeżona i rozszerzona wersja jRPG-a, który ukazał się na PlayStation 2. \n W Persona 4 Golden gracz uczęszcza na zajęcia, buduje relacje z kolegami ze szkoły \n i walczy z przeciwnikami w alternatywnej rzeczywistości.");
        persona.setTime_to_end(84);
        dangan.setDes("Visual novel Danganronpa V3: Killing Harmony opowiada o porwanej licealistce imieniem Kaede Akamatsu,\n która wraz z innymi uczniami trafia do szkoły zwanej Gifted Inmates Academy.");
        dangan.setType_of_adventure("Visual Novel");
        slay.setDes("Miks karcianki i produkcji typu roguelike opracowany przez zespół Mega Crit.\n W Slay the Spire zadaniem graczy jest wspinaczka na szczyt tytułowej iglicy; \n po drodze muszą jednak stawić czoła hordom przeciwników.");
        slay.setAmount_of_deaths(120);
        civ.setDes("Rozbudowana strategia turowa, stanowiąca piątą odsłonę sygnowanego nazwiskiem Sida Meiera cyklu Civilization. \n Produkcją Sid Meier's Civilization V zajęło się studio Firaxis Games \n przy wsparciu wydawniczym koncernu Take Two Interactive.");
        civ.setWinning_type("Militarne, Dyplomatyczne, Naukowe, Technologiczne, Czasowe");
        witcher.setDes("Gra action RPG, stanowiąca trzecią część przygód Geralta z Rivii. \n Podobnie jak we wcześniejszych odsłonach cyklu, Wiedźmin 3: Dziki Gon bazuje na motywach twórczości literackiej Andrzeja Sapkowskiego, \n jednak nie jest bezpośrednią adaptacją żadnej z jego książek.");
        witcher.setTime_to_end(60);
        unravel.setDes("Unravel to barwna platformówka logiczno-zręcznościowa,  stworzona przez mało wcześniej znane studio Coldwood Interactive\n W grze wcielamy się w postać sympatycznej maskotki imieniem Yarny, \n stworzonej w całości z grubej, czerwonej włóczki.");
        unravel.setType_of_adventure("Mix");
        mine.setDes("Wymykająca się próbom ścisłej klasyfikacji gatunkowej sandboksowa gra niezależnego studia Mojang AB.\n Minecraft zaprojektowano z myślą o kreatywności graczy,\n którzy mogą niemal dowolnie zmieniać zbudowany z voxeli (sześciennych bloków) wirtualny świat.");
        mine.setTime_to_survive(91);
        league.setDes("Ciesząca się olbrzymią popularnością gra typu MOBA (Multiplayer Online Battle Arena), wyprodukowana przez studio Riot Games.\n Akcja League of Legends osadzona została w fantastycznym świecie Valoran, \n którym przez wieki targały krwawe wojny.");
        league.setNumber_of_ch(155);
        mortal.setDes("Mortal Kombat X to dziesiąta odsłona kultowej serii brutalnych bijatyk, która istnieje od 1992 roku, \n a zarazem druga gra z tego cyklu w dorobku studia NetherRealm.\n  Innymi słowy, mamy tu do czynienia z kontynuacją bardzo udanego Mortal Kombat z 2011 roku.");
        mortal.setCharacters(24);
        pilary.setDes("Izometryczna gra RPG w klasycznym stylu, wyprodukowana przez studio Obisidian Entertainment.\n Akcja Pillars of Eternity osadzona została w tradycyjnym świecie fantasy,\n którego centralnym elementem jest reinkarnacja dusz.");
        pilary.setParty_max(6);
        warcraft.setDes("Warcraft III: Reign of Chaos to trzecia odsłona kultowej serii osadzonych w realiach fantasy RTS-ów, \n zapoczątkowanej w 1994 roku przez studio Blizzard. W krainie Azeroth siły ludzi, orków i nocnych elfów stawiają czoła inwazji nieumarłych,\n zwanych Plagą albo Nocnym Legionem.");
        warcraft.setUnits(12);
        dish.setDes("Dishonored 2 jest kontynuacją wydanego w 2012 roku bestsellerowego połaczenia skradanki i gry akcji z widokiem FPP. \n Tak jak poprzednio, rozgrywkę osadzono w fikcyjnym, inspirowanym okresem rewolucji przemysłowej świecie,\n w którym połączono elementy magii i steampunka z industrialną estetyką przełomu XIX i XX wieku.");
        dish.setStealh_time(14);
        battle.setDes("Trzecia odsłona Battlefielda składa się zarówno z kampanii solowej jak i rozbudowanego trybu wieloosobowego. \n W pojedynkę możemy wziąć udział w wielu dynamicznych i zróżnicowanych misjach,\n które zabierają nas do Stanów Zjednoczonych (Nowy Jork), Europy (Paryż), a nawet na Bliski Wschód (Teheran, Kurdystan).");
        battle.setShots(4);
        wit.setDes("The Witness to pierwszoosobowa gra logiczna z elementami przygodowymi, \n opracowana przez twórcę gry Braid Jonathana Blowa i jego niezależne studio Thekla. \n Akcja osadzona została na zagadkowej wyspie, z której z niewyjaśnionych przyczyn nagle zniknęli wszyscy ludzie.");
        wit.setAmount_of_puzzles(650);
        gothic.setDes("Osadzona w realiach fantasy gra RPG akcji, \n opracowana przez debiutujące niemieckie studio Piranha Bytes,\n założone przez byłych członków prężnego w latach 90-tych Greenwood Entertainment.");
        gothic.setWorld_large(1.1);
        fifa.setDes("Kolejna odsłona serii gier piłkarskich od studia EA Sports.\n W FIFA 20 kierujemy wiernie odwzorowanymi prawdziwymi drużynami oraz zawodnikami, \n grając przeciwko sztucznej inteligencji lub innym graczom. \n Główną nowością jest tryb VOLTA Football.");
        fifa.setSport_kind("Piłka Nożna");
    }

    private void set_whole(String texting) {
        switch (texting) {
            case "Hollow Knight" -> {
                title.setText("Hollow Knight");
                textArea1.setText(hollow_knight.getDes());
                special_info.setText("Ilość powrotów do pojedynczej lokacji: " + hollow_knight.getBacktrack());
            }
            case "Celeste" -> {
                title.setText("Celeste");
                textArea1.setText(celeste.getDes());
                special_info.setText("Ilość skoków: " + celeste.getJump_amount());
            }
            case "GTA V" -> {
                title.setText("GTA V");
                textArea1.setText(GTAV.getDes());
                special_info.setText("Wielkość świata: " + GTAV.getWorld_large() + " km^2");
            }
            case "Dead Space 2" -> {
                title.setText("Dead Space 2");
                textArea1.setText(Dead_Space_2.getDes());
                special_info.setText("Ilość Jumpscare'ów: " + Dead_Space_2.getIm_bored());
            }
            case "Castlevania: Lords of Shadows" -> {
                title.setText("Castlevania: Lords of Shadows");
                textArea1.setText(castelvania.getDes());
                special_info.setText("Czas do ukończenia gry: " + castelvania.getTime_to_end() + " godzin");
            }
            case "Ratchet & Clank: Rift Apart" -> {
                title.setText("Ratchet & Clank: Rift Apart");
                textArea1.setText(ratchet.getDes());
                special_info.setText("Ilość skoków: " + ratchet.getDes());
            }
            case "The Last Of Us" -> {
                title.setText("The Last Of Us");
                textArea1.setText(tlou.getDes());
                special_info.setText("Ilość Jumpscare'ów: " + tlou.getIm_bored());
            }
            case "Persona 4 Golden" -> {
                title.setText("Persona 4 Golden");
                textArea1.setText(persona.getDes());
                special_info.setText("Czas do ukończenia gry: " + persona.getTime_to_end() + " godzin");
            }
            case "Danganronpa V3" -> {
                title.setText("Danganronpa V3");
                textArea1.setText(dangan.getDes());
                special_info.setText("Typ przygodówki: " + dangan.getType_of_adventure());
            }
            case "Slay The Spire" -> {
                title.setText("Slay The Spire");
                textArea1.setText(slay.getDes());
                special_info.setText("Ilość śmierci: " + slay.getAmount_of_deaths());
            }
            case "Sid Meier's Civilization V" -> {
                title.setText("Sid Meier's Civilization V");
                textArea1.setText(civ.getDes());
                special_info.setText("Rodzaje zwycięstw: " + civ.getWinning_type());
            }
            case "Wiedźmin 3: Dziki Gon" -> {
                title.setText("Wiedźmin 3: Dziki Gon");
                textArea1.setText(witcher.getDes());
                special_info.setText("Czas do ukończenia gry: " + witcher.getTime_to_end() + " godzin");
            }
            case "Unravel" -> {
                title.setText("Unravel");
                textArea1.setText(unravel.getDes());
                special_info.setText("Typ przygodówki: " + unravel.getType_of_adventure());
            }
            case "Minecraft" -> {
                title.setText("Minecraft");
                textArea1.setText(mine.getDes());
                special_info.setText("Czas, który trzeba przetrwać " + mine.getTime_to_survive());
            }
            case "League Of Legends" -> {
                title.setText("League Of Legends");
                textArea1.setText(league.getDes());
                special_info.setText("Liczba czempionów do wyboru " + league.getNumber_of_ch());
            }
            case "Mortal Kombat X" -> {
                title.setText("Mortal Kombat X");
                textArea1.setText(mortal.getDes());
                special_info.setText("Ilość grywalnych postaci: "+ mortal.getCharacters());
            }
            case "Pillars Of Eternity" -> {
                title.setText("Pillars Of Eternity");
                textArea1.setText(pilary.getDes());
                special_info.setText("Maksymalna liczba członków w drużynie: " + pilary.getParty_max());
            }
            case "Warcraft III: Regin Of Chaos" -> {
                title.setText("Warcraft III: Regin Of Chaos");
                textArea1.setText(warcraft.getDes());
                special_info.setText("Maksymalna liczba jednostek: " + warcraft.getUnits());
            }
            case "Dishonored 2" -> {
                title.setText("Dishonored 2");
                textArea1.setText(dish.getDes());
                special_info.setText("Czas przebywania w ukryciu: " + dish.getStealh_time() + " godzin");
            }
            case "Battlefield 3" -> {
                title.setText("Battlefield 3");
                textArea1.setText(battle.getDes());
                special_info.setText("Ilość strzałów potrzebnych do zabicia przeciwnika" + battle.getShots());
            }
            case "The Witness" -> {
                title.setText("The Witness");
                textArea1.setText(wit.getDes());
                special_info.setText("Ilość zagadek: " + wit.getAmount_of_puzzles());
            }
            case "Gothic" -> {
                title.setText("Gothic");
                textArea1.setText(gothic.getDes());
                special_info.setText("Wielkość mapy: " + gothic.getWorld_large() + " km^2");
            }
            case "FIFA 20" -> {
                title.setText("FIFA 20");
                textArea1.setText(fifa.getDes());
                special_info.setText("Rodzaj sportu: " + fifa.getSport_kind());
            }
        }
    }

    public Search_Page(String text) {
        JFrame frame = new JFrame("Wyszukiwanie");
        frame.setMinimumSize(new Dimension(600,300));
        frame.add(panel1);
        set_my_objects();
        set_whole(text);
        frame.setVisible(true);
    }
}
