package com.example.galsdev.volleyjsongals;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 * Created by galsdev on 6/23/2016.
 */
public class ParseJSON {
    public static String[] ids;
    public static String[] names;
    public static String[] emails;

//    public static final String JSON_ARRAY = "result";
    public static final String KEY_ID = "login";
    public static final String KEY_NAME = "id";
    public static final String KEY_EMAIL = "url";

    private JSONArray users = null;

    private String json;

    public ParseJSON(String json){
        this.json = json;
    }

    protected void parseJSON(){
        JSONObject jsonObject=null;
        try {
            users = new JSONArray(json);

            ids = new String[users.length()];
            names = new String[users.length()];
            emails = new String[users.length()];

            for(int i=0;i<users.length();i++){
                JSONObject jo = users.getJSONObject(i);
                ids[i] = jo.getString(KEY_ID);
                names[i] = jo.getString(KEY_NAME);
                emails[i] = jo.getString(KEY_EMAIL);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
