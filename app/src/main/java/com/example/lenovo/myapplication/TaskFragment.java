package com.example.lenovo.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Lenovo on 11-Dec-17.
 */

public class TaskFragment extends DialogFragment {
    private EditText mEditText;
        private final String LOG_TAG = TaskFragment.class.getSimpleName();

        // onCreate --> (onCreateDialog) --> onCreateView --> onActivityCreated
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            Log.v(LOG_TAG, "onCreateView");

            return null;
        }


    public void show(FragmentManager fm, String fragment) {

    }
}
