package dev.arack.enlace.iam.infrastructure.controllers;

import dev.arack.enlace.iam.application.dto.request.UserRequest;
import dev.arack.enlace.iam.application.core.managers.AuthManager;
import dev.arack.enlace.iam.application.dto.response.AuthResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/auth", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "User Access Controller", description = "API for authentication operations")
public class AuthRestController {

    private final AuthManager userDetailsService;

    @Transactional
    @PostMapping(value = "/sign-up")
    @Operation(
            summary = "Sign up a new user",
            description = "Sign up a new user by providing the user's details"
    )
    public ResponseEntity<AuthResponse> signup(@Valid @RequestBody UserRequest userRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userDetailsService.signup(userRequest));
    }

//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @Transactional
    @PostMapping(value = "/log-in")
    @Operation(
            summary = "Log in a user",
            description = "Log in a user by providing the user's credentials"
    )
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody UserRequest userRequest) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userDetailsService.login(userRequest));
    }
}
