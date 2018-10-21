package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

public class SettingsFragment extends PreferenceFragmentCompat {

// TODO (5) In SettingsFragment's onCreatePreferences method add the preference file using the
    // addPreferencesFromResource method
    public void onCreatePreferences(Bundle bundle, String s){
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
