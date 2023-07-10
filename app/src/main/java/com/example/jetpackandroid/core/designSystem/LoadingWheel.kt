package com.example.jetpackandroid.core.designSystem

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

private const val ROTATION_TIME = 12000
private const val NUM_OF_LINES = 12

@Composable
fun SyhLoadingWheel(
    contentDesc: String,
    modifier: Modifier = Modifier,
) {
    /*val infiniteTransition = rememberInfiniteTransition()

    val startValue = if (LocalInspectionMode.current) 0F else 1F
    val floatAnimValues = (0 until NUM_OF_LINES).map { remember { Animatable(startValue) } }

    val rotationAnim by infiniteTransition.animateFloat(
        initialValue = 0F,
        targetValue = 360F,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = ROTATION_TIME, easing = LinearEasing),
        ),
    )

    Canvas(
        modifier = modifier
            .size(48.dp)
            .padding(8.dp)
            .graphicsLayer { rotationZ = rotationAnim }
            .semantics { contentDescription = contentDesc }
            .testTag("loadingWheel"),
    ) {
        repeat(NUM_OF_LINES) { index ->
            rotate(degrees = index * 30f) {
                drawLine(
                    color = Black,
                    alpha = if (floatAnimValues[index].value < 1f) 1f else 0f,
                    strokeWidth = 4F,
                    cap = StrokeCap.Round,
                    start = Offset(size.width / 2, size.height / 4),
                    end = Offset(size.width / 2, floatAnimValues[index].value * size.height / 4),
                )
            }
        }
    };*/
}