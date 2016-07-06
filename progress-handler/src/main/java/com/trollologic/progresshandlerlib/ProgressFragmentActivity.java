package com.trollologic.progresshandlerlib;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

/**
 * Created by miroslav on 14.06.16..
 */
public class ProgressFragmentActivity extends FragmentActivity {

    private static final String TAG = ProgressFragmentActivity.class.getSimpleName();


    private View.OnClickListener mOnClickListener;
    private ProgressDialogFragment progress;

    /**
     * Method for showing progress
     * @param message if sett as null just progress will be shown
     */
    public void showProgress(String message){
        progress = ProgressDialogFragment.newInstance(message);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(progress, null);
        ft.commitAllowingStateLoss();
    }

    /**
     * Method for hiding progress
     */
    public void hideProgress(){
        if(progress != null){
            progress.dismissAllowingStateLoss();
        }
    }

    /**
     * Method for fetching progress dialog
     * @return ProgressDialogFragment
     */
    public ProgressDialogFragment getProgressDialog(){
        return progress;
    }
}
