import androidx.compose.runtime.Composable
import domain.usecases.GetSampleTextUseCase

actual fun getPlatformName(): String = "Android"

@Composable fun MainView(getSampleTextUseCase: GetSampleTextUseCase) = App(getSampleTextUseCase)
