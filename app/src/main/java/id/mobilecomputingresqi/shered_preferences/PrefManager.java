package id.mobilecomputingresqi.shered_preferences;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {

    Context context;
    PrefManager(Context context) {
        this.context = context;
    }

    public static void clearLoggedInUser(Context baseContext) {
    }

    public void saveLoginDetails(String email, String password) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Email", email);
        editor.putString("Password", password);
        editor.commit();
    }

    public String String () {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        return sharedPreferences.getString("Email", "");
    }

}
