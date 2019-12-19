package helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyHelper extends SQLiteOpenHelper
{
    private static final String databaseName = "DictionaryDB" ;
    private static final int dbVersion = 1 ;

    private static final String tblWord = "tblWord" ;
    private static final String WordID = "WordId" ;
    private static final String Word = "Word" ;
    private static final String Meaning = "Meaning" ;

    public MyHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + tblWord +
                "("
                + WordID + "  INTEGER PRIMARY KEY AUTOINCREMENT " +
                Word + "TEXT, "
                + Meaning + " TEXT " +
                ")" ;
        db.execSQL (query) ;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
