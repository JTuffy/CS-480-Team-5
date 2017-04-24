package com.example.tuffy_josh.termproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;


public class scheduleViewer extends AppCompatActivity{
    TextView B1A, B1B, B2A, B2B, B3A, B3B, B4A, B4B, B5A, B5B, B6A, B6B, B7A, B7B, B8A, B8B, B9A, B9B, B10A, B10B, B11A, B11B, B12A, B12B, B13A, B13B, B14A, B14B, B15A, B15B, B16A, B16B, ME, TE, WE, THE;

    private SQLiteDatabase db;
    private ContentValues values;
    private Cursor cursor;

    public static final String DATABASE_NAME = "classes.db";
    public static final String CREATE_TABLE = "CREATE TABLE LISTINGS (\n" +
            "      ClassID VarChar(8) NOT NULL,\n" +
            "      SectionID Varchar(4) NOT NULL,\n" +
            "      BlockPeriod Number(1) NOT NULL,\n" +
            "CONSTRAINT LISTINGS_PK primary key (ClassID, SectionID));\n";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_viewer);

        db = openOrCreateDatabase(DATABASE_NAME, Context.MODE_PRIVATE, null);
        db.execSQL("DROP TABLE IF EXISTS LISTINGS");
        db.execSQL(CREATE_TABLE);

        db.execSQL("INSERT INTO LISTINGS VALUES ('CS350', '002', 1);");
        db.execSQL("INSERT INTO LISTINGS VALUES ('CS350', '003', 1);");
        db.execSQL("INSERT INTO LISTINGS VALUES ('CS299', '003', 1);");

        String[] classes = {"CS350"};

      //  cursor = db.query("LISTINGS", new String[]{
     //                   "ClassID", "SectionID", "BlockPeriod"}, "ClassID", classes, null, null,
        //        "ClassID");


     //   while (cursor.moveToNext()) {
      //      String classID = cursor.getString(cursor.getColumnIndex("ClassID"));
     //       String sectionID = cursor.getString(cursor.getColumnIndex("SectionID"));
    //        int blockPeriod = cursor.getInt(cursor.getColumnIndex("BlockPeriod"));

    //        Toast.makeText(this, classID + " " + sectionID + " " + Integer.toString(blockPeriod), Toast.LENGTH_LONG)
  //                  .show();
   //     }
        ;

        //db.execSQL("Select * From LISTINGS WHERE ClassID = 'CS350';");


        TextView B1A = (TextView) findViewById(R.id.B1A);
        TextView B2A = (TextView) findViewById(R.id.B2A);
        TextView B3A = (TextView) findViewById(R.id.B3A);
        TextView B4A = (TextView) findViewById(R.id.B4A);
        TextView B5A = (TextView) findViewById(R.id.B5A);
        TextView B6A = (TextView) findViewById(R.id.B6A);
        TextView B7A = (TextView) findViewById(R.id.B7A);
        TextView B8A = (TextView) findViewById(R.id.B8A);
        TextView B9A = (TextView) findViewById(R.id.B9A);
        TextView B10A = (TextView) findViewById(R.id.B10A);
        TextView B11A = (TextView) findViewById(R.id.B11A);
        TextView B12A = (TextView) findViewById(R.id.B12A);
        TextView B13A = (TextView) findViewById(R.id.B13A);
        TextView B14A = (TextView) findViewById(R.id.B14A);
        TextView B15A = (TextView) findViewById(R.id.B15A);
        TextView B16A = (TextView) findViewById(R.id.B16A);
        TextView B1B = (TextView) findViewById(R.id.B1B);
        TextView B2B = (TextView) findViewById(R.id.B2B);
        TextView B3B = (TextView) findViewById(R.id.B3B);
        TextView B4B = (TextView) findViewById(R.id.B4B);
        TextView B5B = (TextView) findViewById(R.id.B5B);
        TextView B6B = (TextView) findViewById(R.id.B6B);
        TextView B7B = (TextView) findViewById(R.id.B7B);
        TextView B8B = (TextView) findViewById(R.id.B8B);
        TextView B9B = (TextView) findViewById(R.id.B9B);
        TextView B10B = (TextView) findViewById(R.id.B10B);
        TextView B11B = (TextView) findViewById(R.id.B11B);
        TextView B12B = (TextView) findViewById(R.id.B12B);
        TextView B13B = (TextView) findViewById(R.id.B13B);
        TextView B14B = (TextView) findViewById(R.id.B14B);
        TextView B15B = (TextView) findViewById(R.id.B15B);
        TextView B16B = (TextView) findViewById(R.id.B16B);
        TextView ME = (TextView) findViewById(R.id.ME);
        TextView TE = (TextView) findViewById(R.id.TE);
        TextView WE = (TextView) findViewById(R.id.WE);
        TextView THE = (TextView) findViewById(R.id.THE);

    }

    public void setB1(String in) {
        B1A.setText(in);
        B1B.setText(in);
    }

    public void setB2(String in) {
        B2A.setText(in);
        B2B.setText(in);
    }

    public void setB3(String in) {
        B3A.setText(in);
        B3B.setText(in);
    }

    public void setB4(String in) {
        B4A.setText(in);
        B4B.setText(in);
    }

    public void setB5(String in) {
        B5A.setText(in);
        B5B.setText(in);
    }

    public void setB6(String in) {
        B6A.setText(in);
        B6B.setText(in);
    }

    public void setB7(String in) {
        B7A.setText(in);
        B7B.setText(in);
    }

    public void setB8(String in) {
        B8A.setText(in);
        B8B.setText(in);
    }

    public void setB9(String in) {
        B9A.setText(in);
        B9B.setText(in);
    }

    public void setB10(String in) {
        B10A.setText(in);
        B10B.setText(in);
    }

    public void setB11(String in) {
        B11A.setText(in);
        B11B.setText(in);
    }

    public void setB12(String in) {
        B12A.setText(in);
        B12B.setText(in);
    }

    public void setB13(String in) {
        B13A.setText(in);
        B13B.setText(in);
    }

    public void setB14(String in) {
        B14A.setText(in);
        B14B.setText(in);
    }

    public void setB15(String in) {
        B15A.setText(in);
        B15B.setText(in);
    }

    public void setME(String in) {
        ME.setText(in);
    }

    public void setTE(String in) {
        TE.setText(in);
    }

    public void setWE(String in) {
        WE.setText(in);
    }

    public void setTHE(String in) {
        THE.setText(in);
    }



}

