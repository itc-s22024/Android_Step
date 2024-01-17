package jp.ac.it_college.std.s22007.android_step
import android.content.Context
import android.hardware.SensorManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import jp.ac.it_college.std.s22007.android_step.ui.theme.Android_StepTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
            Android_StepTheme {
                Navigation()
            }
        }
    }
}

//@Composable
//fun StepCounterDisplays(sensorManager: SensorManager) {
//    var stepCount by remember { mutableStateOf(0) }
//
//    DisposableEffect(sensorManager) {
//        val sensorEventListener = object : SensorEventListener {
//            override fun onSensorChanged(event: SensorEvent?) {
//                event?.let {
//                    if (it.sensor.type == Sensor.TYPE_STEP_COUNTER) {
//                        val steps = it.values[0].toInt()
//                        stepCount = steps
//                    }
//                }
//            }
//
//            override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}
//        }
//
//        val stepCounterSensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)
//        sensorManager.registerListener(sensorEventListener, stepCounterSensor, SensorManager.SENSOR_DELAY_NORMAL)
//
//        onDispose {
//            sensorManager.unregisterListener(sensorEventListener)
//        }
//    }
//    Text(text = "Steps: $stepCount")
//}