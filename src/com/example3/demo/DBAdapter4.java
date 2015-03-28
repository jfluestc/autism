package com.example3.demo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBAdapter4 {
	public static final String KEY_ROWID = "num";
	public static final String TITLE = "title";
	public static final String CONTENT = "content";
	private static final String TAG="DBAdapter4";
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME="user4";
	private static final String DATABASE_TABLE = "proabdjoke";
	private static final String CREATE_TABLE="create table proabdjoke(num integer primary key autoincrement,"
			+ "title text not null,content text not null);";
	
	DataBaseHelper DBhelper;
	private final Context context;
	private SQLiteDatabase db;
	public DBAdapter4(Context con){
		context = con;
		DBhelper = new DataBaseHelper(context);
	}
	
	public class DataBaseHelper extends SQLiteOpenHelper{

		public DataBaseHelper(Context context) {
			super(context, DATABASE_NAME,null , DATABASE_VERSION);
			// TODO Auto-generated constructor stub
		}
		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL(CREATE_TABLE);
		}
		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			Log.w(TAG, "Upgrading database from Version"+oldVersion+"to"+newVersion
					+"which will destory all old data");
			db.execSQL("DROP TABLE IF EXITES titles");
			onCreate(db);
		}
	}
	
	public DBAdapter4 open(){
		db = DBhelper.getWritableDatabase();
		return this;
	}
	
	public boolean close(){
		DBhelper.close();
		return true;
	}
	
	public boolean insert(String titles,String content){
		ContentValues cv = new ContentValues();
		cv.put(TITLE, titles);
		cv.put(CONTENT, content);
		db.insert(DATABASE_TABLE, null, cv);
		return true;
	}
	public boolean delete(int num){
		db.delete(DATABASE_NAME, KEY_ROWID + "="+num, null);
		return true;
	}
	
    public Cursor findContent(int num) throws SQLException{
    	Cursor cs = db.query(DATABASE_TABLE, new String[]{KEY_ROWID,TITLE,CONTENT},KEY_ROWID +"="+num,null,null,null,null,null);
		if(cs != null)
			cs.moveToFirst();
    	return cs;
    }
	public Cursor findall() throws SQLException{
		Cursor cs = db.query(DATABASE_TABLE, new String[]{KEY_ROWID,TITLE,CONTENT}, null, null, null,null, null);
		return cs;
	}
	public Cursor selectContent(int m){
		Cursor cs = db.query(DATABASE_TABLE, new String[]{KEY_ROWID,TITLE,CONTENT},m+ "<" + KEY_ROWID ,null,null, null,null, null);
		return cs;
	}
	
}
