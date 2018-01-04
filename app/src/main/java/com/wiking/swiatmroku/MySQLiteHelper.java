package com.wiking.swiatmroku;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Wiking on 02.01.2018.
 * crud w oparciu o http://hmkcode.com/android-simple-sqlite-database-tutorial/
 */


public class MySQLiteHelper extends SQLiteOpenHelper {
    //Statyczne klasy
    private  static final String columns[] = {"id", "imie", "wiek","gracz","koncept","cnota","skaza","kronika","frakcja","nazwaGrupy",
            "inteligencja","czujnosc","determinacja","sila","zrecznosc","wytrzymalosc","prezentacja","manipulacja",
            "dedukcja","informatyka","medycyna","nauka","okultyzm","polityka","rzemioslo","wyksztalcenie",
            "bijatyka","bronBiala","bronPalna","prowadzenie","przetrwanie","skradanie","wysportowanie","zlodziejstwo",
            "ekspresja","empatia","obycie","oszustwo","preswazja","polswiate","zatraszanie","zwierzeta",
            "at1Nazwa","at2Nazwa","at3Nazwa","at4Nazwa","at5Nazwa","at6Nazwa","at7Nazwa","at8Nazwa","at9Nazwa",
            "at1Wartosc","at2Wartosc","at3Wartosc","at4Wartosc","at5Wartosc","at6Wartosc","at7Wartosc","at8Wartosc","at9Wartosc",
            "wada1Nazwa","wada2Nazwa","wada3Nazwa","wada4Nazwa","wada1Wartosc","wada2Wartosc","wada3Wartosc","wada4Wartosc",
            "rozmiar","szybkosc","inicjatywa","obrona","pancerz","zdrowieMax","silaWoliMax","zdrowie","silaWoli","doswiadczenie","moralnosc",
            "bron1Nazwa","bron2Nazwa","bron3Nazwa","bron1Mod","bron2Mod","bron3Mod",
            "wyp1Nazwa","wyp2Nazwa","wyp3Nazwa","wyp1Mod","wyp2Mod","wyp3Mod"};
    private  static  final String TABLE_KARTY_POSTACI= "table_KP";
    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "KartyPostaci";

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // SQL statement to create book table
        String CREATE_KP_TABLE = "CREATE TABLE table_KP ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "imie TEXT, wiek TEXT, gracz TEXT,koncept TEXT,cnota TEXT,skaza TEXT,kronika TEXT,frakcja TEXT,nazwaGrupy TEXT," +
                "inteligencja INTEGER,czujnosc INTEGER,determinacja INTEGER,sila INTEGER,zrecznosc INTEGER,wytrzymalosc INTEGER,prezentacja INTEGER,manipulacja INTEGER," +
                "dedukcja INTEGER,informatyka INTEGER,medycyna INTEGER,nauka INTEGER,okultyzm INTEGER,polityka INTEGER,rzemioslo INTEGER,wyksztalcenie INTEGER," +
                "bijatyka INTEGER,bronBiala INTEGER,bronPalna INTEGER,prowadzenie INTEGER,przetrwanie INTEGER,skradanie INTEGER,wysportowanie INTEGER,zlodziejstwo INTEGER," +
                "ekspresja INTEGER,empatia INTEGER,obycie INTEGER,oszustwo INTEGER,preswazja INTEGER,polswiate INTEGER,zatraszanie INTEGER,zwierzeta INTEGER," +
                "at1Nazwa TEXT,at2Nazwa TEXT,at3Nazwa TEXT,at4Nazwa TEXT,at5Nazwa TEXT,at6Nazwa TEXT,at7Nazwa TEXT,at8Nazwa TEXT,at9Nazwa TEXT," +
                "at1Wartosc INTEGER,at2Wartosc INTEGER,at3Wartosc INTEGER,at4Wartosc INTEGER,at5Wartosc INTEGER,at6Wartosc INTEGER,at7Wartosc INTEGER,at8Wartosc INTEGER,at9Wartosc INTEGER," +
                "wada1Nazwa TEXT,wada2Nazwa TEXT,wada3Nazwa TEXT,wada4Nazwa TEXT,wada1Wartosc ,wada2Wartosc,wada3Wartosc,wada4Wartosc," +
                "rozmiar TEXT,szybkosc TEXT,inicjatywa TEXT,obrona TEXT,pancerz TEXT,zdrowieMax INTEGER ,silaWoliMax INTEGER ,zdrowie INTEGER,silaWoli INTEGER,doswiadczenie INTEGER,moralnosc INTEGER," +
                "bron1Nazwa TEXT,bron2Nazwa TEXT,bron3Nazwa TEXT,bron1Mod INTEGER,bron2Mod INTEGER,bron3Mod INTEGER," +
                "wyp1Nazwa TEXT,wyp2Nazwa TEXT,wyp3Nazwa TEXT,wyp1Mod INTEGER,wyp2Mod INTEGER,wyp3Mod INTEGER,author TEXT )";

        // create books table
        db.execSQL(CREATE_KP_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older books table if existed
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_KARTY_POSTACI);

        // create fresh books table
        this.onCreate(db);
    }
    public void addKP(KartaPostaci KP){
        //for logging
        Log.d("addKP", KP.toString());

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. create ContentValues to add key "column"/value
        ContentValues values = new ContentValues();
       // List<Object> lista=KP.zwrocListe();
        values.put(columns[1], KP.getImie()); // get title
        values.put(columns[2], KP.getWiek());
        values.put(columns[3], KP.getGracz());
        values.put(columns[4], KP.getKoncept());
        values.put(columns[5], KP.getCnota());
        values.put(columns[6], KP.getSkaza());
        values.put(columns[7], KP.getKronika());
        values.put(columns[8], KP.getFrakcja());
        values.put(columns[9], KP.getNazwaGrupy());

        values.put(columns[10], KP.getInteligencja());
        values.put(columns[11], KP.getCzujnosc());
        values.put(columns[12], KP.getDeterminacja());
        values.put(columns[13], KP.getSila());
        values.put(columns[14], KP.getZrecznosc());
        values.put(columns[15], KP.getWytrzymalosc());
        values.put(columns[16], KP.getPreswazja());
        values.put(columns[17], KP.getManipulacja());

        values.put(columns[18], KP.getDedukcja());
        values.put(columns[19], KP.getInformatyka());
        values.put(columns[20], KP.getMedycyna());
        values.put(columns[21], KP.getNauka());
        values.put(columns[22], KP.getOkultyzm());
        values.put(columns[23], KP.getPolityka());
        values.put(columns[24], KP.getRzemioslo());
        values.put(columns[25], KP.getWyksztalcenie());

        values.put(columns[26], KP.getBijatyka());
        values.put(columns[27], KP.getBronBiala());
        values.put(columns[28], KP.getBronPalna());
        values.put(columns[29], KP.getProwadzenie());
        values.put(columns[30], KP.getPrzetrwanie());
        values.put(columns[31], KP.getSkradanie());
        values.put(columns[32], KP.getWysportowanie());
        values.put(columns[33], KP.getZlodziejstwo());

        values.put(columns[34], KP.getEkspresja());
        values.put(columns[35], KP.getEmpatia());
        values.put(columns[36], KP.getObycie());
        values.put(columns[37], KP.getOszustwo());
        values.put(columns[38], KP.getPreswazja());
        values.put(columns[39], KP.getPolswiate());
        values.put(columns[40], KP.getZatraszanie());
        values.put(columns[41], KP.getZwierzeta());

        values.put(columns[42], KP.getAt1Nazwa());
        values.put(columns[43], KP.getAt2Nazwa());
        values.put(columns[44], KP.getAt3Nazwa());
        values.put(columns[45], KP.getAt4Nazwa());
        values.put(columns[46], KP.getAt5Nazwa());
        values.put(columns[47], KP.getAt6Nazwa());
        values.put(columns[48], KP.getAt7Nazwa());
        values.put(columns[49], KP.getAt8Nazwa());
        values.put(columns[50], KP.getAt9Nazwa());

        values.put(columns[51], KP.getAt1Wartosc());
        values.put(columns[52], KP.getAt2Wartosc());
        values.put(columns[53], KP.getAt3Wartosc());
        values.put(columns[54], KP.getAt4Wartosc());
        values.put(columns[55], KP.getAt5Wartosc());
        values.put(columns[56], KP.getAt6Wartosc());
        values.put(columns[57], KP.getAt7Wartosc());
        values.put(columns[58], KP.getAt8Wartosc());
        values.put(columns[59], KP.getAt9Wartosc());

        values.put(columns[60], KP.getWada1Nazwa());
        values.put(columns[61], KP.getWada2Nazwa());
        values.put(columns[62], KP.getWada3Nazwa());
        values.put(columns[63], KP.getWada4Nazwa());
        values.put(columns[64], KP.getWada1Wartosc());
        values.put(columns[65], KP.getWada2Wartosc());
        values.put(columns[66], KP.getWada3Wartosc());
        values.put(columns[67], KP.getWada4Wartosc());

        values.put(columns[68], KP.getRozmiar());
        values.put(columns[69], KP.getSzybkosc());
        values.put(columns[70], KP.getInicjatywa());
        values.put(columns[71], KP.getObrona());
        values.put(columns[72], KP.getPancerz());
        values.put(columns[73], KP.getZdrowieMax());
        values.put(columns[74], KP.getSilaWoliMax());
        values.put(columns[75], KP.getZdrowie());
        values.put(columns[76], KP.getSilaWoli());
        values.put(columns[77], KP.getDoswiadczenie());
        values.put(columns[78], KP.getMoralnosc());

        values.put(columns[79], KP.getBron1Nazwa());
        values.put(columns[80], KP.getBron2Nazwa());
        values.put(columns[81], KP.getBron3Nazwa());
        values.put(columns[82], KP.getBron1Mod());
        values.put(columns[83], KP.getBron2Mod());
        values.put(columns[84], KP.getBron3Mod());

        values.put(columns[85], KP.getWyp1Nazwa());
        values.put(columns[86], KP.getWyp2Nazwa());
        values.put(columns[87], KP.getWyp3Nazwa());
        values.put(columns[88], KP.getWyp1Mod());
        values.put(columns[89], KP.getWyp2Mod());
        values.put(columns[90], KP.getWyp3Mod());


        // 3. insert
        db.insert(TABLE_KARTY_POSTACI, // table
                null, //nullColumnHack
                values); // key/value -> keys = column names/ values = column values

        // 4. close
        db.close();
    }
    public KartaPostaci getKP(int id){

        // 1. get reference to readable DB
        SQLiteDatabase db = this.getReadableDatabase();

        // 2. build query
        Cursor cursor =
                db.query(TABLE_KARTY_POSTACI, // a. table
                        columns, // b. column names
                        " id = ?", // c. selections
                        new String[] { String.valueOf(id) }, // d. selections args
                        null, // e. group by
                        null, // f. having
                        null, // g. order by
                        null); // h. limit

        // 3. if we got results get the first one
        if (cursor != null)
            cursor.moveToFirst();

        // 4. build book object
        KartaPostaci KP = new KartaPostaci();
        KP.setId(Integer.parseInt(cursor.getString(0)));
        KP.setImie(cursor.getString(1));
        KP.setWiek(cursor.getString(2));
        KP.setGracz(cursor.getString(3));
        KP.setKoncept(cursor.getString(4));
        KP.setCnota(cursor.getString( 5));
        KP.setSkaza(cursor.getString(6));
        KP.setKronika(cursor.getString( 7));
        KP.setFrakcja(cursor.getString( 8));
        KP.setNazwaGrupy(cursor.getString( 9));

        KP.setInteligencja(Integer.parseInt(cursor.getString(10 )));
        KP.setCzujnosc(Integer.parseInt(cursor.getString( 11)));
        KP.setDeterminacja(Integer.parseInt(cursor.getString(12 )));
        KP.setSila(Integer.parseInt(cursor.getString(13 )));
        KP.setZrecznosc(Integer.parseInt(cursor.getString(14 )));
        KP.setWytrzymalosc(Integer.parseInt(cursor.getString( 15)));
        KP.setPreswazja(Integer.parseInt(cursor.getString( 16)));
        KP.setManipulacja(Integer.parseInt(cursor.getString( 17)));

        KP.setDedukcja(Integer.parseInt(cursor.getString(18 )));
        KP.setInformatyka(Integer.parseInt(cursor.getString( 19)));
        KP.setMedycyna(Integer.parseInt(cursor.getString(20 )));
        KP.setNauka(Integer.parseInt(cursor.getString( 21)));
        KP.setOkultyzm(Integer.parseInt(cursor.getString( 22)));
        KP.setPolityka(Integer.parseInt(cursor.getString( 23)));
        KP.setRzemioslo(Integer.parseInt(cursor.getString( 24)));
        KP.setWyksztalcenie(Integer.parseInt(cursor.getString( 25)));

        KP.setBijatyka(Integer.parseInt(cursor.getString( 26)));
        KP.setBronBiala(Integer.parseInt(cursor.getString( 27)));
        KP.setBronPalna(Integer.parseInt(cursor.getString( 28)));
        KP.setProwadzenie(Integer.parseInt(cursor.getString( 29)));
        KP.setPrzetrwanie(Integer.parseInt(cursor.getString( 30)));
        KP.setSkradanie(Integer.parseInt(cursor.getString( 31)));
        KP.setWysportowanie(Integer.parseInt(cursor.getString(32 )));
        KP.setZlodziejstwo(Integer.parseInt(cursor.getString( 33)));

        KP.setEkspresja(Integer.parseInt(cursor.getString( 34)));
        KP.setEmpatia(Integer.parseInt(cursor.getString( 35)));
        KP.setObycie(Integer.parseInt(cursor.getString(36 )));
        KP.setOszustwo(Integer.parseInt(cursor.getString(37 )));
        KP.setPreswazja(Integer.parseInt(cursor.getString( 38)));
        KP.setPolswiate(Integer.parseInt(cursor.getString( 39)));
        KP.setZatraszanie(Integer.parseInt(cursor.getString( 40)));
        KP.setZwierzeta(Integer.parseInt(cursor.getString( 41)));

        KP.setAt1Nazwa(cursor.getString( 42));
        KP.setAt2Nazwa(cursor.getString( 43));
        KP.setAt3Nazwa(cursor.getString( 44));
        KP.setAt4Nazwa(cursor.getString( 45));
        KP.setAt5Nazwa(cursor.getString( 46));
        KP.setAt6Nazwa(cursor.getString( 47));
        KP.setAt7Nazwa(cursor.getString( 48));
        KP.setAt8Nazwa(cursor.getString( 49));
        KP.setAt9Nazwa(cursor.getString( 50));

        KP.setAt1Wartosc(Integer.parseInt(cursor.getString( 51)));
        KP.setAt2Wartosc(Integer.parseInt(cursor.getString(52 )));
        KP.setAt3Wartosc(Integer.parseInt(cursor.getString(53 )));
        KP.setAt4Wartosc(Integer.parseInt(cursor.getString( 54)));
        KP.setAt5Wartosc(Integer.parseInt(cursor.getString( 55)));
        KP.setAt6Wartosc(Integer.parseInt(cursor.getString(56 )));
        KP.setAt7Wartosc(Integer.parseInt(cursor.getString( 57)));
        KP.setAt8Wartosc(Integer.parseInt(cursor.getString(58 )));
        KP.setAt9Wartosc(Integer.parseInt(cursor.getString(59 )));

        KP.setWada1Nazwa(cursor.getString(60 ));
        KP.setWada2Nazwa(cursor.getString( 61));
        KP.setWada3Nazwa(cursor.getString( 62));
        KP.setWada4Nazwa(cursor.getString(63 ));
        KP.setWada1Wartosc(Integer.parseInt(cursor.getString(64 )));
        KP.setWada2Wartosc(Integer.parseInt(cursor.getString( 65)));
        KP.setWada3Wartosc(Integer.parseInt(cursor.getString( 66)));
        KP.setWada4Wartosc(Integer.parseInt(cursor.getString( 67)));

        KP.setRozmiar(cursor.getString( 68));
        KP.setSzybkosc(cursor.getString(69 ));
        KP.setInicjatywa(cursor.getString( 70));
        KP.setObrona(cursor.getString( 71));
        KP.setPancerz(cursor.getString(72 ));
        KP.setZdrowieMax(Integer.parseInt(cursor.getString( 73)));
        KP.setSilaWoliMax(Integer.parseInt(cursor.getString( 74)));
        KP.setZdrowie(Integer.parseInt(cursor.getString(75 )));
        KP.setSilaWoli(Integer.parseInt(cursor.getString(76 )));
        KP.setDoswiadczenie(Integer.parseInt(cursor.getString(77 )));
        KP.setMoralnosc(Integer.parseInt(cursor.getString( 78)));
        KP.setBron1Nazwa(cursor.getString( 79));
        KP.setBron2Nazwa(cursor.getString( 80));
        KP.setBron3Nazwa(cursor.getString( 81));
        KP.setBron1Mod(Integer.parseInt(cursor.getString( 82)));
        KP.setBron2Mod(Integer.parseInt(cursor.getString( 83)));
        KP.setBron3Mod(Integer.parseInt(cursor.getString( 84)));
        KP.setWyp1Nazwa(cursor.getString( 85));
        KP.setWyp2Nazwa(cursor.getString( 86));
        KP.setWyp3Nazwa(cursor.getString( 87));
        KP.setWyp1Mod(Integer.parseInt(cursor.getString( 88)));
        KP.setWyp2Mod(Integer.parseInt(cursor.getString( 89)));
        KP.setWyp3Mod(Integer.parseInt(cursor.getString( 90)));



        //log
        Log.d("getKP("+id+")", KP.toString());

        // 5. return book
        return KP;
    }
    public List<KartaPostaci> getAllKP() {
        List<KartaPostaci> KPs = new LinkedList<KartaPostaci>();

        // 1. build the query
        String query = "SELECT  * FROM " + TABLE_KARTY_POSTACI;

        // 2. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        // 3. go over each row, build book and add it to list
        KartaPostaci KP = null;
        if (cursor.moveToFirst()) {
            do {
                KP = new KartaPostaci();
                KP = getKP(Integer.parseInt(cursor.getString(0)));
               // Add kp to kps
                KPs.add(KP);
            } while (cursor.moveToNext());
        }

        Log.d("getAllBooks()", KPs.toString());

        // return books
        return KPs;
    }
    public int updateKP(KartaPostaci KP) {

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. create ContentValues to add key "column"/value
        ContentValues values = new ContentValues();
        values.put(columns[1], KP.getImie()); // get title
        values.put(columns[2], KP.getWiek());
        values.put(columns[3], KP.getGracz());
        values.put(columns[4], KP.getKoncept());
        values.put(columns[5], KP.getCnota());
        values.put(columns[6], KP.getSkaza());
        values.put(columns[7], KP.getKronika());
        values.put(columns[8], KP.getFrakcja());
        values.put(columns[9], KP.getNazwaGrupy());

        values.put(columns[10], KP.getInteligencja());
        values.put(columns[11], KP.getCzujnosc());
        values.put(columns[12], KP.getDeterminacja());
        values.put(columns[13], KP.getSila());
        values.put(columns[14], KP.getZrecznosc());
        values.put(columns[15], KP.getWytrzymalosc());
        values.put(columns[16], KP.getPreswazja());
        values.put(columns[17], KP.getManipulacja());

        values.put(columns[18], KP.getDedukcja());
        values.put(columns[19], KP.getInformatyka());
        values.put(columns[20], KP.getMedycyna());
        values.put(columns[21], KP.getNauka());
        values.put(columns[22], KP.getOkultyzm());
        values.put(columns[23], KP.getPolityka());
        values.put(columns[24], KP.getRzemioslo());
        values.put(columns[25], KP.getWyksztalcenie());

        values.put(columns[26], KP.getBijatyka());
        values.put(columns[27], KP.getBronBiala());
        values.put(columns[28], KP.getBronPalna());
        values.put(columns[29], KP.getProwadzenie());
        values.put(columns[30], KP.getPrzetrwanie());
        values.put(columns[31], KP.getSkradanie());
        values.put(columns[32], KP.getWysportowanie());
        values.put(columns[33], KP.getZlodziejstwo());

        values.put(columns[34], KP.getEkspresja());
        values.put(columns[35], KP.getEmpatia());
        values.put(columns[36], KP.getObycie());
        values.put(columns[37], KP.getOszustwo());
        values.put(columns[38], KP.getPreswazja());
        values.put(columns[39], KP.getPolswiate());
        values.put(columns[40], KP.getZatraszanie());
        values.put(columns[41], KP.getZwierzeta());

        values.put(columns[42], KP.getAt1Nazwa());
        values.put(columns[43], KP.getAt2Nazwa());
        values.put(columns[44], KP.getAt3Nazwa());
        values.put(columns[45], KP.getAt4Nazwa());
        values.put(columns[46], KP.getAt5Nazwa());
        values.put(columns[47], KP.getAt6Nazwa());
        values.put(columns[48], KP.getAt7Nazwa());
        values.put(columns[49], KP.getAt8Nazwa());
        values.put(columns[50], KP.getAt9Nazwa());

        values.put(columns[51], KP.getAt1Wartosc());
        values.put(columns[52], KP.getAt2Wartosc());
        values.put(columns[53], KP.getAt3Wartosc());
        values.put(columns[54], KP.getAt4Wartosc());
        values.put(columns[55], KP.getAt5Wartosc());
        values.put(columns[56], KP.getAt6Wartosc());
        values.put(columns[57], KP.getAt7Wartosc());
        values.put(columns[58], KP.getAt8Wartosc());
        values.put(columns[59], KP.getAt9Wartosc());

        values.put(columns[60], KP.getWada1Nazwa());
        values.put(columns[61], KP.getWada2Nazwa());
        values.put(columns[62], KP.getWada3Nazwa());
        values.put(columns[63], KP.getWada4Nazwa());
        values.put(columns[64], KP.getWada1Wartosc());
        values.put(columns[65], KP.getWada2Wartosc());
        values.put(columns[66], KP.getWada3Wartosc());
        values.put(columns[67], KP.getWada4Wartosc());

        values.put(columns[68], KP.getRozmiar());
        values.put(columns[69], KP.getSzybkosc());
        values.put(columns[70], KP.getInicjatywa());
        values.put(columns[71], KP.getObrona());
        values.put(columns[72], KP.getPancerz());
        values.put(columns[73], KP.getZdrowieMax());
        values.put(columns[74], KP.getSilaWoliMax());
        values.put(columns[75], KP.getZdrowie());
        values.put(columns[76], KP.getSilaWoli());
        values.put(columns[77], KP.getDoswiadczenie());
        values.put(columns[78], KP.getMoralnosc());

        values.put(columns[79], KP.getBron1Nazwa());
        values.put(columns[80], KP.getBron2Nazwa());
        values.put(columns[81], KP.getBron3Nazwa());
        values.put(columns[82], KP.getBron1Mod());
        values.put(columns[83], KP.getBron2Mod());
        values.put(columns[84], KP.getBron3Mod());

        values.put(columns[85], KP.getWyp1Nazwa());
        values.put(columns[86], KP.getWyp2Nazwa());
        values.put(columns[87], KP.getWyp3Nazwa());
        values.put(columns[88], KP.getWyp1Mod());
        values.put(columns[89], KP.getWyp2Mod());
        values.put(columns[90], KP.getWyp3Mod());


        // 3. updating row
        int i = db.update(TABLE_KARTY_POSTACI,//table
                values, // column/value
                "id"+" = ?", // selections
                new String[] { String.valueOf(KP.getId()) }); //selection args

        // 4. close
        db.close();

        return i;

    }
    public void deleteKP(KartaPostaci KP) {

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. delete
        db.delete(TABLE_KARTY_POSTACI, //table name
                "id"+" = ?",  // selections
                new String[] { String.valueOf(KP.getId()) }); //selections args

        // 3. close
        db.close();

        //log
        Log.d("deleteBook", KP.toString());

    }
}
