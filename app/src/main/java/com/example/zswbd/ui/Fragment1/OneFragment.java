package com.example.zswbd.ui.Fragment1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.zswbd.R;

public class OneFragment extends Fragment {

    private OneViewModel OneViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        OneViewModel =
                ViewModelProviders.of(this).get(OneViewModel.class);
        View root = inflater.inflate(R.layout.fragment_1, container, false);
//        final TextView textView = root.findViewById(R.id.text_1);
//        OneViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}
