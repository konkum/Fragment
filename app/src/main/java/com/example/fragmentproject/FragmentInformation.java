package com.example.fragmentproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FragmentInformation extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.information_form, container, false);
        ImageView userImage = v.findViewById(R.id.photo_user);
        TextView nameText = v.findViewById(R.id.name_user);
        TextView goodAtText = v.findViewById(R.id.user_good_at);
        userImage.setImageResource(R.drawable.player);
        nameText.setText("Họ và tên: Vũ Anh Quân");
        goodAtText.setText("Tôi tốt ở mọi thứ");
        return v;
    }
}
