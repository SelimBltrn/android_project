package com.example.emilybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.emilybirthday.ui.theme.EmilyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmilyBirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White,
                ) {
                    HappyBirthdayImage()
                }
            }
        }
    }
}

@Composable
fun HappyBirthday(modifier: Modifier,
                  name: String = stringResource(R.string.happy_birthday_emily),
                  music: String = stringResource(R.string.press_me),
                  from: String = stringResource(R.string.with_love),
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier,
    ) {
        Text(
            text = name,
            fontSize = (48.sp),
            textAlign = TextAlign.Center,
            lineHeight = (62.sp),
            color = Color.Black,
        )
        Text(
            text = music,
            fontSize = (36.sp),
            textAlign = TextAlign.Center,
            color = Color.Magenta,

            )
        Text(
            text = from,
            fontSize = (12.sp),
            textAlign = TextAlign.Center,
            color = Color.Magenta,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
  }
@Composable
fun HappyBirthdayImage(modifier: Modifier = Modifier) {
    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(R.drawable.unicorn),
            contentDescription = stringResource(R.string.you_are_amazing),
            contentScale = ContentScale.FillHeight,
            alpha = 0.9F,
        )
        HappyBirthday(Modifier.padding(24.dp))
    }
}