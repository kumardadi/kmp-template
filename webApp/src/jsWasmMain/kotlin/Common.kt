import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.khudama.kmptemplate.style.TemplateTheme
import com.khudama.kmptemplate.TemplateCommon

@Composable
internal fun TemplateWeb() {
    TemplateTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            TemplateCommon()
        }
    }
}