package com.kotlinapps.flipper;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.kotlinapps.flipper.databinding.FragmentFlipperBinding;

public class FlipperFragment extends Fragment {
    FragmentFlipperBinding binding;

    int[] gallery_grid_Images = {R.drawable.fun, R.drawable.lawyer, R.drawable.women, R.drawable.birds,
            R.drawable.teachers, R.drawable.tools, R.drawable.x_rays, R.drawable.vet_doc};

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFlipperBinding.inflate(getLayoutInflater());

        for (int gallery_grid_image : gallery_grid_Images) {
            setFlipperImage(gallery_grid_image);
        }

        return binding.getRoot();
    }

    private void setFlipperImage(int res) {
        Log.i("Set Flipper Called", res + "");
        ImageView image = new ImageView(getContext());
        image.setBackgroundResource(res);
        binding.viewFlip.addView(image);
        binding.viewFlip.setFlipInterval(3000);
        binding.viewFlip.setAutoStart(true);
    }
}