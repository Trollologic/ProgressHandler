package com.trollologic.progresshandlerlib;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;


/**
 * Created by Ivan on 20.8.2015..
 */
public class ProgressDialogFragment extends BaseDialogFragment {


    private static final String MESSAGE = "MESSAGE";

    public static ProgressDialogFragment newInstance(String message) {
        ProgressDialogFragment frag = new ProgressDialogFragment();
        Bundle args = new Bundle();
        args.putString(MESSAGE, message);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        LayoutInflater inflater = getActivity().getLayoutInflater();
        String message = getArguments().getString(MESSAGE);
        View dialogLayout;
        if(message != null){
            dialogLayout = inflater.inflate(R.layout.custom_progress_with_msg_layout, null);
            TextView progressMsg = (TextView) dialogLayout.findViewById(R.id.progress_message);
            progressMsg.setText(message);
        }else{
            dialogLayout = inflater.inflate(R.layout.custom_progress_layout_without_msg, null);
        }

        Dialog alertDialog = new AlertDialog.Builder(getActivity()).setView(dialogLayout).create();
        alertDialog.setCancelable(false);
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        return alertDialog;
    }

}