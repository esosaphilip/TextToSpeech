package com.example.texttospeech

import android.speech.tts.TextToSpeech
import android.widget.Toast
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.util.Locale

class SpeechViewModel() : ViewModel() {

    private var _speechState = MutableStateFlow("")
    val uiState: StateFlow<String> = _speechState
    private lateinit var tts: TextToSpeech

    private fun speak(text: String) {
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, "")

    }

    fun collectSpeech(name: String){
        _speechState.value = speak(name)
    }
    fun onInit(status : Int)
    {
        if (status == TextToSpeech.SUCCESS)
        {
            val result = tts.setLanguage(Locale.US)

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED)
            {


            }else{

                tts.setSpeechRate(0.5f)//set the speech rate to 0.5
            }
        }else
        {

        }
    }


    fun onDestroy()
    {
        if(tts.isSpeaking)
            tts.stop()
        tts.shutdown()

    }
}
