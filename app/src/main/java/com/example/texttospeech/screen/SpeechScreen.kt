package com.example.texttospeech.screen

import android.speech.tts.TextToSpeech
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun TextToSpeech() {
   var tts: TextToSpeech

    Box(
        modifier = Modifier.fillMaxSize().background(color = Color.Yellow),
    ) {
        Card() {
            Column {
                //CardHeadText()
                //SpeechTextField(name = a, onInputText = a)
                //SpeechStartButton {}

            }
        }
    }
}
