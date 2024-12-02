package com.airbnb.lottie.issues.compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieClipSpec
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

class ComposeIssueReproActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }

    @Composable
    fun Content() {
        Column {
            val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.star))
            LottieAnimation(
                composition = composition,
                clipSpec = LottieClipSpec.Marker(marker = "anim1"),
                iterations = LottieConstants.IterateForever
            )
            LottieAnimation(
                composition = composition,
                clipSpec = LottieClipSpec.Marker(marker = "idle1"),
                iterations = LottieConstants.IterateForever
            )
        }
    }
}
