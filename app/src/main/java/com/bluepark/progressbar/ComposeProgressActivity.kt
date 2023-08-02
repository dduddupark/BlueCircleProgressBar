package com.bluepark.progressbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.bluepark.progressbar.ui.theme.BlueSemiCircleProgressBarTheme
import com.bluepark.progressbar.ui.theme.Pink40
import com.bluepark.progressbar.ui.theme.Pink80
import com.bluepark.progressbar.ui.theme.Purple40
import com.bluepark.progressbar.ui.theme.Purple80
import com.bluepark.progressbar.ui.theme.PurpleGrey40
import com.bluepark.progressbar.ui.theme.PurpleGrey80
import com.bluepark.semicircleprogressbar.CircleArcProgressBar
import com.bluepark.semicircleprogressbar.Shape

class ComposeProgressActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlueSemiCircleProgressBarTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text(text = "Compose")
                    ProgressBar()
                }
            }
        }
    }
}

@Composable
fun ProgressBar() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .wrapContentHeight(align = Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        AndroidView(
            modifier = Modifier
                .width(200.dp)
                .height(120.dp),
            factory = { context ->
                CircleArcProgressBar(context).apply {
                    setRounded(false)
                    setShape(Shape.Half)
                    setPercent(50)
                    setProgressBarColor(Pink80.toArgb())
                    setProgressBarWidth(50)
                    setProgressPlaceHolderColor(Pink40.toArgb())
                    setProgressPlaceHolderWidth(35)
                }
            }
        )

        Spacer(modifier = Modifier.padding(20.dp))

        AndroidView(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp),
            factory = { context ->
                CircleArcProgressBar(context).apply {
                    setRounded(true)
                    setShape(Shape.Unfinished)
                    setPercent(30)
                    setProgressBarColor(Purple80.toArgb())
                    setProgressBarWidth(50)
                    setProgressPlaceHolderColor(Purple40.toArgb())
                    setProgressPlaceHolderWidth(15)
                }
            }
        )

        AndroidView(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp),
            factory = { context ->
                CircleArcProgressBar(context).apply {
                    setShape(Shape.Complete)
                    setPercent(60)
                    setProgressBarColor(PurpleGrey80.toArgb())
                    setProgressBarWidth(80)
                    setProgressPlaceHolderColor(PurpleGrey40.toArgb())
                    setProgressPlaceHolderWidth(35)
                }
            }
        )

    }
}
