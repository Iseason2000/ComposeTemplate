import androidx.compose.material.MaterialTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import top.iseason.common.App

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        MaterialTheme {
            App()
        }
    }
}