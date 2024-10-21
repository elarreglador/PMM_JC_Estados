import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.elarreglador.ud2_estados.StatefulCounter
import com.elarreglador.ud2_estados.WellnessTasksList

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList()
    }
}