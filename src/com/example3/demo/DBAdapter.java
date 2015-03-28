package com.example3.demo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBAdapter {	
	public static final String KEY_ROWID = "q_num" ;
	public static final String QUESTION  = "q_content";
	private static final String TAG = "DBAdapter" ;
	private static final String DATABASE_NAME = "user";
	private static final String DATABASE_TABLE ="question";
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_CREATE = "create table question(q_num integer primary key autoincrement,"
			                                     + "q_content text not null);";
    private DatabaseHelper DBHelper;
    private SQLiteDatabase db;
	private final Context context;
    public DBAdapter (Context con){
    	this.context = con;
    	DBHelper = new DatabaseHelper(context);
    }
    private static class DatabaseHelper extends SQLiteOpenHelper{
    	DatabaseHelper(Context context){
    		super(context,DATABASE_NAME,null,DATABASE_VERSION);
    	}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL(DATABASE_CREATE);
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			Log.w(TAG, "Upgrading database from version" + oldVersion + "to"
					+ newVersion + ",which will destory all old data");
			db.execSQL("DROP TABLE IF EXISTS titles");
			onCreate(db);
		}
    }
	//打开一个数据库
	public DBAdapter open() throws SQLException{
		db = DBHelper.getWritableDatabase();
		return this;	
	}
	//关闭一个数据库
    public void close(){
    	DBHelper.close();
    }
    //插入一行数据
    public void Insert(String q_content){
		ContentValues cv = new ContentValues();
		cv.put(QUESTION, q_content);
		db.insert(DATABASE_TABLE, null, cv);
    }
    //删除一行数据
    public boolean deleteRow(int q_num){
		db.delete(DATABASE_TABLE, KEY_ROWID + "=" + q_num, null);
    	return true;
    }
    //查询一行数据
    public Cursor getContent(int q_num) throws SQLException{
    	Cursor cs = db.query(DATABASE_TABLE, new String[]{KEY_ROWID,QUESTION},KEY_ROWID +"="+q_num,null,null,null,null,null);
		if(cs != null)
			cs.moveToFirst();
    	return cs;
    }
    //查询所有数据
    public Cursor getAContent() throws SQLException{
    	Cursor cs = db.query(DATABASE_TABLE, new String[]{KEY_ROWID,QUESTION},null,null,null,null,null);
    	return cs;
    }
    //更新一行数据
    public long update(int rowId, String q_content){
    	ContentValues cv = new ContentValues();
    	cv.put(QUESTION, q_content);
    	return db.update(DATABASE_TABLE,cv,KEY_ROWID + "=" +rowId,null);
    }
}
