package com.dummies.android.taskreminder;

import android.app.Fragment;
import android.content.Intent;

public class ReminderListActivity extends SingleFragmentActivity
        implements OnEditReminder {

    @Override
    protected Fragment newFragmentInstance() {
        return new ReminderListFragment();
    }

    @Override
    public void editReminder(long id) {
        startActivity(new Intent(this, ReminderEditActivity.class)
                .putExtra(
                        ReminderProvider.COLUMN_TASKID, id));
    }
}
