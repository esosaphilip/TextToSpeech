package com.example.texttospeech.screen

import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun CardHeadText() {
    Text(
        text = "Text To Speech",
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        color = Color.Black,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpeechTextField(
    name: String,
    onInputText: (String) -> Unit,
) {
    OutlinedTextField(value = name, onValueChange = onInputText)
}

@Composable
fun SpeechStartButton(onStartSpeech: () -> Unit) {
    Button(onClick = onStartSpeech) {
        Text(text = "Start Speak", color = Color.Yellow)
    }
}
