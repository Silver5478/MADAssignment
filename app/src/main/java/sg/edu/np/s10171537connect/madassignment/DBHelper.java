package sg.edu.np.s10171537connect.madassignment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "questionDB.db";
    public static final String TABLE_QUESTIONS = "questions";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_QUESTION = "question";
    public static final String COLUMN_ANSWER = "answer";
    public static final String COLUMN_TYPE = "type";

    public DBHelper(Context context, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_QUESTIONS
                + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_QUESTION + " TEXT, "
                + COLUMN_ANSWER + " TEXT, "
                + COLUMN_TYPE + " TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUESTIONS);
        onCreate(db);
    }

    public void deleteAll() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_QUESTIONS);
    }

    public void addQuestion(Question question) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_QUESTION, question.getQuestion());
        values.put(COLUMN_ANSWER, question.getQCanswer());
        values.put(COLUMN_TYPE, question.getQType());
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_QUESTIONS, null, values);
        db.close();
    }

    public void updateQuestion(Question question) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_QUESTION, question.getQuestion());
        values.put(COLUMN_ANSWER, question.getQCanswer());
        values.put(COLUMN_TYPE, question.getQType());
        SQLiteDatabase db = this.getWritableDatabase();
        //db.update(TABLE_QUESTIONS,values, COLUMN_ID + " = ?", new String[] { String.valueOf(question.getId()) } );
        db.close();
    }

    public Question findQuestion(String type) {
        String query = "SELECT * FROM " + TABLE_QUESTIONS + " WHERE "
                + COLUMN_TYPE
                + " = \"" + type + "\"";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Question q = new Question();

        if (cursor.moveToFirst()) {
            q.setId(Integer.parseInt(cursor.getString(0)));
            q.setQuestion(cursor.getString(1));
            q.setQCanswer(cursor.getString(2));
            q.setQType(cursor.getString(3));
            cursor.close();
        } else {
            q = null;
        }
        db.close();
        return q;
    }

    public Question getRandomQuestionByType(String type) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_QUESTIONS + " WHERE "
                + COLUMN_TYPE
                + " = \"" + type + "\" ORDER BY RANDOM() LIMIT 1", null);

        Question q = new Question();
        if (cursor.moveToFirst()) {
            q.setId(Integer.parseInt(cursor.getString(0)));
            q.setQuestion(cursor.getString(1));
            q.setQCanswer(cursor.getString(2));
            q.setQType(cursor.getString(3));
            cursor.close();
        } else {
            q = null;
        }
        db.close();
        return q;
    }

    public boolean deleteQuestion(int id) {
        SQLiteDatabase db = this.getWritableDatabase();

        return db.delete(TABLE_QUESTIONS, COLUMN_ID + " = ", new String[] { id + "" }) !=0 ;

    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_QUESTIONS,null);
        return res;
    }

    public Boolean dbEmpty() {
        return !getAllData().moveToFirst();
    }
}
