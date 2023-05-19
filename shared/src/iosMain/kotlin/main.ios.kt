import androidx.compose.ui.window.ComposeUIViewController
import domain.usecases.GetSampleTextUseCase

actual fun getPlatformName(): String = "iOS"

fun MainViewController(getSampleTextUseCase: GetSampleTextUseCase) =
    ComposeUIViewController { App(getSampleTextUseCase) }
