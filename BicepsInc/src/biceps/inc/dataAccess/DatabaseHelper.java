package biceps.inc.dataAccess;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// TODO: This whole class is just copied from:
// http://developer.android.com/guide/topics/data/data-storage.html#filesInternal
// As an option for accessing SQLLite as a data persistence option. No clue if this is a good idea or not.

public class DatabaseHelper extends SQLiteOpenHelper {

	private static final String KEY_WORD = "PlaceHolderValue"; // TODO: Take this from a config file?
	private static final String KEY_DEFINITION = "PlaceHolderValue"; // TODO: Take this from a config file?
	private static final String DATABASE_NAME = "PlaceHolderValue"; // TODO: Take this from a config file?
	
    private static final int DATABASE_VERSION = 2; // 
    private static final String DICTIONARY_TABLE_NAME = "dictionary";
    private static final String DICTIONARY_TABLE_CREATE =
                "CREATE TABLE " + DICTIONARY_TABLE_NAME + " (" +
                KEY_WORD + " TEXT, " +
                KEY_DEFINITION + " TEXT);";

    DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DICTIONARY_TABLE_CREATE);
    }

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub		
	}
}
