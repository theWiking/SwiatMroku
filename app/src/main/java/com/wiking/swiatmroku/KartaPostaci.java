package com.wiking.swiatmroku;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wiking on 02.01.2018.
 *
 */

public class KartaPostaci {
    private int id;
    private String imie;
    private String wiek;
    private String gracz;
    private String koncept;
    private String cnota;
    private String skaza;
    private String kronika;
    private String frakcja;
    private String nazwaGrupy;

    private int inteligencja=1;
    private int czujnosc=1;
    private int determinacja=1;
    private int sila=1;
    private int zrecznosc=1;
    private int wytrzymalosc=1;
    private int prezentacja=1;
    private int manipulacja=1;
    private int opanowanie=1;

    private int dedukcja;
    private int informatyka;
    private int medycyna;
    private int nauka;
    private int okultyzm;
    private int polityka;
    private int rzemioslo;
    private int wyksztalcenie;


    private int bijatyka;
    private int bronBiala;
    private int bronPalna;
    private int prowadzenie;
    private int przetrwanie;
    private int skradanie;
    private int wysportowanie;
    private int zlodziejstwo;

    private int ekspresja;
    private int empatia;
    private int obycie;
    private int oszustwo;
    private int preswazja;
    private int polswiate;
    private int zatraszanie;
    private int zwierzeta;

    private String at1Nazwa="";
    private String at2Nazwa="";
    private String at3Nazwa="";
    private String at4Nazwa="";
    private String at5Nazwa="";
    private String at6Nazwa="";
    private String at7Nazwa="";
    private String at8Nazwa="";
    private String at9Nazwa="";

    private int at1Wartosc;
    private int at2Wartosc;
    private int at3Wartosc;
    private int at4Wartosc;
    private int at5Wartosc;
    private int at6Wartosc;
    private int at7Wartosc;
    private int at8Wartosc;
    private int at9Wartosc;

    private String wada1Nazwa="";
    private String wada2Nazwa="";
    private String wada3Nazwa="";
    private String wada4Nazwa="";
    private int wada1Wartosc;
    private int wada2Wartosc;
    private int wada3Wartosc;
    private int wada4Wartosc;

    private String rozmiar;
    private String szybkosc;
    private String inicjatywa;
    private String obrona;
    private String pancerz;
    private int zdrowieMax;
    private int zdrowie;
    private int silaWoliMax;
    private int silaWoli;
    private int doswiadczenie;
    private int moralnosc;

    private String bron1Nazwa;
    private String bron2Nazwa;
    private String bron3Nazwa;
    private int bron1Mod;
    private int bron2Mod;
    private int bron3Mod;

    private String wyp1Nazwa;
    private String wyp2Nazwa;
    private String wyp3Nazwa;
    private int wyp1Mod;
    private int wyp2Mod;
    private int wyp3Mod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getWiek() {
        return wiek;
    }

    public void setWiek(String wiek) {
        this.wiek = wiek;
    }

    public String getGracz() {
        return gracz;
    }

    public void setGracz(String gracz) {
        this.gracz = gracz;
    }

    public String getKoncept() {
        return koncept;
    }

    public void setKoncept(String koncept) {
        this.koncept = koncept;
    }

    public String getCnota() {
        return cnota;
    }

    public void setCnota(String cnota) {
        this.cnota = cnota;
    }

    public String getSkaza() {
        return skaza;
    }

    public void setSkaza(String skaza) {
        this.skaza = skaza;
    }

    public String getKronika() {
        return kronika;
    }

    public void setKronika(String kronika) {
        this.kronika = kronika;
    }

    public String getFrakcja() {
        return frakcja;
    }

    public void setFrakcja(String frakcja) {
        this.frakcja = frakcja;
    }

    public String getNazwaGrupy() {
        return nazwaGrupy;
    }

    public void setNazwaGrupy(String nazwaGrupy) {
        this.nazwaGrupy = nazwaGrupy;
    }

    public int getInteligencja() {
        return inteligencja;
    }

    public void setInteligencja(int inteligencja) {
        this.inteligencja = inteligencja;
    }

    public int getCzujnosc() {
        return czujnosc;
    }

    public void setCzujnosc(int czujnosc) {
        this.czujnosc = czujnosc;
    }

    public int getDeterminacja() {
        return determinacja;
    }

    public void setDeterminacja(int determinacja) {
        this.determinacja = determinacja;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public int getZrecznosc() {
        return zrecznosc;
    }

    public void setZrecznosc(int zrecznosc) {
        this.zrecznosc = zrecznosc;
    }

    public int getWytrzymalosc() {
        return wytrzymalosc;
    }

    public void setWytrzymalosc(int wytrzymalosc) {
        this.wytrzymalosc = wytrzymalosc;
    }

    public int getPrezentacja() {
        return prezentacja;
    }

    public void setPrezentacja(int prezentacja) {
        this.prezentacja = prezentacja;
    }

    public int getManipulacja() {
        return manipulacja;
    }

    public void setManipulacja(int manipulacja) {
        this.manipulacja = manipulacja;
    }

    public int getDedukcja() {
        return dedukcja;
    }

    public void setDedukcja(int dedukcja) {
        this.dedukcja = dedukcja;
    }

    public int getInformatyka() {
        return informatyka;
    }

    public void setInformatyka(int informatyka) {
        this.informatyka = informatyka;
    }

    public int getMedycyna() {
        return medycyna;
    }

    public void setMedycyna(int medycyna) {
        this.medycyna = medycyna;
    }

    public int getNauka() {
        return nauka;
    }

    public void setNauka(int nauka) {
        this.nauka = nauka;
    }

    public int getOkultyzm() {
        return okultyzm;
    }

    public void setOkultyzm(int okultyzm) {
        this.okultyzm = okultyzm;
    }

    public int getPolityka() {
        return polityka;
    }

    public void setPolityka(int polityka) {
        this.polityka = polityka;
    }

    public int getRzemioslo() {
        return rzemioslo;
    }

    public void setRzemioslo(int rzemioslo) {
        this.rzemioslo = rzemioslo;
    }

    public int getWyksztalcenie() {
        return wyksztalcenie;
    }

    public void setWyksztalcenie(int wyksztalcenie) {
        this.wyksztalcenie = wyksztalcenie;
    }

    public int getBijatyka() {
        return bijatyka;
    }

    public void setBijatyka(int bijatyka) {
        this.bijatyka = bijatyka;
    }

    public int getBronBiala() {
        return bronBiala;
    }

    public void setBronBiala(int bronBiala) {
        this.bronBiala = bronBiala;
    }

    public int getBronPalna() {
        return bronPalna;
    }

    public void setBronPalna(int bronPalna) {
        this.bronPalna = bronPalna;
    }

    public int getProwadzenie() {
        return prowadzenie;
    }

    public void setProwadzenie(int prowadzenie) {
        this.prowadzenie = prowadzenie;
    }

    public int getPrzetrwanie() {
        return przetrwanie;
    }

    public void setPrzetrwanie(int przetrwanie) {
        this.przetrwanie = przetrwanie;
    }

    public int getSkradanie() {
        return skradanie;
    }

    public void setSkradanie(int skradanie) {
        this.skradanie = skradanie;
    }

    public int getWysportowanie() {
        return wysportowanie;
    }

    public void setWysportowanie(int wysportowanie) {
        this.wysportowanie = wysportowanie;
    }

    public int getZlodziejstwo() {
        return zlodziejstwo;
    }

    public void setZlodziejstwo(int zlodziejstwo) {
        this.zlodziejstwo = zlodziejstwo;
    }

    public int getEkspresja() {
        return ekspresja;
    }

    public void setEkspresja(int ekspresja) {
        this.ekspresja = ekspresja;
    }

    public int getEmpatia() {
        return empatia;
    }

    public void setEmpatia(int empatia) {
        this.empatia = empatia;
    }

    public int getObycie() {
        return obycie;
    }

    public void setObycie(int obycie) {
        this.obycie = obycie;
    }

    public int getOszustwo() {
        return oszustwo;
    }

    public void setOszustwo(int oszustwo) {
        this.oszustwo = oszustwo;
    }

    public int getPreswazja() {
        return preswazja;
    }

    public void setPreswazja(int preswazja) {
        this.preswazja = preswazja;
    }

    public int getPolswiate() {
        return polswiate;
    }

    public void setPolswiate(int polswiate) {
        this.polswiate = polswiate;
    }

    public int getZatraszanie() {
        return zatraszanie;
    }

    public void setZatraszanie(int zatraszanie) {
        this.zatraszanie = zatraszanie;
    }

    public int getZwierzeta() {
        return zwierzeta;
    }

    public void setZwierzeta(int zwierzeta) {
        this.zwierzeta = zwierzeta;
    }

    public String getAt1Nazwa() {
        return at1Nazwa;
    }

    public void setAt1Nazwa(String at1Nazwa) {
        this.at1Nazwa = at1Nazwa;
    }

    public String getAt2Nazwa() {
        return at2Nazwa;
    }

    public void setAt2Nazwa(String at2Nazwa) {
        this.at2Nazwa = at2Nazwa;
    }

    public String getAt3Nazwa() {
        return at3Nazwa;
    }

    public void setAt3Nazwa(String at3Nazwa) {
        this.at3Nazwa = at3Nazwa;
    }

    public String getAt4Nazwa() {
        return at4Nazwa;
    }

    public void setAt4Nazwa(String at4Nazwa) {
        this.at4Nazwa = at4Nazwa;
    }

    public String getAt5Nazwa() {
        return at5Nazwa;
    }

    public void setAt5Nazwa(String at5Nazwa) {
        this.at5Nazwa = at5Nazwa;
    }

    public String getAt6Nazwa() {
        return at6Nazwa;
    }

    public void setAt6Nazwa(String at6Nazwa) {
        this.at6Nazwa = at6Nazwa;
    }

    public String getAt7Nazwa() {
        return at7Nazwa;
    }

    public void setAt7Nazwa(String at7Nazwa) {
        this.at7Nazwa = at7Nazwa;
    }

    public String getAt8Nazwa() {
        return at8Nazwa;
    }

    public void setAt8Nazwa(String at8Nazwa) {
        this.at8Nazwa = at8Nazwa;
    }

    public String getAt9Nazwa() {
        return at9Nazwa;
    }

    public void setAt9Nazwa(String at9Nazwa) {
        this.at9Nazwa = at9Nazwa;
    }

    public int getAt1Wartosc() {
        return at1Wartosc;
    }

    public void setAt1Wartosc(int at1Wartosc) {
        this.at1Wartosc = at1Wartosc;
    }

    public int getAt2Wartosc() {
        return at2Wartosc;
    }

    public void setAt2Wartosc(int at2Wartosc) {
        this.at2Wartosc = at2Wartosc;
    }

    public int getAt3Wartosc() {
        return at3Wartosc;
    }

    public void setAt3Wartosc(int at3Wartosc) {
        this.at3Wartosc = at3Wartosc;
    }

    public int getAt4Wartosc() {
        return at4Wartosc;
    }

    public void setAt4Wartosc(int at4Wartosc) {
        this.at4Wartosc = at4Wartosc;
    }

    public int getAt5Wartosc() {
        return at5Wartosc;
    }

    public void setAt5Wartosc(int at5Wartosc) {
        this.at5Wartosc = at5Wartosc;
    }

    public int getAt6Wartosc() {
        return at6Wartosc;
    }

    public void setAt6Wartosc(int at6Wartosc) {
        this.at6Wartosc = at6Wartosc;
    }

    public int getAt7Wartosc() {
        return at7Wartosc;
    }

    public void setAt7Wartosc(int at7Wartosc) {
        this.at7Wartosc = at7Wartosc;
    }

    public int getAt8Wartosc() {
        return at8Wartosc;
    }

    public void setAt8Wartosc(int at8Wartosc) {
        this.at8Wartosc = at8Wartosc;
    }

    public int getAt9Wartosc() {
        return at9Wartosc;
    }

    public void setAt9Wartosc(int at9Wartosc) {
        this.at9Wartosc = at9Wartosc;
    }

    public String getWada1Nazwa() {
        return wada1Nazwa;
    }

    public void setWada1Nazwa(String wada1Nazwa) {
        this.wada1Nazwa = wada1Nazwa;
    }

    public String getWada2Nazwa() {
        return wada2Nazwa;
    }

    public void setWada2Nazwa(String wada2Nazwa) {
        this.wada2Nazwa = wada2Nazwa;
    }

    public String getWada3Nazwa() {
        return wada3Nazwa;
    }

    public void setWada3Nazwa(String wada3Nazwa) {
        this.wada3Nazwa = wada3Nazwa;
    }

    public String getWada4Nazwa() {
        return wada4Nazwa;
    }

    public void setWada4Nazwa(String wada4Nazwa) {
        this.wada4Nazwa = wada4Nazwa;
    }

    public int getWada1Wartosc() {
        return wada1Wartosc;
    }

    public void setWada1Wartosc(int wada1Wartosc) {
        this.wada1Wartosc = wada1Wartosc;
    }

    public int getWada2Wartosc() {
        return wada2Wartosc;
    }

    public void setWada2Wartosc(int wada2Wartosc) {
        this.wada2Wartosc = wada2Wartosc;
    }

    public int getWada3Wartosc() {
        return wada3Wartosc;
    }

    public void setWada3Wartosc(int wada3Wartosc) {
        this.wada3Wartosc = wada3Wartosc;
    }

    public int getWada4Wartosc() {
        return wada4Wartosc;
    }

    public void setWada4Wartosc(int wada4Wartosc) {
        this.wada4Wartosc = wada4Wartosc;
    }

    public String getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(String rozmiar) {
        this.rozmiar = rozmiar;
    }

    public String getSzybkosc() {
        return szybkosc;
    }

    public void setSzybkosc(String szybkosc) {
        this.szybkosc = szybkosc;
    }

    public String getInicjatywa() {
        return inicjatywa;
    }

    public void setInicjatywa(String inicjatywa) {
        this.inicjatywa = inicjatywa;
    }

    public String getObrona() {
        return obrona;
    }

    public void setObrona(String obrona) {
        this.obrona = obrona;
    }

    public String getPancerz() {
        return pancerz;
    }

    public void setPancerz(String pancerz) {
        this.pancerz = pancerz;
    }

    public int getZdrowieMax() {
        return zdrowieMax;
    }

    public void setZdrowieMax(int zdrowieMax) {
        this.zdrowieMax = zdrowieMax;
    }

    public int getZdrowie() {
        return zdrowie;
    }

    public void setZdrowie(int zdrowie) {
        this.zdrowie = zdrowie;
    }

    public int getSilaWoliMax() {
        return silaWoliMax;
    }

    public void setSilaWoliMax(int silaWoliMax) {
        this.silaWoliMax = silaWoliMax;
    }

    public int getSilaWoli() {
        return silaWoli;
    }

    public void setSilaWoli(int silaWoli) {
        this.silaWoli = silaWoli;
    }

    public int getDoswiadczenie() {
        return doswiadczenie;
    }

    public void setDoswiadczenie(int doswiadczenie) {
        this.doswiadczenie = doswiadczenie;
    }

    public int getMoralnosc() {
        return moralnosc;
    }

    public void setMoralnosc(int moralnosc) {
        this.moralnosc = moralnosc;
    }

    public String getBron1Nazwa() {
        return bron1Nazwa;
    }

    public void setBron1Nazwa(String bron1Nazwa) {
        this.bron1Nazwa = bron1Nazwa;
    }

    public String getBron2Nazwa() {
        return bron2Nazwa;
    }

    public void setBron2Nazwa(String bron2Nazwa) {
        this.bron2Nazwa = bron2Nazwa;
    }

    public String getBron3Nazwa() {
        return bron3Nazwa;
    }

    public void setBron3Nazwa(String bron3Nazwa) {
        this.bron3Nazwa = bron3Nazwa;
    }

    public int getBron1Mod() {
        return bron1Mod;
    }

    public void setBron1Mod(int bron1Mod) {
        this.bron1Mod = bron1Mod;
    }

    public int getBron2Mod() {
        return bron2Mod;
    }

    public void setBron2Mod(int bron2Mod) {
        this.bron2Mod = bron2Mod;
    }

    public int getBron3Mod() {
        return bron3Mod;
    }

    public void setBron3Mod(int bron3Mod) {
        this.bron3Mod = bron3Mod;
    }

    public String getWyp1Nazwa() {
        return wyp1Nazwa;
    }

    public void setWyp1Nazwa(String wyp1Nazwa) {
        this.wyp1Nazwa = wyp1Nazwa;
    }

    public String getWyp2Nazwa() {
        return wyp2Nazwa;
    }

    public void setWyp2Nazwa(String wyp2Nazwa) {
        this.wyp2Nazwa = wyp2Nazwa;
    }

    public String getWyp3Nazwa() {
        return wyp3Nazwa;
    }

    public void setWyp3Nazwa(String wyp3Nazwa) {
        this.wyp3Nazwa = wyp3Nazwa;
    }

    public int getWyp1Mod() {
        return wyp1Mod;
    }

    public void setWyp1Mod(int wyp1Mod) {
        this.wyp1Mod = wyp1Mod;
    }

    public int getWyp2Mod() {
        return wyp2Mod;
    }

    public void setWyp2Mod(int wyp2Mod) {
        this.wyp2Mod = wyp2Mod;
    }

    public int getWyp3Mod() {
        return wyp3Mod;
    }

    public void setWyp3Mod(int wyp3Mod) {
        this.wyp3Mod = wyp3Mod;
    }

    public KartaPostaci(){}
    public KartaPostaci(int id, String imie, String wiek, String gracz, String koncept, String cnota, String skaza, String kronika, String frakcja, String nazwaGrupy,
                        int inteligencja, int czujnosc, int determinacja, int sila, int zrecznosc, int wytrzymalosc, int prezentacja, int manipulacja, int opanowanie,
                        int dedukcja, int informatyka, int medycyna, int nauka, int okultyzm, int rzemioslo, int polityka, int wyksztalcenie,
                        int bijatyka, int bronBiala, int bronPalna, int prowadzenie, int przetrwanie, int skradanie, int wysportowanie, int zlodziejstwo,
                        int ekspresja, int empatia, int obycie, int oszustwo, int preswazja, int polswiate, int zatraszanie, int zwierzeta,
                        String at1Nazwa, String at2Nazwa, String at3Nazwa, String at4Nazwa, String at5Nazwa, String at6Nazwa, String at7Nazwa, String at8Nazwa, String at9Nazwa,
                        int at1Wartosc, int at2Wartosc, int at3Wartosc, int at4Wartosc, int at5Wartosc, int at6Wartosc, int at7Wartosc, int at8Wartosc, int at9Wartosc,
                        String wada1Nazwa, String wada2Nazwa, String wada3Nazwa, String wada4Nazwa, int wada1Wartosc, int wada2Wartosc, int wada3Wartosc, int wada4Wartosc,
                        String rozmiar, String szybkosc, String inicjatywa, String obrona, String pancerz, int zdrowieMax,int silaWoliMax, int zdrowie, int silaWoli, int doswiadczenie, int moralnosc,
                        String bron1Nazwa, String bron2Nazwa, String bron3Nazwa, int bron1Mod, int bron2Mod, int bron3Mod,
                        String wyp1Nazwa, String wyp2Nazwa, String wyp3Nazwa, int wyp1Mod, int wyp2Mod, int wyp3Mod){
        this.id=id;
        this.imie=imie;
        this.wiek=wiek;
        this.gracz=gracz;
        this.koncept = koncept;
        this.cnota = cnota;
        this.skaza = skaza;
        this.kronika = kronika;
        this.frakcja = frakcja;
        this.nazwaGrupy = nazwaGrupy;
        this.inteligencja = inteligencja;
        this.czujnosc = czujnosc;
        this.determinacja = determinacja;
        this.sila = sila;
        this.zrecznosc = zrecznosc;
        this.wytrzymalosc = wytrzymalosc;
        this.prezentacja = prezentacja;
        this.manipulacja = manipulacja;
        this.opanowanie = opanowanie;
        this.dedukcja = dedukcja;
        this.informatyka = informatyka;
        this.medycyna = medycyna;
        this.nauka = nauka;
        this.okultyzm = okultyzm;
        this.rzemioslo = rzemioslo;
        this.polityka = polityka;
        this.wyksztalcenie = wyksztalcenie;
        this.bijatyka = bijatyka;
        this.bronBiala = bronBiala;
        this.bronPalna = bronPalna;
        this.prowadzenie = prowadzenie;
        this.przetrwanie = przetrwanie;
        this.skradanie = skradanie;
        this.wysportowanie = wysportowanie;
        this.zlodziejstwo = zlodziejstwo;
        this.ekspresja = ekspresja;
        this.empatia = empatia;
        this.obycie = obycie;
        this.oszustwo = oszustwo;
        this.preswazja = preswazja;
        this.polswiate = polswiate;
        this.zatraszanie = zatraszanie;
        this.zwierzeta = zwierzeta;
        this.at1Nazwa = at1Nazwa;
        this.at2Nazwa = at2Nazwa;
        this.at3Nazwa = at3Nazwa;
        this.at4Nazwa = at4Nazwa;
        this.at5Nazwa = at5Nazwa;
        this.at6Nazwa = at6Nazwa;
        this.at7Nazwa = at7Nazwa;
        this.at8Nazwa = at8Nazwa;
        this.at9Nazwa = at9Nazwa;
        this.at1Wartosc = at1Wartosc;
        this.at2Wartosc = at2Wartosc;
        this.at3Wartosc = at3Wartosc;
        this.at4Wartosc = at4Wartosc;
        this.at5Wartosc = at5Wartosc;
        this.at6Wartosc = at6Wartosc;
        this.at7Wartosc = at7Wartosc;
        this.at8Wartosc = at8Wartosc;
        this.at9Wartosc = at9Wartosc;
        this.wada1Nazwa = wada1Nazwa;
        this.wada2Nazwa = wada2Nazwa;
        this.wada3Nazwa = wada3Nazwa;
        this.wada4Nazwa = wada4Nazwa;
        this.wada1Wartosc = wada1Wartosc;
        this.wada2Wartosc = wada2Wartosc;
        this.wada3Wartosc = wada3Wartosc;
        this.wada4Wartosc = wada4Wartosc;
        this.rozmiar = rozmiar;
        this.szybkosc = szybkosc;
        this.inicjatywa = inicjatywa;
        this.obrona = obrona;
        this.pancerz = pancerz;
        this.zdrowieMax = zdrowieMax;
        this.zdrowie = zdrowie;
        this.silaWoliMax = silaWoliMax;
        this.silaWoli = silaWoli;
        this.doswiadczenie = doswiadczenie;
        this.moralnosc = moralnosc;
        this.bron1Nazwa = bron1Nazwa;
        this.bron2Nazwa = bron2Nazwa;
        this.bron3Nazwa = bron3Nazwa;
        this.bron1Mod = bron1Mod;
        this.bron2Mod = bron2Mod;
        this.bron3Mod = bron3Mod;
        this.wyp1Nazwa = wyp1Nazwa;
        this.wyp2Nazwa = wyp2Nazwa;
        this.wyp3Nazwa = wyp3Nazwa;
        this.wyp1Mod = wyp1Mod;
        this.wyp2Mod = wyp2Mod;
        this.wyp3Mod = wyp3Mod;
    }
    public List zwrocListe(){
        List<Object> lista= new ArrayList<Object>();
        lista.add(id);
        lista.add(imie);
        lista.add(wiek);
        lista.add(gracz);
        lista.add(koncept);
        lista.add(cnota);
        lista.add(skaza);
        lista.add(kronika);
        lista.add(frakcja);
        lista.add(nazwaGrupy);
        lista.add(inteligencja);
        lista.add(czujnosc);
        lista.add(determinacja);
        lista.add(sila);
        lista.add(zrecznosc);
        lista.add(wytrzymalosc);
        lista.add(prezentacja);
        lista.add(manipulacja);
        lista.add(opanowanie);
        lista.add(dedukcja);
        lista.add(informatyka);
        lista.add(medycyna);
        lista.add(nauka);
        lista.add(okultyzm);
        lista.add(polityka);
        lista.add(rzemioslo);
        lista.add(wyksztalcenie);
        lista.add(bijatyka);
        lista.add(bronBiala);
        lista.add(bronPalna);
        lista.add(prowadzenie);
        lista.add(przetrwanie);
        lista.add(skradanie);
        lista.add(wysportowanie);
        lista.add(zlodziejstwo);
        lista.add(ekspresja);
        lista.add(empatia);
        lista.add(obycie);
        lista.add(oszustwo);
        lista.add(preswazja);
        lista.add(polswiate);
        lista.add(zatraszanie);
        lista.add(zwierzeta);
        lista.add(at1Nazwa);
        lista.add(at2Nazwa);
        lista.add(at3Nazwa);
        lista.add(at4Nazwa);
        lista.add(at5Nazwa);
        lista.add(at6Nazwa);
        lista.add(at7Nazwa);
        lista.add(at8Nazwa);
        lista.add(at9Nazwa);
        lista.add(at1Wartosc);
        lista.add(at2Wartosc);
        lista.add(at3Wartosc);
        lista.add(at4Wartosc);
        lista.add(at5Wartosc);
        lista.add(at6Wartosc);
        lista.add(at7Wartosc);
        lista.add(at8Wartosc);
        lista.add(at9Wartosc);
        lista.add(wada1Nazwa);
        lista.add(wada2Nazwa);
        lista.add(wada3Nazwa);
        lista.add(wada4Nazwa);
        lista.add(wada1Wartosc);
        lista.add(wada2Wartosc);
        lista.add(wada3Wartosc);
        lista.add(wada4Wartosc);
        lista.add(rozmiar);
        lista.add(szybkosc);
        lista.add(inicjatywa);
        lista.add(obrona);
        lista.add(pancerz);
        lista.add(zdrowieMax);
        lista.add(silaWoliMax);
        lista.add(zdrowie);
        lista.add(silaWoli);
        lista.add(doswiadczenie);
        lista.add(moralnosc);
        lista.add(bron1Nazwa);
        lista.add(bron2Nazwa);
        lista.add(bron3Nazwa);
        lista.add(bron1Mod);
        lista.add(bron2Mod);
        lista.add(bron3Mod);
        lista.add(wyp1Nazwa);
        lista.add(wyp2Nazwa);
        lista.add(wyp3Nazwa);
        lista.add(wyp1Mod);
        lista.add(wyp2Mod);
        lista.add(wyp3Mod);



        return lista;
    }
    public String toString(){
        return " imie: "+imie;
    }

    public int getOpanowanie() {
        return opanowanie;
    }

    public void setOpanowanie(int opanowanie) {
        this.opanowanie = opanowanie;
    }
}

