package domain.usecases

import domain.repositories.TextRepository

class GetSampleTextUseCase(
    private val repository: TextRepository,
): () -> String {
    override fun invoke(): String {
        return repository.getText()
    }
}