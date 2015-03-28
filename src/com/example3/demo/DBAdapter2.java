package com.example3.demo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBAdapter2 {
	public static final String KEY_ROWID = "q_num" ;
	public static final String A = "choice1";
	public static final String B = "choice2";
	public static final String C = "choice3";
	public static final String D = "choice4";
	private static final String TAG = "DBAdapter2" ;
	private static final String DATABASE_NAME = "user2";
	private static final String DATABASE_TABLE ="choice";
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_CREATE = "create table choice(q_num integer primary key autoincrement,"
			                  +"choice1 text not null,"+"choice2 text not null,"+"choice3 text not null,"+"choice4 text not null);";
    private final Context context;
    private DatabaseHelper DBHelper;
    private SQLiteDatabase db;
    public DBAdapter2 (Context con){
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
	public DBAdapter2 open() throws SQLException{
		db = DBHelper.getWritableDatabase();
		return this;	
	}
	//关闭一个数据库
    public void close(){
    	DBHelper.close();
    }
    //插入一行数据
    public void Insert(String choice1,String choice2,String choice3,String choice4){
		ContentValues cv = new ContentValues();
		cv.put(A, choice1);
		cv.put(B, choice2);
		cv.put(C, choice3);
		cv.put(D, choice4);
		db.insert(DATABASE_TABLE, null, cv);
    }
    //删除一行数据
    public boolean deleteRow(int q_num){
		db.delete(DATABASE_TABLE, KEY_ROWID + "=" + q_num, null);
    	return true;
    }
    //查询数据库
    public Cursor getContent(int q_num) throws SQLException{
    	Cursor cs = db.query(DATABASE_TABLE, new String[]{KEY_ROWID,A,B,C,D},KEY_ROWID +"="+q_num,null,null,null,null,null);
		if(cs != null)
			cs.moveToFirst();
    	return cs;
    }
    //查询所有数据
    public Cursor getAContent() throws SQLException{
    	Cursor cs = db.query(DATABASE_TABLE, new String[]{KEY_ROWID,A,B,C,D},null,null,null,null,null);
    	return cs;
    }
    //更新一行数据
    public long update(int rowId, String choice1,String choice2,String choice3,String choice4){
    	ContentValues cv = new ContentValues();
    	cv.put(A, choice1);
    	cv.put(B, choice2);
    	cv.put(C, choice3);
    	cv.put(D, choice4);
    	return db.update(DATABASE_TABLE,cv,KEY_ROWID + "=" +rowId,null);
    }
}
