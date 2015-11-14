package com.example.yushunzhe.crazybird;

/**
 * Created by yushunzhe on 15/11/12.
 */
public class RemindersDbAdapter {
    public static final String COL_ID = "_id";
    public static final String COL_CONTENT = "content";
    public static final String COL_IMPORTANT = "important";

    public static final int INDEX_ID = o;
    public static final int INDEX_CONTENT = INDEX_ID + 1;
    public static final int INDEX_IMPORTANT = INDEX_ID + 2;

    private static final String TAG = "RemindersDbAdapter";

    private DatabaseHelper mDbHelper;
    private SQLiteDatebase mDb;

    private static final String DATABASE_NAME = "dba_remdrs";
    private static final String TABLE_NAME = "tbl_remdrs";
    private static final int DATABASE_VERSION = 1;

    private final Context mCtx;

    //SQL statement used to create the database
    private static final String DATABASE_CREATE =
            "CREATE TABLE if not exists " + TABLE_NAME + " ( " +
                    COL_ID + " INTEGER PRIMARY KEY autoincrement, " +
                    COL_CONTENT + " TEXT, " + COL_IMPORTANT +
                    " INTEGER );";

}












