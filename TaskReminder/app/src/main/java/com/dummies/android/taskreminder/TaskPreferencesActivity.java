package com.dummies.android.taskreminder;

import android.app.Fragment;

public class TaskPreferencesActivity extends SingleFragmentActivity {

    @Override
    protected Fragment newFragmentInstance() {
        return new TaskPreferencesFragment();
    }
}


