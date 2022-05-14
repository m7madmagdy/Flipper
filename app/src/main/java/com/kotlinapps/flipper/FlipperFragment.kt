package com.kotlinapps.flipper

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.kotlinapps.flipper.GridFlipper.gridImage
import com.kotlinapps.flipper.databinding.FragmentFlipperBinding

class FlipperFragment : Fragment() {
    private lateinit var binding: FragmentFlipperBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFlipperBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        for (imageFlipper in gridImage) {
            setFlipperImage(imageFlipper)
        }
    }

    private fun setFlipperImage(res: Int) {
        val image = ImageView(context)
        image.setBackgroundResource(res)
        binding.viewFlip.addView(image)
        binding.viewFlip.flipInterval = 3000
        binding.viewFlip.isAutoStart = true
    }
}