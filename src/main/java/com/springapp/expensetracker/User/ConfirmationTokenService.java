package com.springapp.expensetracker.User;

import java.util.Optional;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
class ConfirmationTokenService {
	
	private final ConfirmationTokenRepository confirmationTokenRepository;
	
	void saveConfirmationToken(ConfirmationToken confirmationToken) {
		confirmationTokenRepository.save(confirmationToken);
	}
	
	void deleteConfirmationToken(Long id) {
		confirmationTokenRepository.deleteById(id);
	}

	Optional<ConfirmationToken> findConfirmationTokenByToken(String token) {
		
		return confirmationTokenRepository.findConfirmationTokenByConfirmationToken(token);
	}
}
